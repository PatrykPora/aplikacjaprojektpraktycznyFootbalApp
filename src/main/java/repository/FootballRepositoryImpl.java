package repository;

import entity.LeagueEntity;
import entity.LogosEntity;
import entity.SeasonEntity;
import entity.TeamEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class FootballRepositoryImpl implements Repository {


    @Override
    public List<LeagueEntity> getAllLeagues() {
        Query query = sessionFactory.openSession().createQuery("FROM LeagueEntity");
        return query.getResultList();
    }

    @Override
    public LeagueEntity leagueDetails(String id) {
        LeagueEntity leagueEntity = new LeagueEntity();
        try (Session session = sessionFactory.openSession()) {
            leagueEntity = session.find(LeagueEntity.class, id);
            return leagueEntity;
        }
    }

    @Override
    public List<TeamEntity> winnerTeamOfSeasons(String leagueId) {
        // TODO potrzebna nowa encja dla zwycięskich teamow,
        //  poniewaz wykorzystujemy juz ta encje do standings after season

        return null;
    }

    @Override
    public List<TeamEntity> standingsAfterSeason(String leagueId, int year) {
        Query query = sessionFactory.openSession().createQuery("FROM TeamEntity");
        return query.getResultList();
    }

    @Override
    public List<SeasonEntity> getListofAvailableSeasons(String leagueId) {
        Query query = sessionFactory.openSession().createQuery("FROM SeasonEntity");
        return query.getResultList();
    }

    @Override
    public LeagueEntity save(LeagueEntity leagueEntity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(leagueEntity);
            transaction.commit();
        }
        return leagueEntity;
    }

    @Override
    public LogosEntity save(LogosEntity logosEntity) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(logosEntity);
            transaction.commit();
        }
        return logosEntity;
    }

    @Override
    public SeasonEntity save(SeasonEntity seasonEntity) {

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(seasonEntity);
            transaction.commit();
        }
        return seasonEntity;
    }

    @Override
    public TeamEntity save(TeamEntity teamEntity) {

        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(teamEntity);
            transaction.commit();
        }
        return teamEntity;
    }

}
