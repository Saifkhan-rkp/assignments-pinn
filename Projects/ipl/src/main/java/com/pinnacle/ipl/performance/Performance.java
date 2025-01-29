package com.pinnacle.ipl.performance;

public class Performance {
    private int id;
    private int runs;
    private int balls;
    private int wickets;
    private int overs;
    private int playerId;
    private int matchId;
    
	public Performance(int id, int runs, int balls, int wickets, int overs, int playerId, int matchId) {
		this.id = id;
		this.runs = runs;
		this.balls = balls;
		this.wickets = wickets;
		this.overs = overs;
		this.playerId = playerId;
		this.matchId = matchId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
}
