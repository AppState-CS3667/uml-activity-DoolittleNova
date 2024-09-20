public class GasBurner extends Burner {
    private String gasType;

    public GasBurner(double maxTemp, double minTemp, double diameter) {
        super(maxTemp, minTemp, diameter);
    }
    
    public Boolean spark() { return false; }
    public String getGasType() { return this.gasType; }
    public void increaseGasFlow() {}
    public void decreaseGasFlow() {}
}
