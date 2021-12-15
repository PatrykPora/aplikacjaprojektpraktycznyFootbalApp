import application.Application;
import connector.ApiConnector;
import connector.FootballApiConnector;
import entity.LeagueEntity;
import entity.LogosEntity;
import entity.TeamEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import repository.FootballRepositoryImpl;
import repository.Repository;
import service.AppService;
import service.AppServiceImpl;


public class Start {


    public static void main(String[] args) {
        ApiConnector apiConnector = new FootballApiConnector();
        Repository repository = new FootballRepositoryImpl();
        AppService appService = new AppServiceImpl(apiConnector,repository);

        new Application(appService).start();


    }

}
