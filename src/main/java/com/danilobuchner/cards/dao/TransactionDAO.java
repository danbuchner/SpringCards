package com.danilobuchner.cards.dao;

import java.util.List;

import com.danilobuchner.cards.entity.Transaction;

public interface TransactionDAO {
	
	public Transaction addTransaction(Transaction transaction);
	public Transaction updateStatus(Transaction transaction);
	public Transaction getTransaction(long transacId);
	public List<Transaction> listAllTransactions();

}
