package mapper;

import entity.LeagueEntity;
import model.League;

public class LeagueMapper {

    public static League mapLeagueEntityToLeague(LeagueEntity leagueEntity){
        League league = new League();

        league.setName(leagueEntity.getName());
        league.setAbbr(leagueEntity.getAbbr());
        league.setId(leagueEntity.getId());
        league.setSlug(leagueEntity.getSlug());
        league.setLogos(LogosMapper.mapLogosEntityToLogos(leagueEntity.getLogosEntity()));
        return league;
    }

    public static  LeagueEntity mapLeagueToLeagueEntity(League league){
        LeagueEntity leagueEntity = new LeagueEntity();

        leagueEntity.setLogosEntity(LogosMapper.mapLogosToLogosEntity(league.getLogos()));
        leagueEntity.setName(league.getName());
        leagueEntity.setAbbr(league.getAbbr());
        leagueEntity.setSlug(league.getSlug());
        leagueEntity.setId(league.getId());

        return leagueEntity;
    }

}
