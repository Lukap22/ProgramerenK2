public class Lamp {
    protected boolean light = false;

    public void setOn(){
        light = true;
    }
    public void setOff(){
        light = false;
    }
    @Override
    public String toString() {
        String result;
        if(light == true){
            result = "on";
        } else {
            result = "off";
        }
        return result;
    }
}
