public class Burner {
    protected double diameter, maxTemp, minTemp;
    protected Boolean isHot;

    public Burner() {}
    public Burner(double maxTemp, double minTemp, double diameter) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.diameter = diameter;
    }

    public Boolean turnOn() { return false; }
    public Boolean turnOff() { return false; }
    public void increaseTemp() {}
    public void decreaseTemp() {}
    public double getDiameter() { return this.diameter; }
    public double getMaxTemp() { return this.maxTemp; }
    // In the UML, this is called isHot(): boolean
    public Boolean getIsHot() { return this.isHot; }
}
