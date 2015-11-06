package com.jude.prisoner;

import com.jude.Prisoner;
import com.jude.Manager;

/**
 * Created by monster on 2015/11/6.
 */
public class MonsterPrisoner implements Prisoner {
    int allCount;
    int allPerson;


    @Override
    public String getName() {
        return "林硕豪2015214068";
    }



    @Override
    public void begin(Manager manager,int allPerson, int allCount) {
        this.allCount = allCount;
        this.allPerson = allPerson;
    }



    @Override
    public int take(int num1, int num2) {
        return ((allCount-num2)/(num1+1) + 3)/2 + 1;
    }



    @Override
    public void result(boolean survived) {
    }
}
