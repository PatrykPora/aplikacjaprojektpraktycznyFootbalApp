package repository;

import entity.LeagueEntity;
import entity.LogosEntity;
import entity.SeasonEntity;
import entity.TeamEntity;
import model.League;
import model.Season;
import model.Team;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public interface Repository {


    SessionFactory sessionFactory = new Configuration()
            .configure("hibernate.cfg.xml")
            .buildSessionFactory();


    List<LeagueEntity> getAllLeagues();


    LeagueEntity leagueDetails(String id);

    List<TeamEntity> winnerTeamOfSeasons(String leagueId);

    List<TeamEntity> standingsAfterSeason(String leagueId, int year);

    List<SeasonEntity> getListofAvailableSeasons(String leagueId);

    LeagueEntity save(LeagueEntity leagueEntity);

    LogosEntity save(LogosEntity logosEntity);

    SeasonEntity save(SeasonEntity seasonEntity);

    TeamEntity save(TeamEntity teamEntity);


}
