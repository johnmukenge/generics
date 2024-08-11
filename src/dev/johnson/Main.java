package dev.johnson;

record BaseBallPlayer(String name, String position){}

public class Main {



    public static void main(String[] args) {

        BaseBallTeam phillies = new BaseBallTeam("Pliladelphia Phillies");
        BaseBallTeam astros = new BaseBallTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseBallPlayer("B Harper", "Right Fielder");
        var marsh = new BaseBallPlayer("B Marsh", "Right Fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

    }

    public static void scoreResult(BaseBallTeam team1, int t1_score, BaseBallTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}