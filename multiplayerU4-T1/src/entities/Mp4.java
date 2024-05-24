package entities;

import Interfaces.Reproduction;

public class Mp4 extends MultimedialElements implements Reproduction {
   protected int durata;

    @Override
    public boolean play() {
        return true;
    }

    public Mp4(String title,int durata){
        super(title);
        this.durata = durata;


    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
