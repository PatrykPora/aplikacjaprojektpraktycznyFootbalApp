package entity;

import model.LeagueTable;
import model.Team;

import javax.persistence.*;
import java.util.List;

@Entity
public class StandingEntity {

    @EmbeddedId
    private LeagueTableEntity leagueTable;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Team> teamList;

    public LeagueTableEntity getLeagueTable() {
        return leagueTable;
    }

    public void setLeagueTable(LeagueTableEntity leagueTable) {
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
        return "StandingEntity{" +
                "leagueTable=" + leagueTable +
                ", teamList=" + teamList +
                '}';
    }
}
