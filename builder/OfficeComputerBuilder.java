package builder;

public class OfficeComputerBuilder implements IComputerBuilder {

    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Office processor...BAM!"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("Office RAM...BAM!"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("Office Hard Drive...BAM!"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Office Operating System...BAM!"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Office Graphics Card...BAM!!"));
    }

    public Computer getComputer() {
        return computer;
    }
    
}
