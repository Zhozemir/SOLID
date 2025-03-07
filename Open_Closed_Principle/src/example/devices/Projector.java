package example.devices;

public class Projector implements Device{

    @Override
    public void turnOn() {

        pullDownProjectorScreen();
        System.out.println("Projector has been turned on");

    }

    @Override
    public void turnOff() {


        pullUpProjectorScreen();
        System.out.println("Projector has been turned off");

    }

    private void pullDownProjectorScreen(){
        System.out.println("Screen has been lowered for viewing");
    }

    private void pullUpProjectorScreen(){
        System.out.println("Screen raised back up to close");
    }

    @Override
    public String toString(){
        return "Projector";
    }

}
