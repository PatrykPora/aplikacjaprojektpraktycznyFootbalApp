package entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LeagueTableEntity implements Serializable {

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
        return "LeagueTableEntity{" +
                "leagueID='" + leagueID + '\'' +
                ", year=" + year +
                '}';
    }
}
