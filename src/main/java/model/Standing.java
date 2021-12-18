package model;


import java.util.List;

public class Standing {

    private LeagueTable leagueTable;

    List<Team> teamList;

    public LeagueTable getLeagueTable() {
        return leagueTable;
    }

    public void setLeagueTable(LeagueTable leagueTable) {
        this.leagueTable = leagueTable;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    @Override
    public String toString() {
        return "Standing{" +
                "leagueTable=" + leagueTable +
                ", teamList=" + teamList +
                '}';
    }
}
