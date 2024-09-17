package state;

public class MasterLevel extends State {
    
        public MasterLevel(Character character) {
            super(character);
            this.getCharacter().setLevel("Master");
        }
    
        @Override
        void action() {
            String[] options = {"Train", "Meditate", "Fight", "Exit"};
            switch (this.getCharacter().readUserChoice(options)) {
                case 1:
                    this.getCharacter().setExperiencePoints(this.getCharacter().getExperiencePoints() + 10);
                    System.out.println("\n"+"You have trained and gained 10 experience points!"+"\n");
                    break;
                
                case 2:
                    this.getCharacter().setHealthPoints(this.getCharacter().getHealthPoints() + 10);
                    System.out.println("\n"+"You have meditated and gained 10 health points!"+"\n");
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
                
                case 4:
                    System.out.println("THANK YOU FOR PLAYING!");
                    System.out.println("Exiting game...");
                    System.exit(0);
                    break;
    
                default:
                    System.out.println("Invalid choice!");
            } 
        }
    
}
