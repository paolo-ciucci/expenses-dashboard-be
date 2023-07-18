package com.my.expenses.my_expenses_be.repository;

import com.my.expenses.my_expenses_be.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findAll();

    List<Expense> findAllByMeseAndAnno(String mese, Integer anno);

    List<Expense> findAllByAnno(Integer anno);

    List<Expense> findAllByImportoGreaterThan(Double value);

    List<Expense> findAllByImportoLessThan(Double value);

    List<Expense> findAllByImportoGreaterThanAndImportoLessThan(Double min, Double max);

    @Query(value = "SELECT e FROM Expense e WHERE e.anno = :anno and e.mese = :mese and (lower(e.causale) not like '%paolo ciucci%' and lower(e.causale) not like '%ciucci paolo%')")
    List<Expense> getDetailByMonth_own_transactions_excluded(@Param(value = "mese") String mese, @Param(value="anno") Integer anno);

}
