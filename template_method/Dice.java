package template_method;

public class Dice {
    private int value;
    private int diceId;
    private boolean isLocked;

    public Dice( Integer diceId) {
        this.value = 0;
        this.diceId = diceId;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }

    public int getDiceId() {
        return this.diceId;
    }

    public void setDiceId(int diceId) {
        this.diceId = diceId;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public void setLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String toString() {
        return "Dice " + this.diceId + ": " + this.value;
    }
}