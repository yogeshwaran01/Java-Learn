package HandCricket;

import java.util.ArrayList;

public class Team {

    String name;
    ArrayList<Integer> scoreBoard = new ArrayList<>();
    int totalScore = 0;
    int bowledCount = 0;
    int battedCount = 0;

    public Team(String name) {

        this.name = name;
    }
}
