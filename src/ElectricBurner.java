public class ElectricBurner extends Burner {
    private double voltReq, ampReq;

    public ElectricBurner(double maxTemp, double minTemp, double diameter, double voltReq) {
        super(maxTemp, minTemp, diameter);
        this.voltReq = voltReq;
    }

    public void increaseCurrent() {}
    public void decreaseCurrent() {}
    public double getVoltReq() { return this.voltReq; }
    
}
