/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author o518316k
 */
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
        
        return (yIndex - xIndex)/2;
    }
}
