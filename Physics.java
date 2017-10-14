
public enum Physics {
    Pi(3.14);

    private final double value;

    Physics(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
    public String toString() {
        return "";
    }
}