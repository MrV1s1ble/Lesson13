package comp.processor;

public enum NumberOfCores {
    FOUR(4),
    EIGHT(8),
    SEXTEEN(16);

    private int value;

    NumberOfCores(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
