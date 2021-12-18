package mapper;

import entity.LeagueTableEntity;
import model.LeagueTable;

public class LeagueTableMapper {

    public static LeagueTable mapLeagueTableEntityToLeagueTable(LeagueTableEntity leagueTableEntity){
        LeagueTable leagueTable = new LeagueTable();
        leagueTable.setLeagueID(leagueTableEntity.getLeagueID());
        leagueTable.setYear(leagueTableEntity.getYear());

        return leagueTable;
    }

    public static LeagueTableEntity mapLeagueTableToLeagueTableEntity (LeagueTable leagueTable) {
        LeagueTableEntity leagueTableEntity = new LeagueTableEntity();
        leagueTableEntity.setLeagueID(leagueTable.getLeagueID());
        leagueTableEntity.setYear(leagueTable.getYear());

        return leagueTableEntity;
    }
}
