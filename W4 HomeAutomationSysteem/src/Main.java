public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){
        Lamp leeslamp = new Lamp();
        DimbareLamp hanglamp = new DimbareLamp();
        PhilipsHUELamp huelamp = new PhilipsHUELamp();

        //Print de gegevens van de lampen
        System.out.println("Leeslamp : " + leeslamp);
        System.out.println("Hanglamp : " + hanglamp);
        System.out.println("Philips HUE lamp: " + huelamp);
        System.out.println("---");

        //print nieuw gegevens lampen
        huelamp.setColor(255,10,10);
        huelamp.setBrightness(60);
        huelamp.setOff();
        System.out.println("Philips HUE lamp: " + huelamp);
    }
}
