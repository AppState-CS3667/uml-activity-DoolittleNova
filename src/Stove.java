public class Stove
{
    public Boolean hookUp() { return false; }
    public void setBurnerTemp(int burner, double temp) {}
    public Boolean isHot() { return false; }
    public double getBurnerTemp(int burner) { return 0; }
    public Burner getBurner(int burner) { return new Burner(); }
}