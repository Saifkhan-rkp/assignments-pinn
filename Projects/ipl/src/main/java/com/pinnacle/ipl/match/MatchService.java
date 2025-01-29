package com.pinnacle.ipl.match;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MatchService {
    private List<Match> matches;


    MatchService(){
        this.matches = new ArrayList<>();
        matches.add(new Match(201, "2025-01-01", "Stadium A", 1, 2, "Team 1 Won"));
        matches.add(new Match(202, "2025-01-02", "Stadium B", 2, 3, "Team 2 Won"));
        matches.add(new Match(203, "2025-01-03", "Stadium C", 1, 3, "Team 3 Won"));
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public List<Match> getAllMatches() {
        return matches;
    }


    public Match getMatchById(int id) {
        if (matches.size() > 0) {
            return matches.stream()
                    .filter(perf -> perf.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public boolean deleteMatch(int id) {
        return matches.removeIf(match -> match.getId() == id);
    }
    
    public boolean updateMatchById(int id, Match m) {
    	Match upm = getMatchById(id);
    	if(upm == null) {
    		return false;
    	}
    	int idx = matches.indexOf(upm);
    	matches.set(idx, m);
    	return true;
    }
}
