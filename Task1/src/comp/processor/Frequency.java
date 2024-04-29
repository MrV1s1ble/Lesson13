package comp.processor;

public enum Frequency {
    LOW("2600 МГц"),
    MID("2600 МГц"),
    HIGH("3200 МГц");

    private String value;
    Frequency(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
