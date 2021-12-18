import application.Application;
import connector.ApiConnector;
import connector.FootballApiConnector;
import entity.LeagueTableEntity;
import entity.StandingEntity;
import model.Standing;
import model.Team;
import repository.FootballRepositoryImpl;
import repository.Repository;
import service.AppService;
import service.AppServiceImpl;

import java.util.List;


public class Start {


    public static void main(String[] args) {
//        ApiConnector apiConnector = new FootballApiConnector();
        Repository repository = new FootballRepositoryImpl();
//        AppService appService = new AppServiceImpl(apiConnector,repository);
//
//        new Application(appService).start();
//


        StandingEntity standing = new StandingEntity();
        LeagueTableEntity leagueTableEntity = new LeagueTableEntity();
        leagueTableEntity.setLeagueID("esp.1");
        leagueTableEntity.setYear(2010);
        standing.setLeagueTable(leagueTableEntity);
        repository.save(standing);
    }

}
