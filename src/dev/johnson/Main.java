package dev.johnson;

import java.util.Arrays;

interface Player {
    String name();
}

record BaseBallPlayer(String name, String position) implements Player{}
record FootBallPlayer(String name, String position) implements Player{}
record VolleyBallPlayer(String name, String position) implements Player{}

public class Main {



    public static void main(String[] args) {

        /*var philly = new Affiliation("city", "Philadelphia, PA", "US");

        BaseBallTeam phillies1 = new BaseBallTeam("Pliladelphia Phillies");
        BaseBallTeam astros1 = new BaseBallTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportTeam phillies2 = new SportTeam("Pliladelphia Phillies");
        SportTeam astros2 = new SportTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseBallPlayer, Affiliation> phillies = new Team<>("Pliladelphia Phillies", philly);
        Team<BaseBallPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseBallPlayer("B Harper", "Right Fielder");
        var marsh = new BaseBallPlayer("B Marsh", "Right Fielder");

        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseBallPlayer("D Guthrie", "Center fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportTeam afc1 = new SportTeam("Adelaide Crows");
        Team<FootBallPlayer, String> afc = new Team<>("Adelaide Crows", "City of Adelaine, South Australia, in AU");
        var tex = new FootBallPlayer("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);
        var rory = new FootBallPlayer("Rory", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyBallPlayer, Affiliation> adelaine = new Team<>("Adelaide Storm");
        adelaine.addTeamMember(new VolleyBallPlayer("N Roberts", "Setter"));
        adelaine.listTeamMembers();

        var canberra = new Team<VolleyBallPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyBallPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaine, 1);*/

        //Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for(Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five,
                    (val == 0 ? "==" : (val < 0 ) ? "< " : "> "), i, val);
        }

        String banana = "banana";
        String[] fruits = {"apple", "banana", "orange", "BANANA"};
        for(String fruit : fruits) {
            int val = banana.compareTo(fruit);
            System.out.printf("%s %s %s: compareTo=%d%n", banana,
                    (val == 0 ? "==" : (val < 0 ) ? "< " : "> "), fruit, val);
        }

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println("A:"+(int)'A' + " " + "a:"+(int)'a');
        System.out.println("B:"+(int)'B' + " " + "b:"+(int)'B');
        System.out.println("O:"+(int)'O' + " " + "o:"+(int)'P');

        Student tim = new Student("Tim");
        Student [] students = { new Student("Tim"), new Student("Zach"), new Student("Ann") };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo("Mary"));

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

class Student implements Comparable{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student)o;
        return name.compareTo(student.name);
    }
}