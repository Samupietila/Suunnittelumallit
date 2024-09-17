package state;

public class ExpertLevel extends State {

    public ExpertLevel(Character character) {
        super(character);
        this.getCharacter().setLevel("Expert");
    }

    @Override
    void action() {
        String[] options = {"Train", "Meditate", "Fight"};
        switch (this.getCharacter().readUserChoice(options)) {
            case 1:
                this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);
                System.out.println("\n"+"You have trained and gained 10 experience points!"+"\n");
                if (this.getCharacter().getExperiencePoints() >= 1000) {
                    this.getCharacter().setState(new MasterLevel(this.getCharacter()));
                    System.out.println("\n"+"Congratulations! You have reached the Master level!"+"\n");
                }
                break;
            
            case 2:
                this.getCharacter().setHealthPoints(this.getCharacter().getHealthPoints() + 10);
                System.out.println("\n"+"You have meditated and gained 10 health points!"+ "\n");
                break;

            case 3:
                this.getCharacter().setHealthPoints(this.getCharacter().getHealthPoints() - 40);
                if (this.getCharacter().getHealthPoints() <= 0) {
                    System.out.println("\n"+"You have fought and lost! You have died!"+"\n");
                    break;
                }
                this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 50);
                System.out.println("\n"+"You have fought and gained 50 experience points! But you lost 40 health points!"+"\n");
                break;

            default:
                System.out.println("\n"+"Invalid choice!"+"\n");
        } 
    }
}