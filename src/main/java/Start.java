import application.Application;
import connector.ApiConnector;
import connector.FootballApiConnector;
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
