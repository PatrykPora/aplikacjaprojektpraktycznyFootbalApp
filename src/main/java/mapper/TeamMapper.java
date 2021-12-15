package mapper;

import entity.TeamEntity;
import model.Team;

public class TeamMapper {

    public static Team mapTeamEntityToTeam (TeamEntity teamEntity) {
        Team team = new Team();

        team.setName(teamEntity.getName());
        team.setYear(teamEntity.getYear());

        return team;
    }

    public static TeamEntity mapTeamToTeamEntity (Team team) {
        TeamEntity teamEntity = new TeamEntity();

        teamEntity.setName(team.getName());
        teamEntity.setYear(team.getYear());

        return teamEntity;
    }

}
