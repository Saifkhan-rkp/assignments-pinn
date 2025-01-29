package com.pinnacle.ipl.match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Match> getAllMatches() {
        return matchService.getAllMatches();
    }
    
    @PostMapping
    public boolean addTeam(@RequestBody Match t) {
    	matchService.addMatch(t);
    	return true;
    }
    
    @PutMapping(value="/{id}")
    public boolean updateMatch(@PathVariable("id") String id, @RequestBody Match m) {
    	return matchService.updateMatchById(Integer.parseInt(id), m);
    }

    @GetMapping("/{id}")
    public Match getMatchById(@PathVariable("id") String id) {
        return matchService.getMatchById(Integer.parseInt(id));
    }

    @DeleteMapping("/{id}")
    public boolean deleteMatch(@PathVariable("id") int id) {
        return matchService.deleteMatch(id);
    }
}
