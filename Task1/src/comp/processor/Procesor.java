package comp.processor;

public class Procesor {
    Frequency frequency;
    NumberOfCores numberOfCores;
    ProcessorManufacturer processorManufacturer;
    private double weight;

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public NumberOfCores getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(NumberOfCores numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public ProcessorManufacturer getProcessorManufacturer() {
        return processorManufacturer;
    }

    public void setProcessorManufacturer(ProcessorManufacturer processorManufacturer) {
        this.processorManufacturer = processorManufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public Procesor(Frequency frequency, NumberOfCores numberOfCores, ProcessorManufacturer processorManufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.processorManufacturer = processorManufacturer;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ProcesorInfo: " +
                "frequency = " + frequency +
                ", numberOfCores = " + numberOfCores +
                ", processorManufacturer = " + processorManufacturer +
                ", weight = " + weight +
                "g.\n";
    }
}
