package application;

import model.League;
import service.AppService;

import java.util.List;
import java.util.Scanner;

public class Application {


    private final AppService appService;

    public Application(AppService appService) {
        this.appService = appService;
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

        do {
            System.out.println("football api");
            System.out.println("available options");
            System.out.println("1 - display available leagues");
            System.out.println("2 - download list of leagues and display");
            System.out.println("3 - download league object with details and display");
            System.out.println("4 - get list of league champions for selected league for all seasons and display");
            System.out.println("5 - get list of standings after selected season for selected league and display");
            System.out.println("6 - exit");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    List<League> list = appService.getAllLeagues();
                    list.stream().map(League::getId).forEach(System.out::println);
                    break;
                case 2:
                    List<League> leagueList = appService.getAllLeagues();
                    leagueList.stream().forEach(System.out::println);
                    break;
                case 3:
                    appService.getAllLeagues();
                    System.out.println("enter league id");
                    String leageId = scanner.nextLine();
                    League league = new League();
                    league = appService.leagueDetails(leageId);
                    System.out.println(league);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (userChoice < 6 && userChoice > 0);

    }

}
