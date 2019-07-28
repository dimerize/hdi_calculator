import java.util.Scanner;

public class HDICalculatorTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hydrogen Deficiency Index Calculator!");
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
        
        System.out.println("How many oxygen atoms does the molecule contain?");
        if (reader.hasNextInt()) {
            if (reader.nextInt() > 0) {
                organic.setPresenceOfOxygen(true);
            }
        }
        
        HDICalculator calculator = new HDICalculator(organic);
        int index = calculator.calculateIndex();
        
        System.out.println("Hydrogen Deficiency Index: "+index);
        
        if (index == 0) {
            if (organic.getNumberOfCarbons() > 0) {
                System.out.println("\nThe molecule is a saturated organic molecule.");
                if (organic.getNumberOfNitrogens() > 0) {
                    System.out.println("\nThe molecule may contain an amine functional group; no determination can be made regarding the degree of the amine.");
                    if (organic.oxygenIsPresent()) {
                        System.out.println("\nThe molecule may also contain a nitro or nitroso group.");
                    }    
                } else if (organic.oxygenIsPresent()) {
                    System.out.println("\nThe molecule contains either an ether or alcohol moiety.");
                }
            } else if (organic.getNumberOfNitrogens() > 0) {
                System.out.println("\nThe molecule is either ammonia (or an ammonia derivative) or an extended ammonia-like structure (such as hydrazine).");
            }            
        } else {
            System.out.println("\nThe molecule may be cyclic.");
            if (organic.oxygenIsPresent()) {
                System.out.println("\nThe molecule may thus have an incorporated cyclic ether moiety.");

                System.out.println("\nThe molecule may also contain a carbonyl group; be attentive of an IR peak at ~1600 reciprocal centimeters.");

                System.out.println("\nRelevant moieties may include ketones, aldehydes, esters, and carboxylic acids.");

                System.out.println("\nThe oxygen may just be incorporated into an ether or alcohol functionality, however.");
                if (organic.getNumberOfNitrogens() > 0) {
                    System.out.println("\nThe molecule may also contain amide, imide, or other related functional moieties.");
                }
            }
            if (index >= 2) {
                if (organic.getNumberOfNitrogens() > 0) {
                    System.out.println("\nThe molecule may contain a nitrile functionality.");
                }
                System.out.println("\nBe cognizant of any potential conjugated pi molecular orbital systems present.");
                System.out.println("The molecule may be susceptible to pericyclic reactions (electrocyclic, sigmatropic, cycloadditive, or ene reactions).");

                System.out.println("\nAlso be attentive of any potential aromaticity. If aromatic properties are present UV-Vis Spectroscopy may be advisable.");
            }
        }
        System.out.println("\nThanks for using the Hydrogen Deficiency Index Calculator!");
    }
}
