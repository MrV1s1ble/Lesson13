package comp.harddisc;

public class HardDisc {
    private HardDiscTypes hardDiscTypes;
    private int memoryCapacity;
    private double weight;

    public HardDiscTypes getHardDiscTypes() {
        return hardDiscTypes;
    }

    public void setHardDiscTypes(HardDiscTypes hardDiscTypes) {
        this.hardDiscTypes = hardDiscTypes;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public HardDisc(HardDiscTypes hardDiscTypes, int memoryCapacity, double weight) {
        this.hardDiscTypes = hardDiscTypes;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDiscInfo: " +
                "hardDiscTypes = " + hardDiscTypes +
                ", memoryCapacity = " + memoryCapacity +
                ", weight = " + weight +
                "g.\n";
    }
}
