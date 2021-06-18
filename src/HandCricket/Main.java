package HandCricket;

import java.util.*;

public class Main {

    final static List<String> TOSS = Arrays.asList("H", "T");
    final static List<Integer> ALLOWED_SCORE_PER_BALL = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static void main(String[] args) {

        Team cpu = new Team("cpu");
        Team player = new Team(input("Enter the Player Name: ").nextLine());

        System.out.println();

        String optionPicked = input("Enter [H]ead or [T]ails").nextLine();

        if (!TOSS.contains(optionPicked))  {
            System.out.println("Only H or T");
            System.exit(1);
        }

        String tossOut = getRandomString(TOSS);

        if (optionPicked.equals(tossOut)) {
            System.out.println("Won");
            String optionPicked2 = input("Press 'bat' for Bat and 'bowl' for Bowl: ").nextLine();

            if (!Arrays.asList("bat", "bowl").contains(optionPicked2)) {
                System.out.println("Only bat or bowl");
                System.exit(1);
            }

            if (optionPicked2.equals("bat")) {
                System.out.println("you chosen to Bat");
                System.out.println(player.name + "'s Turn");
                System.out.println(play(player, cpu, false));
                System.out.println(cpu.name + "'s Turn");
                System.out.println(play(cpu, player, true));
            } else {
                System.out.println("You chosen to Bowl");
                System.out.println(cpu.name + "'s Turn");
                System.out.println(play(cpu, player, false));
                System.out.println(player.name + "'s Turn");
                System.out.println(play(player, cpu, true));
            }
        } else {
            System.out.println("Toss Loss cpu choose to Bat");
            System.out.println(play(cpu, player, false));
            System.out.println(player.name + "'s Turn");
            System.out.println(play(player, cpu, true));
        }

        printer(cpu);
        printer(player);


        if (player.totalScore > cpu.totalScore) {
            System.out.println(player.name + " won the match");
        } else if (player.totalScore == cpu.totalScore) {
            System.out.println("Match Drawn");
        } else {
            System.out.println("Cpu won the match");
        }


    }

    private static Scanner input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner;
    }

    private static String play(Team battingTeam, Team bowlingTeam, Boolean secondInnings) {
        int ballCount = 1;
        ArrayList<Integer> score = new ArrayList<>();

        while (true) {
            int x;
            x = input(  ballCount+ " Ball of Innings: ").nextInt();

            if (!ALLOWED_SCORE_PER_BALL.contains(x)) {
                System.out.println("Only 1 to 6 runs per ball");
                System.exit(1);
            }

            int y;

            y = getRandomInt(ALLOWED_SCORE_PER_BALL);

            System.out.println("Opponent: " + y);

            ballCount += 1;

            if (x == y) {
                break;
            } else {
                if (battingTeam.name.equals("cpu")) {
                    score.add(y);
                } else {
                    score.add(x);
                }
            }

            battingTeam.scoreBoard = score;
            int sumScore = 0;
            for (int s : score) {
                sumScore = sumScore + s;
            }
            battingTeam.totalScore = sumScore;
            battingTeam.battedCount = ballCount;
            bowlingTeam.bowledCount = ballCount;

            if (secondInnings) {
                if (battingTeam.totalScore > bowlingTeam.totalScore) {
                    break;
                }
            }
        }
        return "Inning Completed :) " + battingTeam.name + " Scored " + battingTeam.totalScore + " in " + battingTeam.battedCount + " balls.";

    }

    private static void printer(Team team) {
        System.out.println("*********");
        System.out.println(team.name);
        System.out.println("*********");
        System.out.println("Runs: " + team.totalScore);
        System.out.println("Batted Balls: " + team.battedCount);
        System.out.println("Bowled Balls: " + team.bowledCount);
        System.out.println(team.name + "'s scoreboard " + team.scoreBoard.toString());

    }


    public static int getRandomInt(List<Integer> list) {
        Random random = new Random();
        int index = random.nextInt(list.size());

        return list.get(index);
    }

    public static String getRandomString(List<String> list) {
        Random random = new Random();
        int index = random.nextInt(list.size());

        return list.get(index);
    }
}
