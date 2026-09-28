/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
package com.store;

/**
 * Concrete implementation that builds the console transaction context and provides localized reporting.
 */
public class ConsoleSale extends ConsoleSales {

    // Subclass constructor mapping execution metrics directly into the abstract base fields
    public ConsoleSale String consoleType, String storeName, double totalSalesAmount) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSalesAmount = totalSalesAmount;
    }

    // Concrete execution logic for generating the command-line display summary
    @Override
    public void printReport() {
        System.out.println("\n====================================");
        System.out.println("        ELECTRONIC STORE REPORT     ");
        System.out.println("====================================");
        System.out.println("Store Name:   " + getStoreName());
        System.out.println("Console Type: " + getConsoleType());
        System.out.printf("Total Sales:  $%,.2f\n", getTotalSales());
        System.out.println("====================================\n");
    }
}
