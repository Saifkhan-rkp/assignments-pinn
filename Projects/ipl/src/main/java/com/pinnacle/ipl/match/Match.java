package com.pinnacle.ipl.match;

public class Match {
    private int id;
    private String date;
    private String venue;
    private int team1Id;
    private int team2Id;
    private String result;
	public Match(int id, String date, String venue, int team1Id, int team2Id, String result) {
		this.id = id;
		this.date = date;
		this.venue = venue;
		this.team1Id = team1Id;
		this.team2Id = team2Id;
		this.result = result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public int getTeam1Id() {
		return team1Id;
	}
	public void setTeam1Id(int team1Id) {
		this.team1Id = team1Id;
	}
	public int getTeam2Id() {
		return team2Id;
	}
	public void setTeam2Id(int team2Id) {
		this.team2Id = team2Id;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
