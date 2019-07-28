/*******************************************************************************
Title: HDICalculator.java
Authors: Omar Khan
Date: 7/28/19

Desciription: This class constructs an HDI calculator that returns the Hydrogen 
Deficiency Index of a Molecule object.
*******************************************************************************/
public class HDICalculator {
    private final Molecule testMolecule;
    /*
    Returns the Hydrogen Deficiency Index for the provided molecule, assuming 
    the molecule is uncharged and exhibits standard tetravalent properties with
    carbon, nitrogen, oxygen, and halogens. This calculator can be extended to
    incorporate more uncommon elements in organic molecules.
    */
    
    public HDICalculator(Molecule testMolecule) {
        this.testMolecule = testMolecule;
    }
    
    public int calculateIndex() {
        int xIndex = (2*(testMolecule.getNumberOfCarbons() + (testMolecule.getNumberOfNitrogens()/2)))+2;
        int yIndex = testMolecule.getNumberOfHydrogens() + testMolecule.getNumberOfHalogens();
        
        return (xIndex - yIndex)/2;
    }
}
