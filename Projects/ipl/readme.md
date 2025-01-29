PinnacleIPL

com.pinnacle.ipl

com.pinnacle.ipl.team
com.pinnacle.ipl.player
com.pinnacle.ipl.performance
com.pinnacle.ipl.match

Team
TeamController
TeamService

Player
PlayerController
PlayerService

Performance
PerformanceController
PerformanceService

Match
MatchController
MatchService

	Team
		TeamID
		TeamName
		OwnerName

	Player
		PlayerID
		PlayerName
		Nationality
		Role(Batsman,Bowler,Allrounder)
		TeamID
	Performance
		PerformanceID
		Runs
		Balls
		Wickets
		Overs
		PlayerID
		MatchID
	Match
		MatchID
		Date
		Venue
		Team1 Teamid
		Team2 Teamid
		Result
		