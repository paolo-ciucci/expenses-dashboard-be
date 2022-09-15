package com.my.expenses.my_expenses_be.service.interfaces;

import com.my.expenses.my_expenses_be.entity.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpenseService {

    List<Expense> findAll();

    List<Expense> findAllByMeseAndAnno(String mese, Integer anno);

    List<Expense> findAllByAnno(Integer anno);

    List<Expense> findAllByImportoGreaterThan(Double value);

    List<Expense> findAllByImportoLessThan(Double value);

    List<Expense> findAllByImportoGreaterThanAndImportoLessThan(Double min, Double max);
}
