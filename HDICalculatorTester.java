/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author o518316k
 */
import java.util.Scanner;

public class HDICalculatorTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hydrogen Deficiency Index calculator.");
        System.out.println("");
        System.out.println("This program calculates the HDI for a provided molecule");
        System.out.println("and returns information regarding potential structural ");
        System.out.println("details of the molecule.");
        System.out.println("");
        System.out.println("This calculator assumes the molecule is uncharged and ");
        System.out.println("exhibits classical tetravalent properties in all of its");
        System.out.println("atoms.");
        System.out.println("");
        
        Scanner reader = new Scanner(System.in);
        Molecule organic = new Molecule();
        
        System.out.println("How many carbon atoms does the molecule contain?");
        if (reader.hasNextInt()) {
            organic.setNumberOfCarbons(reader.nextInt());
        }
        
        System.out.println("How many nitrogen atoms does the molecule contain?");
        if (reader.hasNextInt()) {
            organic.setNumberOfNitrogens(reader.nextInt());
        }
        
        System.out.println("How many hydrogen atoms does the molecule contain?");
        if (reader.hasNextInt()) {
            organic.setNumberOfHydrogens(reader.nextInt());
        }
        
        System.out.println("How many halogen atoms does the molecule contain?");
        if (reader.hasNextInt()) {
            organic.setNumberOfHalogens(reader.nextInt());
        }
        
        System.out.println("Does the molecule contain oxygen? (Y/N)");
        if (reader.nextLine().equals("Y")) {
            organic.setPresenceOfOxygen(true);
        }
        
        HDICalculator calculator = new HDICalculator(organic);
        
        System.out.println("Hydrogen Deficiency Index: "+calculator.calculateIndex());
    }
}
