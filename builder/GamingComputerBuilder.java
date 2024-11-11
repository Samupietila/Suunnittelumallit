package builder;

public class GamingComputerBuilder implements IComputerBuilder {

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addComponent(new Component("Gaming processor...BAM!"));
    }

    @Override
    public void buildRAM() {
        computer.addComponent(new Component("Gaming RAM...BAM!"));
    }

    @Override
    public void buildHardDrive() {
        computer.addComponent(new Component("Gaming Hard Drive...BAM!"));
    }

    @Override
    public void buildOperatingSystem() {
        computer.addComponent(new Component("Gaming Operating System...BAM!"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addComponent(new Component("Gaming Graphics Card...BAM!!"));
    }
    
    public Computer getComputer() {
        return computer;
    }
}
