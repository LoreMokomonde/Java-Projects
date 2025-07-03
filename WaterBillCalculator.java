/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waterbillcalculator;

import java.util.Scanner;

/**
 *
 * @author LoreLerato Mokomonde
 */
public class WaterBillCalculator {
    
    public static void main(String[] args) {
        //Input for the season nd water usage
        try (Scanner sc = new Scanner(System.in)) {
            //Input for the season nd water usage
            System.out.println("Enter the season(summer/not-summer):");
            String season = sc.nextLine().toLowerCase();
            System.out.println("Enter the water consumption in litres: ");
            double consumption = sc.nextDouble();
            double threshold, costPerLitre,extraUnitCharge,discount = 0;
            double baseCharge = 38.00;
            double totalBill = 0;
            boolean isWithinThreshold = false;
            //set threshold and costs based on season
            if(season.equals("summer")){
                threshold = 7000;
                costPerLitre = 2.78;
                extraUnitCharge = 0.62;
                if(consumption <= threshold){
                    isWithinThreshold = true;
                    totalBill = consumption * costPerLitre;
                    discount = 0.12;
                } else{
                    totalBill = threshold * costPerLitre + (consumption - threshold) - (costPerLitre + extraUnitCharge);
                }
            }else{
                threshold = 5000;
                costPerLitre = 2.65;
                extraUnitCharge = 0.50;
                if(consumption <= threshold){
                    isWithinThreshold = true;
                    totalBill = consumption * costPerLitre;
                    discount = 0.20;
                }else{
                    totalBill = threshold * costPerLitre + (consumption - threshold) * (costPerLitre + extraUnitCharge);
                }
            }
            totalBill += baseCharge;
            double vat = totalBill * 0.15;
            totalBill += vat;
            // apply discount if within threshold
            if(isWithinThreshold){
                totalBill -= totalBill* discount;
            }
            //display the final bill
            System.out.printf("Final Bill: " + "R" + totalBill);
            // Indicate whether the cosumption was within the threshold or not
            if(isWithinThreshold){
                System.out.println("You used water within the threshold.");
            } else{
                System.out.println("You used water above the threshold.");
            }
        }
        }
    }s

