package com.danilobuchner.cards.service;

import java.util.List;

import com.danilobuchner.cards.entity.Transaction;

public interface TransactionService {
	
	public Transaction addTransaction(Transaction transaction);
	public Transaction updateStatus(Transaction transaction);
	public Transaction getTransaction(long transacId);
	public List<Transaction> listAllTransactions();

}
