package connector;

import model.League;
import model.Season;
import model.Standing;
import model.Team;

import java.util.List;

public interface ApiConnector {


    List<League> getAllLeagues();


    League leagueDetails(String id);

    List<Team> winnerTeamOfSeasons(String leagueId);

    List<Team> standingsAfterSeason(String leagueId, int year);

    List<Season> getListofAvailableSeasons(String leagueId);

    Standing standingAfterSeason(String leagueID, int year);
}