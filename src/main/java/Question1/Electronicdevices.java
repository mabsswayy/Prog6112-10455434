/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

public class Electronicdevices{

    public static void main(String[] args) {
        // Define the cities and consoles
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PlayStation", "Xbox", "Switch"};

        // 2D Array  Rows of represent Cities, Columns represent Consoles
        // sales[city][console]
        int[][] sales = {
            {1000, 2000, 3000}, // Cape town: PS, Xbox, Switch
            {2000, 3000, 4000}, // Port: PS, Xbox, Switch
            {1500, 1100, 1200}    // Pretoria: PS, Xbox, Switch
        };

        // Arrays to store calculated totals
        int[] cityTotals = new int[cities.length];
        int[] consoleTotals = new int[consoles.length];
        int grandTotal = 0;

        // Perform calculations
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                cityTotals[i] += sales[i][j];
                consoleTotals[j] += sales[i][j];
                grandTotal += sales[i][j];
            }
        }

        // Print Report Header
        System.out.println("=====================================================================");
        System.out.println("                    GAMING CONSOLE REPORT                     ");
        System.out.println("=====================================================================");
        System.out.printf("%-15s %-12s %-12s %-12s %-12s\n", "City", "PlayStation", "Xbox", "Switch", "Total");
        System.out.println("---------------------------------------------------------------------");

        // Print Rows (Data and City Totals)
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-15s %-12d %-12d %-12d %-12d\n", 
                cities[i], sales[i][0], sales[i][1], sales[i][2], cityTotals[i]);
        }

        // Print Columns (Console Totals and Grand Total)
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-15s %-12d %-12d %-12d %-12d\n", 
            "Total", consoleTotals[0], consoleTotals[1], consoleTotals[2], grandTotal);
        System.out.println("=====================================================================");

        // Determine and display the city with the most sales
        int maxSales = cityTotals[0];
        String topCity = cities[0];

        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }

        System.out.println("\ntOTAL SALES:");
        System.out.println("The city with the highest volume of sales is: " + topCity + " (" + maxSales + " SALES).");
    }
}
