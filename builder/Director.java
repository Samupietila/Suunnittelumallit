package builder;

public class Director {

    private IComputerBuilder builder;

    public Director(IComputerBuilder builder) {
        this.builder = builder;
    }

    public void constructComputer() {
        builder.buildGraphicsCard();
        builder.buildHardDrive();
        builder.buildOperatingSystem();
        builder.buildProcessor();
        builder.buildRAM();
    }
    
}
