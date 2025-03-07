package example.processes;

public class SmarthphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmarthphoneManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembles smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("tested smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored smartphone");
    }
}
