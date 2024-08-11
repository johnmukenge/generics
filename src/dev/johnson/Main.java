package dev.johnson;

interface Player {}

record BaseBallPlayer(String name, String position) implements Player{}
record FootBallPlayer(String name, String position) implements Player{}

public class Main {



    public static void main(String[] args) {

        BaseBallTeam phillies1 = new BaseBallTeam("Pliladelphia Phillies");
        BaseBallTeam astros1 = new BaseBallTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportTeam phillies2 = new SportTeam("Pliladelphia Phillies");
        SportTeam astros2 = new SportTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseBallPlayer> phillies = new Team<>("Pliladelphia Phillies");
        Team<BaseBallPlayer> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseBallPlayer("B Harper", "Right Fielder");
        var marsh = new BaseBallPlayer("B Marsh", "Right Fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseBallPlayer("D Guthrie", "Center fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportTeam afc1 = new SportTeam("Adelaide Crows");
        Team<FootBallPlayer> afc = new Team<>("Adelaide Crows");
        var tex = new FootBallPlayer("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);
        var rory = new FootBallPlayer("Rory", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

    }

    public static void scoreResult(BaseBallTeam team1, int t1_score, BaseBallTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportTeam team1, int t1_score, SportTeam team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}