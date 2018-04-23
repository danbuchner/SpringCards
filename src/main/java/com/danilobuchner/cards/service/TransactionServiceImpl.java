package com.danilobuchner.cards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danilobuchner.cards.dao.TransactionDAO;
import com.danilobuchner.cards.entity.Transaction;


@Service
@Transactional(readOnly=true)
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionDAO transactionDAO;
	
	@Transactional
	@Override
	public Transaction addTransaction(Transaction transaction) {
		return transactionDAO.addTransaction(transaction);		
	}
	
	@Transactional
	@Override
	public Transaction updateStatus(Transaction transaction) {
		return transactionDAO.updateStatus(transaction);
	}

	@Override
	public Transaction getTransaction(long transacId) {
		return transactionDAO.getTransaction(transacId);
	}

	@Override
	public List<Transaction> listAllTransactions() {
		return transactionDAO.listAllTransactions();
	}

	

}
