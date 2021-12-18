package service;

import connector.ApiConnector;
import entity.LeagueEntity;
import entity.SeasonEntity;
import entity.StandingEntity;
import entity.TeamEntity;
import mapper.LeagueMapper;
import mapper.SeasonMapper;
import mapper.StandingMapper;
import mapper.TeamMapper;
import model.League;
import model.Season;
import model.Standing;
import model.Team;
import repository.Repository;

import java.util.List;
import java.util.stream.Collectors;

public class AppServiceImpl implements AppService {


    private final ApiConnector apiConnector;
    private final Repository repository;

    public AppServiceImpl(ApiConnector apiConnector, Repository repository) {
        this.apiConnector = apiConnector;
        this.repository = repository;
    }

    @Override
    public List<League> getAllLeagues() {
        List<LeagueEntity> leagueList = repository.getAllLeagues();

        if (leagueList.isEmpty()) {
            List<League> list = apiConnector.getAllLeagues();
            leagueList = list.stream()
                    .map(LeagueMapper::mapLeagueToLeagueEntity)
                    .collect(Collectors.toList());
            for (LeagueEntity le : leagueList) {
                repository.save(le);
            }
            return list;
        } else {
            List<League> list = leagueList.stream()
                    .map(LeagueMapper::mapLeagueEntityToLeague)
                    .collect(Collectors.toList());
            return list;
        }
    }


    @Override
    public League leagueDetails(String id) {
        LeagueEntity leagueEntity = repository.leagueDetails(id);

        if (leagueEntity == null) {
            League league = apiConnector.leagueDetails(id);
            leagueEntity = LeagueMapper.mapLeagueToLeagueEntity(league);
            repository.save(leagueEntity);
            return league;
        } else {
            League league = LeagueMapper.mapLeagueEntityToLeague(leagueEntity);
            return league;
        }
    }


    @Override
    public List<Team> winnerTeamOfSeasons(String leagueId) {
        return null;
    }

    @Override
    public List<Team> standingsAfterSeason(String leagueId, int year) {

//        List<Team> teamList = apiConnector.standingsAfterSeason(leagueId, year);
//        return teamList;
                List<TeamEntity> teamEntityList = repository.standingsAfterSeason(leagueId, year);

        if (teamEntityList.isEmpty()) {
            List<Team> teams = apiConnector.standingsAfterSeason(leagueId, year);
            teamEntityList = teams.stream()
                    .map(TeamMapper::mapTeamToTeamEntity)
                    .collect(Collectors.toList());
            for (TeamEntity te : teamEntityList) {
                repository.save(te);
            }
            return teams;
        } else {
            List<Team> teamList = teamEntityList.stream()
                    .map(TeamMapper::mapTeamEntityToTeam)
                    .collect(Collectors.toList());
            return teamList;
        }
    }

    @Override
    public Standing standingAfterSeason(String leagueID, int year) {
        StandingEntity standingEntity = new StandingEntity();
        standingEntity = repository.standingAfterSeason(leagueID,year);

        if (standingEntity == null) {

            Standing standing = apiConnector.standingAfterSeason(leagueID,year);
            standingEntity = StandingMapper.mapStandingToStandingEntity(standing);
            repository.save(standingEntity);
            return standing;
        } else {
            Standing standing = new Standing();
            standing = StandingMapper.mapStandingEntityToStanding(standingEntity);
            return standing;
        }
    }

    @Override
    public List<Season> getListofAvailableSeasons(String leagueId) {
        List<SeasonEntity> seasonEntities = repository.getListofAvailableSeasons(leagueId);

        if (seasonEntities.isEmpty()) {
            List<Season> seasons = apiConnector.getListofAvailableSeasons(leagueId);
            seasonEntities = seasons.stream()
                    .map(SeasonMapper::mapSeasonToSeasonEntity)
                    .collect(Collectors.toList());
            for (SeasonEntity se : seasonEntities) {
                repository.save(se);
            }
            return seasons;
        } else {
            List<Season> seasonList = seasonEntities.stream()
                    .map(SeasonMapper::mapSeasonEntityToSeason)
                    .collect(Collectors.toList());
            return seasonList;
        }
    }


}
