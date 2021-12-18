package mapper;

import entity.StandingEntity;
import model.Standing;

public class StandingMapper {

    public static StandingEntity mapStandingToStandingEntity (Standing standing) {
        StandingEntity standingEntity = new StandingEntity();
        standingEntity.setTeamList(standing.getTeamList());
        standingEntity.setLeagueTable(LeagueTableMapper.mapLeagueTableToLeagueTableEntity(standing.getLeagueTable()));
    return standingEntity;
    }

    public static Standing mapStandingEntityToStanding (StandingEntity standingEntity) {
        Standing standing = new Standing();
        standing.setTeamList(standingEntity.getTeamList());
        standing.setLeagueTable(LeagueTableMapper.mapLeagueTableEntityToLeagueTable(standingEntity.getLeagueTable()));
        return standing;
    }
}
