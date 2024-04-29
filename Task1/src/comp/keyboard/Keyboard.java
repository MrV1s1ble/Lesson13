package comp.keyboard;

public class Keyboard {
    KeyboardTypes keyboardTypes;
    Illumination illumination;
    private double weight;

    public KeyboardTypes getKeyboardTypes() {
        return keyboardTypes;
    }

    public void setKeyboardTypes(KeyboardTypes keyboardTypes) {
        this.keyboardTypes = keyboardTypes;
    }

    public Illumination getIllumination() {
        return illumination;
    }

    public void setIllumination(Illumination illumination) {
        this.illumination = illumination;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Keyboard(KeyboardTypes keyboardTypes, Illumination illumination, double weight) {
        this.keyboardTypes = keyboardTypes;
        this.illumination = illumination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "KeyboardInfo: " +
                "keyboardTypes = " + keyboardTypes +
                ", illumination = " + illumination +
                ", weight = " + weight +
                "g.\n";
    }
}
