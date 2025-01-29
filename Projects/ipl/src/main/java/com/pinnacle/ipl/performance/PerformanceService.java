package com.pinnacle.ipl.performance;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.ipl.match.Match;

@Service
public class PerformanceService {
    private List<Performance> performances;

    PerformanceService() {
        this.performances = new ArrayList<>();
        performances.add(new Performance(1, 50, 30, 2, 4, 101, 201));
        performances.add(new Performance(2, 70, 40, 1, 3, 102, 202));
        performances.add(new Performance(3, 20, 15, 3, 2, 103, 203));
    }

    public List<Performance> getAllPerformance() {
        return performances;
    }

    public Performance getPerformance(int id) {
        if (performances.size() > 0) {
            return performances.stream()
                    .filter(perf -> perf.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public void createPerformance(Performance performance) {
        performances.add(performance);
    }

    public boolean deletePerformance(int id) {
        return performances.removeIf(perf -> perf.getId() == id);
    }
    
    public boolean updatePerformanceById(int id, Performance p) {
    	Performance upf = getPerformance(id);
    	if(upf == null) {
    		return false;
    	}
    	int idx = performances.indexOf(upf);
    	performances.set(idx, p);
    	return true;
    }	
}
