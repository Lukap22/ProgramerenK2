public class Lamp {
    private boolean light;

    public void setOn(){
        light = true;
    }
    public void setOff(){
        light = false;
    }
    @Override
    public String toString() {
        String result;
        if(light){
            result = "on";
        } else {
            result = "off";
        }
        return result;
    }
}
