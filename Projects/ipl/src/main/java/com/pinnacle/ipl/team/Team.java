package com.pinnacle.ipl.team;

public class Team {
    private int id;
    private String teamName;
    
    public Team(int id, String teamName, String ownerName) {
		this.id = id;
		this.teamName = teamName;
		this.ownerName = ownerName;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	private String ownerName;
}
