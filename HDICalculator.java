/*******************************************************************************
Title: HDICalculator.java
Authors: Omar Khan
Desciription: This class constructs an HDI calculator that returns the Hydrogen 
Deficiency Index of a Molecule object, as well as potential structural 
information.
*******************************************************************************/
public class HDICalculator {
    private final Molecule testMolecule;
    private int index;
    /*
    Returns the Hydrogen Deficiency Index for the provided molecule, assuming 
    the molecule is uncharged and exhibits standard tetravalent properties with
    carbon, nitrogen, oxygen, and halogens. This calculator can be extended to
    incorporate more uncommon elements in organic molecules. Also returns potential
    structural information regarding the molecule's functional groups.
    */
    
    public HDICalculator(Molecule testMolecule) {
        this.testMolecule = testMolecule;
        int xIndex = (2*(testMolecule.getNumberOfCarbons() + (testMolecule.getNumberOfNitrogens()/2)))+2;
        int yIndex = testMolecule.getNumberOfHydrogens() + testMolecule.getNumberOfHalogens();
        index = (xIndex - yIndex)/2;
    }
    
    public int getIndex() {
        return index;
    }
    
    public void structuralInformation() {
        if (index == 0) {
            if (testMolecule.getNumberOfCarbons() > 0) {
                System.out.println("\nThe molecule is a saturated organic molecule.");
                if (testMolecule.getNumberOfNitrogens() > 0) {
                    System.out.println("\nThe molecule may contain an amine functional group; no determination can be made regarding the degree of the amine.");
                    if (testMolecule.getNumberOfOxygens() > 0) {
                        System.out.println("\nThe molecule may also contain a nitro or nitroso group.");
                    }
                } else if (testMolecule.getNumberOfOxygens() > 0) {
                    System.out.println("\nThe molecule contains either an ether or alcohol moiety.");
                }
            } else if (testMolecule.getNumberOfNitrogens() > 0) {
                System.out.println("\nThe molecule is either ammonia (or an ammonia derivative) or an extended ammonia-like structure (such as hydrazine).");
            }
        } else {
            System.out.println("\nThe molecule may be cyclic.");
            if (testMolecule.getNumberOfOxygens() > 0) {
                System.out.println("\nThe molecule may thus have an incorporated cyclic ether moiety.");

                System.out.println("\nThe molecule may also contain a carbonyl group; be attentive of an IR peak at ~1600 reciprocal centimeters.");

                System.out.println("\nRelevant moieties may include ketones, aldehydes, esters, and carboxylic acids.");

                System.out.println("\nThe oxygen may just be incorporated into an ether or alcohol functionality, however.");
                if (testMolecule.getNumberOfNitrogens() > 0) {
                    System.out.println("\nThe molecule may also contain amide, imide, or other related functional moieties.");
                }
            }
            if (index >= 2) {
                if (testMolecule.getNumberOfNitrogens() > 0) {
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
