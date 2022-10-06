package com.codegym.service;

import com.codegym.model.Transaction;

import java.util.List;

public interface ITransactionService {
    List<Transaction> findAll();
    void create(Transaction transaction);
    Transaction findById(int id);
    void delete(int id);
}
