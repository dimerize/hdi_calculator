/*******************************************************************************
Title: Molecule.java
Authors: Omar Khan
Desciription: This class constructs a Molecule object, which contains the number
and type of atoms in the molecule. The Molecule object also acts as input for the
HDICalculator class.
*******************************************************************************/
public class Molecule {
    private int numberOfCarbons;
    private int numberOfHydrogens;
    private int numberOfNitrogens;
    private int numberOfHalogens;
    private int numberOfOxygens;

    public Molecule(int numberOfCarbons, int numberOfHydrogens, int numberOfNitrogens, int numberOfHalogens, int numberOfOxygens) {
        this.numberOfCarbons = numberOfCarbons;
        this.numberOfHydrogens = numberOfHydrogens;
        this.numberOfNitrogens = numberOfNitrogens;
        this.numberOfHalogens = numberOfHalogens;
        this.numberOfOxygens = numberOfOxygens;
    }

    public Molecule() {
        this(0, 0, 0, 0, 0);
    }

    public void setNumberOfCarbons(int numberOfCarbons) {
        this.numberOfCarbons = numberOfCarbons;
    }

    public void setNumberOfHalogens(int numberOfHalogens) {
        this.numberOfHalogens = numberOfHalogens;
    }

    public void setNumberOfHydrogens(int numberOfHydrogens) {
        this.numberOfHydrogens = numberOfHydrogens;
    }

    public void setNumberOfNitrogens(int numberOfNitrogens) {
        this.numberOfNitrogens = numberOfNitrogens;
    }

    public void setNumberOfOxygens(int numberOfOxygens) {
        this.numberOfOxygens = numberOfOxygens;
    }

    public int getNumberOfCarbons() {
        return numberOfCarbons;
    }

    public int getNumberOfHalogens() {
        return numberOfHalogens;
    }

    public int getNumberOfHydrogens() {
        return numberOfHydrogens;
    }

    public int getNumberOfNitrogens() {
        return numberOfNitrogens;
    }

    public int getNumberOfOxygens() {
        return numberOfOxygens;
    }
}
