package com.pinnacle.ipl.player;

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
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/{id}")
    public Player getPlayer(@PathVariable("id") int id) {
        return playerService.getPlayer(id);
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
        return player;
    }

    @PutMapping("/{id}")
    public boolean updatePlayer(@PathVariable("id") String id, @RequestBody Player pl) {
        return playerService.updateMatchById(Integer.parseInt(id), pl);
    }

    @DeleteMapping("/{id}")
    public String deletePlayer(@PathVariable("id") int id) {
        boolean isDeleted = playerService.deletePlayer(id);
        if (isDeleted) {
            return "Player with ID " + id + " has been deleted.";
        } else {
            return "Player with ID " + id + " not found.";
        }
    }
}
