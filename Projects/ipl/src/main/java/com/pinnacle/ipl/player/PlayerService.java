package com.pinnacle.ipl.player;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private List<Player> players;

    PlayerService() {
        players = new ArrayList<>();
        players.add(new Player(101, "Player A", "India", "Batsman", 1));
        players.add(new Player(102, "Player B", "Australia", "Bowler", 2));
        players.add(new Player(103, "Player C", "England", "All-Rounder", 3));
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public List<Player> getAllPlayers() {
        return players;
    }

    public Player getPlayer(Integer id) {
        if (players.size() > 0) {
            return players.stream()
                    .filter(pl -> pl.getId() == id)
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public boolean updateMatchById(int id, Player pl) {
        Player upp = getPlayer(id);
        if (upp == null) {
            return false;
        }
        int idx = players.indexOf(upp);
        players.set(idx, pl);
        return true;
    }

    public boolean deletePlayer(Integer id) {
        return players.removeIf(pl -> pl.getId() == id);
    }
}
