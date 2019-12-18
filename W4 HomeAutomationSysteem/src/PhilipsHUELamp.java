public class PhilipsHUELamp extends DimbareLamp {
    private int colorRed;
    private int colorGreen;
    private int colorBlue;

    public void setColor(int red, int green, int blue){
        colorRed = red;
        colorGreen = green;
        colorBlue = blue;
        setBrightness(100);
    }

    @Override
    public String toString() {
        return super.toString() + " and RGB color " + "("+ colorRed + "," + colorGreen + "," + colorBlue + ")" ;
    }
}
