package comp.screen;

public class Screen {
    private int diagonal;
    ScreenTypes screenTypes;
    private double weight;

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public ScreenTypes getScreenTypes() {
        return screenTypes;
    }

    public void setScreenTypes(ScreenTypes screenTypes) {
        this.screenTypes = screenTypes;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Screen(int diagonal, ScreenTypes screenTypes, double weight) {
        this.diagonal = diagonal;
        this.screenTypes = screenTypes;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ScreenInfo: " +
                "diagonal = " + diagonal +
                ", screenTypes = " + screenTypes +
                ", weight = " + weight +
                "g.\n";
    }
}
