package com.pinnacle.ipl.performance;

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
@RequestMapping("/perfs")
public class PerformanceController {

    @Autowired
    private PerformanceService performanceService;

    @GetMapping
    public List<Performance> getAllPerformances() {
        return performanceService.getAllPerformance();
    }

    @GetMapping("/{id}")
    public Performance getPerformance(@PathVariable("id") int id) {
        return performanceService.getPerformance(id);
    }
    
    @PutMapping("/{id}")
    public boolean updatePerf(@PathVariable("id") String id, @RequestBody Performance p) {
    	return performanceService.updatePerformanceById(Integer.parseInt(id), p);
    }
    
    @PostMapping
    public void createPerformance(@RequestBody Performance performance) {
        performanceService.createPerformance(performance);
    }

    @DeleteMapping("/{id}")
    public String deletePerformance(@PathVariable("id") int id) {
        boolean isDeleted = performanceService.deletePerformance(id);
        if (isDeleted) {
            return "Performance with ID " + id + " has been deleted.";
        } else {
            return "Performance with ID " + id + " not found.";
        }
    }
}
