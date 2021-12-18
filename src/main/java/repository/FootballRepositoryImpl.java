package repository;

import entity.*;
import model.Standing;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.NoResultException;
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
        Query query = sessionFactory.openSession().createQuery("FROM TeamEntity t WHERE t.year = " + year);
        return query.getResultList();
    }


    @Override
    public StandingEntity standingAfterSeason(String leagueID, int year) {
        LeagueTableEntity leagueTableEntity = new LeagueTableEntity();
        leagueTableEntity.setLeagueID(leagueID);
        leagueTableEntity.setYear(year);
        StandingEntity standing = new StandingEntity();
        try (Session session = sessionFactory.openSession()) {
            standing = session.find(StandingEntity.class, leagueTableEntity);
            return standing;
        }
    }


    @Override
    public List<SeasonEntity> getListofAvailableSeasons(String leagueId) {
        Query query = sessionFactory.openSession().createQuery("FROM SeasonEntity");
        return query.getResultList();
    }

    @Override
    public StandingEntity save(StandingEntity standingEntity) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(standingEntity);
            transaction.commit();
        }
        return standingEntity;
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
