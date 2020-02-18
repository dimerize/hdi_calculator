/*******************************************************************************
Title: HDICalculatorTester.java
Authors: Omar Khan
Desciription: This code acts as a tester class for the HDI calculator, and also
returns potential structural information about the relevant molecule.
*******************************************************************************/
import java.util.*;

public class HDICalculatorTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hydrogen Deficiency Index Calculator!\n\n");
        System.out.println("This program calculates the HDI for a provided molecule");
        System.out.println("and returns information regarding potential structural ");
        System.out.println("details of the molecule.\n\n");
        System.out.println("This calculator assumes the molecule is uncharged and ");
        System.out.println("exhibits classical tetravalent properties in all of its");
        System.out.println("atoms.\n");

        Scanner reader = new Scanner(System.in);
        Molecule organic = new Molecule();

        System.out.println("How many carbon atoms does the molecule contain?");
        if (reader.hasNextInt()) organic.setNumberOfCarbons(reader.nextInt());

        System.out.println("How many nitrogen atoms does the molecule contain?");
        if (reader.hasNextInt()) organic.setNumberOfNitrogens(reader.nextInt());

        System.out.println("How many hydrogen atoms does the molecule contain?");
        if (reader.hasNextInt()) organic.setNumberOfHydrogens(reader.nextInt());

        System.out.println("How many halogen atoms does the molecule contain?");
        if (reader.hasNextInt()) organic.setNumberOfHalogens(reader.nextInt());

        System.out.println("How many oxygen atoms does the molecule contain?");
        if (reader.hasNextInt()) organic.setNumberOfOxygens(reader.nextInt());

        HDICalculator calculator = new HDICalculator(organic);
        int index = calculator.getIndex();

        System.out.println("Hydrogen Deficiency Index: " + index);
        
        calculator.structuralInformation();
    }
}
