package com.danilobuchner.cards.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.danilobuchner.cards.entity.Transaction;

@Repository
public class TransactionDAOImpl implements TransactionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Transaction addTransaction(Transaction transaction) {
		sessionFactory.getCurrentSession().save(transaction);
		return transaction;
	}

	@Override
	public Transaction updateStatus(Transaction transaction) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction_new = session.byId(Transaction.class).load(transaction.getTransact_id());
		transaction_new.setTransact_amount(transaction.getTransact_amount());;
		transaction_new.setTransact_cc_number(transaction.getTransact_cc_number());
		transaction_new.setTransact_date_time(transaction.getTransact_date_time());
		transaction_new.setTransact_desc(transaction.getTransact_desc());
		transaction_new.setTransact_type(transaction.getTransact_type());
		session.flush();
		//sessionFactory.getCurrentSession().update(transaction);
		return null;
	}

	@Override
	public Transaction getTransaction(long transacId) {
		return sessionFactory.getCurrentSession().get(Transaction.class, transacId);
	}

	@Override
	public List<Transaction> listAllTransactions() {

		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Transaction> cq = cb.createQuery(Transaction.class);
		Root<Transaction> root = cq.from(Transaction.class);
		cq.select(root);
		Query<Transaction> query = session.createQuery(cq);

		return query.getResultList();
	}

	/*
	 * 
	 * @Override public void delete(long id) { Session session =
	 * sessionFactory.getCurrentSession(); Book book =
	 * session.byId(Book.class).load(id); session.delete(book); }
	 */

}
