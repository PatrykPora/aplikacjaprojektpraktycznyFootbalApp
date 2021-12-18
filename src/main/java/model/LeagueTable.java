package model;

public class LeagueTable {

    private String leagueID;
    private int year;

    public String getLeagueID() {
        return leagueID;
    }

    public void setLeagueID(String leagueID) {
        this.leagueID = leagueID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "LeagueTable{" +
                "leagueID='" + leagueID + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
