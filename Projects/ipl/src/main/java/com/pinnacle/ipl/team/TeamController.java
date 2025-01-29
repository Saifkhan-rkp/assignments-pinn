package com.pinnacle.ipl.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(value = "/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @PostMapping
    public boolean addTeam(@RequestBody Team t) {
    	teamService.addTeam(t);
    	return true;
    }

    @PutMapping("/{id}")
    public boolean updateTeam(@PathVariable Integer id, @RequestBody Team t) {
        
        return teamService.updateTeamById(id, t);
    }
    
    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable("id") String id) {
        return teamService.getTeamById(Integer.parseInt(id));
    }

    @DeleteMapping("/{id}")
    public boolean deleteTeam(@PathVariable("id") int id) {
        return teamService.deleteTeam(id);
    }
}
