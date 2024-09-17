package state;

public class IntermediateLevel extends State {
    
    public IntermediateLevel(Character character) {
        super(character);
        this.getCharacter().setLevel("Intermediate");
    }

    @Override
    void action() {
        String[] options = {"Train", "Meditate"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);
                System.out.println("\n" +"You have trained and gained 10 experience points!"+ "\n");
                if (this.getCharacter().getExperiencePoints() >= 200) {
                    this.getCharacter().setState(new ExpertLevel(this.getCharacter()));
                    System.out.println("\n" +"Congratulations! You have reached the Expert level!"+ "\n");
                }
                break;
            
            case 2:
                this.getCharacter().setHealthPoints(this.getCharacter().getHealthPoints() + 10);
                System.out.println("\n" +"You have meditated and gained 10 health points!"+ "\n");
                break;
            default:
                System.out.println("\n"+"Invalid choice!"+ "\n");
        } 
    }
}
