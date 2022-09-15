package com.my.expenses.my_expenses_be.repository;

import com.my.expenses.my_expenses_be.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findAll();

    List<Expense> findAllByMeseAndAnno(String mese, Integer anno);

    List<Expense> findAllByAnno(Integer anno);

    List<Expense> findAllByImportoGreaterThan(Double value);

    List<Expense> findAllByImportoLessThan(Double value);

    List<Expense> findAllByImportoGreaterThanAndImportoLessThan(Double min, Double max);
}
