package com.my.expenses.my_expenses_be.service;

import com.my.expenses.my_expenses_be.entity.Expense;
import com.my.expenses.my_expenses_be.repository.ExpenseRepository;
import com.my.expenses.my_expenses_be.service.interfaces.ExpenseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseRepository expenseRepo;

    public ExpenseServiceImpl(ExpenseRepository expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    @Override
    public List<Expense> findAll() {
        return this.expenseRepo.findAll();
    }

    @Override
    public List<Expense> findAllByMeseAndAnno(String mese, Integer anno) {
        return this.expenseRepo.findAllByMeseAndAnno(mese, anno);
    }

    @Override
    public List<Expense> findAllByAnno(Integer anno) {
        return this.expenseRepo.findAllByAnno(anno);
    }

    @Override
    public List<Expense> findAllByImportoGreaterThan(Double value) {
        return this.expenseRepo.findAllByImportoGreaterThan(value);
    }

    @Override
    public List<Expense> findAllByImportoLessThan(Double value) {
        return this.expenseRepo.findAllByImportoLessThan(value);
    }

    @Override
    public List<Expense> findAllByImportoGreaterThanAndImportoLessThan(Double min, Double max) {
        return this.expenseRepo.findAllByImportoGreaterThanAndImportoLessThan(min, max);
    }
}
