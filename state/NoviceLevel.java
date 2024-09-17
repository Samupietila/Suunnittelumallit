package state;

public class NoviceLevel extends State{
    public NoviceLevel(Character character) {
        super(character);
        this.getCharacter().setLevel("Novice");
    }

    @Override
    void action() {
        String[] options = {"Train"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);
                System.out.println("\n"+"You have trained and gained 10 experience points!" + "\n");
                if (this.getCharacter().getExperiencePoints() >= 100) {
                    this.getCharacter().setState(new IntermediateLevel(this.getCharacter()));
                    System.out.println("\n"+ "Congratulations! You have reached the Intermediate level!"+ "\n");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        } 
    }
}
