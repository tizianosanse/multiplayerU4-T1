package entities;

import Interfaces.Reproduction;

public class Mp4 extends MultimedialElements implements Reproduction {
   protected int duration;


    @Override
    public boolean play() {
        return false;
    }


    public Mp4(String title,int duration){
        super(title);
        this.duration = duration;


    }


    public int getDuration() {
        return duration;
    }

    public int setDuration(int duration) {
        return this.duration = duration;
    }
}
