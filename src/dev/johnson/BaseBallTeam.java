package dev.johnson;

import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam {

    private String teamName;
    private List<BaseBallPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public BaseBallTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseBallPlayer player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + "Rooster:");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){
         String message = "loss to";
         if (ourScore > theirScore) {
             totalWins++;
             message = "beat";
         } else if (ourScore == theirScore) {
            totalTies++;
            message = "beat";
        } else{
             totalLosses++;
        }
         return message;
    }

    @Override
    public String toString() {
        return teamName + " (Ranked " + ranking() + ")";
    }
}
