package com.danilobuchner.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.danilobuchner.cards.entity.Transaction;
import com.danilobuchner.cards.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired(required = true)
	private TransactionService transactionService;

	@GetMapping(value = "/transaction/{transacId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Transaction getTransaction(@PathVariable("transacId") long transacId) {
		System.out.println("calling get Transaction method");
		return transactionService.getTransaction(transacId);

	}
	@PostMapping("/addtransaction")	
	public Transaction addTransaction(@RequestBody Transaction transac) {
		System.out.println("calling add transaction method " + transac.getTransact_desc());
		transac = transactionService.addTransaction(transac);
		return transac;
	}
	

	@PutMapping("/transaction/{id}")
	public Transaction updatePayment(@RequestBody Transaction transac) {

		if (transac.getTransact_id() > 0) {
			transac = transactionService.addTransaction(transac);
		} else {
			// add code
		}
		return transac;
	}	
	
	@CrossOrigin
	@GetMapping(value = "/listAll", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Transaction> getAll() {
		return transactionService.listAllTransactions();
		

	}
}