/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author boyst
 */
public class Teams {
    private String team_name;
    private int team_id;
    private int solved_questions;
    private int elapsed_time;
    private final int questions = 10;
    private final int time = 300;
    
    public Teams() {
        setSolved_questions();
        setElapsed_time();
    }

    public Teams(String team_name, int team_id) {
        setTeam_name(team_name);
        setTeam_id(team_id);
        setSolved_questions();
        setElapsed_time();
    }

    private void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    private void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    private void setSolved_questions() {
        double solved_questions = Math.random()*questions;
        this.solved_questions = (int)solved_questions;
    }

    private void setElapsed_time() {
//        double elapsed_time = 0;
//        if (this.solved_questions != 0){
            double elapsed_time = Math.random()*time;
//        }
        this.elapsed_time = (int)elapsed_time;
    }

    public String getTeam_name() {
        return team_name;
    }

    public int getTeam_id() {
        return team_id;
    }

    public int getSolved_questions() {
        return solved_questions;
    }

    public int getElapsed_time() {
        return elapsed_time;
    }
    
    
}
