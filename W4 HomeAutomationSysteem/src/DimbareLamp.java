public class DimbareLamp extends Lamp{
    protected int brightness = 100;


    public void setBrightness(int newbrightness){
        if (newbrightness < 0 && newbrightness > 100){
            System.out.println("False input, try 0-100");
        } else {
            brightness = newbrightness;
        }
    }

    @Override
    public String toString() {
        String result;
        if(light == true){
            result = "on";
        } else {
            result = "off";
        }
        return result + ", with a brightness of " + brightness+"%";
    }
}
