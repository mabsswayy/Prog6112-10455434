/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

import java.util.Scanner;

/**
 * Orchestrator class holding the main loop runtime infrastructure.
 */
public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Console Device Sales Tracking Application (Java)");
        System.out.println("-----------------------------------------\n");

        // Action Item 1: Prompt console options input mapping selection 
        System.out.println("Select a Console Device:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter choice (1-3): ");
        String choice = scanner.nextLine();

        String selectedConsole;
        switch (choice) {
            case "1" -> selectedConsole = "PlayStation 5";
            case "2" -> selectedConsole = "Xbox Series X";
            case "3" -> selectedConsole = "Nintendo Switch";
            default -> selectedConsole = "Custom/Unknown Console";
        }

        // Action Item 2: Capture Target Store Name String
        System.out.print("Enter the Store Name: ");
        String storeNameInput = scanner.nextLine();

        // Action Item 3: Validate text to double casting parameters input loops
        double salesAmountInput = 0;
        boolean isValidAmount = false;

        while (!isValidAmount) {
            System.out.print("Enter the Total Amount of Sales ($): ");
            String amountText = scanner.nextLine();

            try {
                salesAmountInput = Double.parseDouble(amountText);
                if (salesAmountInput >= 0) {
                    isValidAmount = true;
                } else {
                    System.out.println("Invalid amount. Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid numeric formatting string. Try again.");
            }
        }

        // Instantiation profile reference allocation
        Consolesale salesReport = new Consolesale(selectedConsole, storeNameInput, salesAmountInput);

        // Printing visual reporting layout metrics execution
        salesReport.printReport();

        System.out.println("Application executed successfully. Closing runtime terminal handles.");
        scanner.close();
    }
}
