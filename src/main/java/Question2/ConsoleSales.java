/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 * Abstract base class managing internal storage fields and partial IConsole contract logic.
 */
public abstract class ConsoleSales implements IConsole {
    // Protected variables accessible by extending subclasses
    protected String consoleType;
    protected String storeName;
    protected double totalSalesAmount;

    // Abstract operational method that subclasses must implement
    public abstract void printReport();

    @Override
    public String getConsoleType() {
        return this.consoleType;
    }

    @Override
    public String getStoreName() {
        return this.storeName;
    }

    @Override
    public double getTotalSales() {
        return this.totalSalesAmount;
    }
}
