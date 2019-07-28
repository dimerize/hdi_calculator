public class Molecule {
    private int numberOfCarbons;
    private int numberOfHydrogens;
    private int numberOfNitrogens;
    private int numberOfHalogens;
    private boolean presenceOfOxygen;
    /*
    The number of oxygen atoms is not accounted for because the number
    of oxygen atoms in a molecule has no bearing on the molecule's HDI.
    This is on account of oxygen's divalency. However, the presence of 
    oxygen should be noted, as oxygen's presence dictates the possible
    functional groups present in the molecule.
    */

    public Molecule(int numberOfCarbons, int numberOfHydrogens, int numberOfNitrogens, int numberOfHalogens, boolean presenceOfOxygen) {
        this.numberOfCarbons = numberOfCarbons;
        this.numberOfHydrogens = numberOfHydrogens;
        this.numberOfNitrogens = numberOfNitrogens;
        this.numberOfHalogens = numberOfHalogens;
        this.presenceOfOxygen = presenceOfOxygen;
    }

    public Molecule() {
        this(0, 0, 0, 0, false);
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

    public void setPresenceOfOxygen(boolean presenceOfOxygen) {
        this.presenceOfOxygen = presenceOfOxygen;
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

    public boolean oxygenIsPresent() {
        return presenceOfOxygen;
    }
}
