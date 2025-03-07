package example.clients;

import example.processes.GeneralManufacturingProcess;
import example.processes.SmarthphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {

        GeneralManufacturingProcess manufacturer = new SmarthphoneManufacturingProcess("Iphone process");

        manufacturer.launchProcess();

    }

}
