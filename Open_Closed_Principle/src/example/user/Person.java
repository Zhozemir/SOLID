package example.user;

import example.devices.Projector;
import example.devices.TV;
import example.remotes.RemoteControl;

public class Person {

    public static void main(String[] args) {

        Projector projector = new Projector();
        TV tv = new TV();

        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOnButton();

        remoteControl.connectToDevice(tv);
        remoteControl.clickOnButton();

    }

}
