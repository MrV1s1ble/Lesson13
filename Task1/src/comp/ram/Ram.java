package comp.ram;

public class Ram {
    private int memoryCapacity;
    private double weight;
    RAMType ramType;

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

    public RAMType getRamType() {
        return ramType;
    }

    public void setRamType(RAMType ramType) {
        this.ramType = ramType;
    }

    public Ram(int memoryCapacity, double weight, RAMType ramType) {
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
        this.ramType = ramType;
    }

    @Override
    public String toString() {
        return "RamInfo: " +
                "memoryCapacity = " + memoryCapacity +
                ", weight = " + weight + "g" +
                ", ramType = " + ramType +
                '.';
    }
}
