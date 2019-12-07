public class PhilipsHUELamp extends DimbareLamp {

    protected int colorRed;
    protected int colorGreen;
    protected int colorBlue;

    public void setColor(int red, int green, int blue){
        colorRed = red;
        colorGreen = green;
        colorBlue = blue;
    }



    @Override
    public String toString() {
        String result;
        if(light == true){
            result = "on";
        } else {
            result = "off";
        }
        return result + ", with a brightness of " + brightness +"%" + " and RGB color " + "("+ colorRed + "," + colorGreen + "," + colorBlue + ")" ;
    }
}
