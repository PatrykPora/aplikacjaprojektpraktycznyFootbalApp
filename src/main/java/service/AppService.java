package service;

import model.League;
import model.Season;
import model.Team;

import java.util.List;

public interface AppService {

    public List<League> getAllLeagues();


    public League leagueDetails(String id);

    public List<Team> winnerTeamOfSeasons(String leagueId);

    public List<Team> standingsAfterSeason(String leagueId, int year);

    public List<Season> getListofAvailableSeasons(String leagueId);
}
