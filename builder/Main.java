package builder;

public class Main {
    public static void main(String[] args) {
        IComputerBuilder builder = new OfficeComputerBuilder();
        Director director = new Director(builder);
        director.constructComputer();
        Computer tietsikka = builder.getComputer();
        System.out.println(tietsikka);
    }
    
}
