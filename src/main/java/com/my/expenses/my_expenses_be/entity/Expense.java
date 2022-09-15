package com.my.expenses.my_expenses_be.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "total_expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "data_contabile")
    private Date dataContabile;

    @Column(name = "data_valuta")
    private Date dataValuta;

    private Double importo;

    @Column(name = "divisa")
    private String valuta;

    @Column(name = "causale_descrizione")
    private String causale;

    private String stato;

    private String canale;

    @Column(name = "sheet")
    private String mese;

    @Column(name= "year")
    private Integer anno;


}
