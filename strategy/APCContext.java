package strategy;

public class APCContext {
    private APCStrategy strategy;

    public APCContext(APCStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(APCStrategy strategy) {
        this.strategy = strategy;
    }

    public String checkAPC(int[] values) {
        return strategy.checkAPC(values);
    }
}
