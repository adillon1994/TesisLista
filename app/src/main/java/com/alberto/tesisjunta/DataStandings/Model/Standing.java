
package com.alberto.tesisjunta.DataStandings.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standing {

    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("won")
    @Expose
    private Integer won;
    @SerializedName("lost")
    @Expose
    private Integer lost;
    @SerializedName("streak")
    @Expose
    private String streak;
    @SerializedName("ordinal_rank")
    @Expose
    private String ordinalRank;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("team_id")
    @Expose
    private String teamId;
    @SerializedName("games_back")
    @Expose
    private Double gamesBack;
    @SerializedName("points_for")
    @Expose
    private Integer pointsFor;
    @SerializedName("points_against")
    @Expose
    private Integer pointsAgainst;
    @SerializedName("home_won")
    @Expose
    private Integer homeWon;
    @SerializedName("home_lost")
    @Expose
    private Integer homeLost;
    @SerializedName("away_won")
    @Expose
    private Integer awayWon;
    @SerializedName("away_lost")
    @Expose
    private Integer awayLost;
    @SerializedName("conference_won")
    @Expose
    private Integer conferenceWon;
    @SerializedName("conference_lost")
    @Expose
    private Integer conferenceLost;
    @SerializedName("last_five")
    @Expose
    private String lastFive;
    @SerializedName("last_ten")
    @Expose
    private String lastTen;
    @SerializedName("conference")
    @Expose
    private String conference;
    @SerializedName("division")
    @Expose
    private String division;
    @SerializedName("games_played")
    @Expose
    private Integer gamesPlayed;
    @SerializedName("points_scored_per_game")
    @Expose
    private String pointsScoredPerGame;
    @SerializedName("points_allowed_per_game")
    @Expose
    private String pointsAllowedPerGame;
    @SerializedName("win_percentage")
    @Expose
    private String winPercentage;
    @SerializedName("point_differential")
    @Expose
    private Integer pointDifferential;
    @SerializedName("point_differential_per_game")
    @Expose
    private String pointDifferentialPerGame;
    @SerializedName("streak_type")
    @Expose
    private String streakType;
    @SerializedName("streak_total")
    @Expose
    private Integer streakTotal;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getWon() {
        return won;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public String getStreak() {
        return streak;
    }

    public void setStreak(String streak) {
        this.streak = streak;
    }

    public String getOrdinalRank() {
        return ordinalRank;
    }

    public void setOrdinalRank(String ordinalRank) {
        this.ordinalRank = ordinalRank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Double getGamesBack() {
        return gamesBack;
    }

    public void setGamesBack(Double gamesBack) {
        this.gamesBack = gamesBack;
    }

    public Integer getPointsFor() {
        return pointsFor;
    }

    public void setPointsFor(Integer pointsFor) {
        this.pointsFor = pointsFor;
    }

    public Integer getPointsAgainst() {
        return pointsAgainst;
    }

    public void setPointsAgainst(Integer pointsAgainst) {
        this.pointsAgainst = pointsAgainst;
    }

    public Integer getHomeWon() {
        return homeWon;
    }

    public void setHomeWon(Integer homeWon) {
        this.homeWon = homeWon;
    }

    public Integer getHomeLost() {
        return homeLost;
    }

    public void setHomeLost(Integer homeLost) {
        this.homeLost = homeLost;
    }

    public Integer getAwayWon() {
        return awayWon;
    }

    public void setAwayWon(Integer awayWon) {
        this.awayWon = awayWon;
    }

    public Integer getAwayLost() {
        return awayLost;
    }

    public void setAwayLost(Integer awayLost) {
        this.awayLost = awayLost;
    }

    public Integer getConferenceWon() {
        return conferenceWon;
    }

    public void setConferenceWon(Integer conferenceWon) {
        this.conferenceWon = conferenceWon;
    }

    public Integer getConferenceLost() {
        return conferenceLost;
    }

    public void setConferenceLost(Integer conferenceLost) {
        this.conferenceLost = conferenceLost;
    }

    public String getLastFive() {
        return lastFive;
    }

    public void setLastFive(String lastFive) {
        this.lastFive = lastFive;
    }

    public String getLastTen() {
        return lastTen;
    }

    public void setLastTen(String lastTen) {
        this.lastTen = lastTen;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getPointsScoredPerGame() {
        return pointsScoredPerGame;
    }

    public void setPointsScoredPerGame(String pointsScoredPerGame) {
        this.pointsScoredPerGame = pointsScoredPerGame;
    }

    public String getPointsAllowedPerGame() {
        return pointsAllowedPerGame;
    }

    public void setPointsAllowedPerGame(String pointsAllowedPerGame) {
        this.pointsAllowedPerGame = pointsAllowedPerGame;
    }

    public String getWinPercentage() {
        return winPercentage;
    }

    public void setWinPercentage(String winPercentage) {
        this.winPercentage = winPercentage;
    }

    public Integer getPointDifferential() {
        return pointDifferential;
    }

    public void setPointDifferential(Integer pointDifferential) {
        this.pointDifferential = pointDifferential;
    }

    public String getPointDifferentialPerGame() {
        return pointDifferentialPerGame;
    }

    public void setPointDifferentialPerGame(String pointDifferentialPerGame) {
        this.pointDifferentialPerGame = pointDifferentialPerGame;
    }

    public String getStreakType() {
        return streakType;
    }

    public void setStreakType(String streakType) {
        this.streakType = streakType;
    }

    public Integer getStreakTotal() {
        return streakTotal;
    }

    public void setStreakTotal(Integer streakTotal) {
        this.streakTotal = streakTotal;
    }

}
