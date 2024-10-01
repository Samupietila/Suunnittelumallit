package template_method;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GameCard {
    private int playerId;
    private Map<String, Integer> scoreMap;
    private boolean isFull;

    public GameCard(int playerId) {
        this.playerId = playerId;
        scoreMap = new HashMap<>();
        String[] slotNames = {"1. Ones", "2. Twos", "3. Threes", "4. Fours", "5. Fives", "6. Sixes"};
        for (String slotName : slotNames) {
            scoreMap.put(slotName, -1);
        }
        isFull = false;
    }
public Map<String, Integer> getScores() {
    return new TreeMap<>(scoreMap);
}
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Player ").append(playerId).append("'s GameCard:\n");
    Map<String, Integer> sortedMap = new TreeMap<>(scoreMap);
    for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
        sb.append(entry.getKey()).append(": ");
        if (entry.getValue() == -1) {
            sb.append("empty");
        } else {
            sb.append(entry.getValue());
        }
        sb.append("\n");
    }
    return sb.toString();
}
    public int getSlotValue(String slotName) {
        return scoreMap.get(slotName);
    }
    public int getSlotValueByNumber(int slotNumber) {
        String[] slotNames = { "1. Ones", "2. Twos", "3. Threes", "4. Fours", "5. Fives", "6. Sixes"};
        String slotName = slotNames[slotNumber];
        return scoreMap.get(slotName);
    }
    public void setSlotValueByNumber(int slotNumber, int value) {
        String[] slotNames = { "1. Ones", "2. Twos", "3. Threes", "4. Fours", "5. Fives", "6. Sixes"};
        String slotName = slotNames[slotNumber];
        scoreMap.put(slotName, value);
    }
    public void setSlotValue(String slotName, int value) {
        scoreMap.put(slotName, value);
    }
    public int getTotalScore() {
        int totalScore = 0;
        for (int score : scoreMap.values()) {
            totalScore += score;
        }
        return totalScore;

    }
    public boolean isFull() {
        return isFull;
    }
    public void checkIfFull() {
        for (Integer score : scoreMap.values()) {
            if (score == -1) {
                isFull = false;
                return;
            }
        }
        isFull = true;
    }
}