package service;

import connector.ApiConnector;
import entity.LeagueEntity;
import mapper.LeagueMapper;
import model.League;
import model.Season;
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
        return null;
    }

    @Override
    public List<Season> getListofAvailableSeasons(String leagueId) {
        return null;
    }
}
