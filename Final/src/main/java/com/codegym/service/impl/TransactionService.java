package com.codegym.service.impl;

import com.codegym.model.Transaction;
import com.codegym.repository.ITransactionRepository;
import com.codegym.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionService implements ITransactionService {
    @Autowired private ITransactionRepository iTransactionRepository;
    @Override
    public List<Transaction> findAll() {
        return iTransactionRepository.findAll();
    }

    @Override
    public void create(Transaction transaction) {
        iTransactionRepository.save(transaction);
    }

    @Override
    public Transaction findById(int id) {
        return iTransactionRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(int id) {
        iTransactionRepository.deleteById(id);
    }
}
