/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Stefan
 */
public class Game {

    private Player[] players;
    private World[] worlds;
    private Player activePlayer;
    private int dayTime, day, month, year, activePlayerIndex;

    public Game(Player[] players, World[] worlds) {
        this.players = players;
        this.worlds = worlds;
        this.activePlayer = players[0];
        activePlayerIndex = 0;
        dayTime = 0;
        day = 1;
        month = 1;
        year = 1;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public String getTextForStatusLine(){
        return getDate()+"     "+worlds[0].getName()+": "+activePlayer.getLocation().getName();
    }
    
    private String getDate() {
        if (day == 1) {
            return getDayTime() + " " + day + "st " + getMonth() + " Year: " + year;
        } else if (day == 2) {
            return getDayTime() + " " + day + "nd " + getMonth() + " Year: " + year;
        } else if (day == 3) {
            return getDayTime() + " " + day + "rd " + getMonth() + " Year: " + year;
        } else {
            return getDayTime() + " " + day + "th " + getMonth() + " Year: " + year;
        }
    }

    private String getMonth() {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "Decemeber";
            default:
                return "CHYBA";
        }
    }

    private int getLengthOfMonth() {
        switch (month) {
            case 1:
                return 31;
            case 2:
                return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    private String getDayTime() {
        switch (dayTime) {
            case 0:
                return "Morning";
            case 1:
                return "Afternoon";
            case 2:
                return "Evening";
            case 3:
                return "Night";
            default:
                return "CHYBA";
        }
    }

    public void nextTurn() {
        activePlayerIndex = (activePlayerIndex + 1) % players.length;
        if (activePlayerIndex == 0) {
            dayTime++;
            if (dayTime % 4 == 0) {
                dayTime = 0;
                day++;
                if (day > getLengthOfMonth()) {
                    day = 1;
                    month++;
                    if (month > 12) {
                        month = 1;
                        year++;
                    }
                }
            }
        }
        activePlayer = players[activePlayerIndex];
        activePlayer.resetForNextTurn();
    }
}
