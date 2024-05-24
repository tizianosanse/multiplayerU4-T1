package entities;

import Interfaces.Reproduction;

import java.util.Scanner;

public class Mp3 extends MultimedialElements implements Reproduction {
 protected int duration;
 protected int volume;

 public Mp3(String title,int duration,int volume){
        super(title);
        this.duration = duration;
        this.volume = volume;

    }

    public int getDuration() {
        return duration;
    }

    public int getVolume() {
        return volume;
    }

    public int turnUpVolume(int volume) {
       return this.volume += volume;
    }
    public int turnDownVolume(int volume) {
    return this.volume -= volume;
    }
    public String esclVol (int volume) {
        String esc = "!";
        for (int i = 0; i <this.getVolume() ; i++) {
            esc+=esc;
        }
        return esc;

    }

    @Override
    public boolean play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write play or stop:");
        String play = sc.nextLine();
        if (play.equals("stop")) {
            System.out.println("Stopped playing");

            return false;
        }if (play.equals("play")){
            System.out.println("The song is playing");
            for (int i = 0; i < this.getDuration(); i++) {

                System.out.println(this.getTitle() + this.esclVol(this.volume));

            }
            System.out.println();

            System.out.println("Do you want Turn up or Tur dawn the volume? yes/no");

         ;
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("yes")) {
                System.out.println("do you want Turn up the volume or you want Turn dawn the volume? turn-up/turn-dawn");
               String TurnUpOrDawn = sc.nextLine();
               if (TurnUpOrDawn.equals("turn-up")) {
                   System.out.println(
                           "write an integer to raise the volume from the initial volume plus that value ="+" "+this.getVolume());
                   int value = sc.nextInt();
                   this.turnUpVolume(value);
                   System.out.println("the volume is: "+ this.getVolume());
                   System.out.println();

               } if (TurnUpOrDawn.equals("turn-dawn")) {
                   System.out.println(
                           "write an integer to lower the volume from the initial volume minus that value"+" ="+" "+this.getVolume());
                   int value = sc.nextInt();
                   this.turnDownVolume(value);
                    sc.close();
                }

            }

            return true;
        }else{
            System.out.println("la parola non e stata riconosciuta con successo");
            Scanner sc1 = new Scanner(System.in);

            return false;
        }


    }

}
