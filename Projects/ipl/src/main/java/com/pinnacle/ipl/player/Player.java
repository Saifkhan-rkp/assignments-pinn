package com.pinnacle.ipl.player;


public class Player {
    private int id;
    private String name;
    private String nationality;
    private String role;
    private int teamId;
    
	public Player(int id, String name, String nationality, String role, int teamId) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.role = role;
		this.teamId = teamId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
}
