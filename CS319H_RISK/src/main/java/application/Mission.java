package application;

import application.winstrategy.CheckWinStrategy;

import java.io.Serializable;
import java.lang.String;

public class Mission implements Serializable {
    private CheckWinStrategy strategy;

    Mission(CheckWinStrategy start){
        strategy = start;
    }

    public boolean checkWin(Player p){
        return strategy.checkWin(p);
    }

    public String getMissionName(){
        return strategy.getMissionName();
    }

    public String getMissionDetails(){
        return strategy.getMissionDetails();
    }


}