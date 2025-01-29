package com.pinnacle.ipl.team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.ipl.player.Player;

@Service
public class TeamService {
    private List<Team> teams;

    TeamService() {
        teams = new ArrayList<>();
        teams.add(new Team(1, "Team Alpha", "Owner A"));
        teams.add(new Team(2, "Team Beta", "Owner B"));
        teams.add(new Team(3, "Team Gamma", "Owner C"));
    }

    public Team getTeamById(int id) {
        if (teams.size() > 0) {
            return teams.stream()
                    .filter(team -> team.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public List<Team> getAllTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public boolean updateTeamById(int id, Team t) {
        Team upp = getTeamById(id);
        if (upp == null) {
            return false;
        }
        int idx = teams.indexOf(upp);
        teams.set(idx, t);
        return true;
    }

    public boolean deleteTeam(int id) {
        return teams.removeIf(team -> team.getId() == id);
    }
}
