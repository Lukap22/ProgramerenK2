public class DimbareLamp extends Lamp{
    private int brightness;


    public void setBrightness(int newbrightness){
        if (newbrightness < 0 || newbrightness > 100){
            System.out.println("False input, try 0-100");
        } else {
            brightness = newbrightness;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", with a brightness of " + brightness+"%";
    }
}
