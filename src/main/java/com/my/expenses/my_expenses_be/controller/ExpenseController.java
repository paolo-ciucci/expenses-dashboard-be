package com.my.expenses.my_expenses_be.controller;

import com.my.expenses.my_expenses_be.entity.Expense;
import com.my.expenses.my_expenses_be.service.interfaces.ExpenseService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "api/expense")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ExpenseController {

private ExpenseService expenseService;

public ExpenseController (ExpenseService expenseService) {
    this.expenseService = expenseService;
}

    @GetMapping(path = "/all")
    public @ResponseBody
    ResponseEntity<Iterable<Expense>> getAllExpenses() {

        return ResponseEntity.ok().body(expenseService.findAll());
    }

    @GetMapping(value = "/all_by_year")
    public ResponseEntity<Iterable<Expense>> getAllByYear(@RequestParam("anno") Integer anno) {
        return ResponseEntity.ok().body(expenseService.findAllByAnno(anno));
    }

    @GetMapping(value = "/all_by_year_and_month")
    public ResponseEntity<Iterable<Expense>> getAllByYearAndMonth(@RequestParam("anno") Integer anno, @RequestParam("mese") String mese) {
        return ResponseEntity.ok().body(expenseService.findAllByMeseAndAnno(mese, anno));
    }
}
