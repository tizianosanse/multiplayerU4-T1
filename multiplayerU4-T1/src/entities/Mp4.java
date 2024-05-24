package entities;

import Interfaces.Reproduction;

import java.util.Scanner;

public class Mp4 extends MultimedialElements implements Reproduction {
   protected int duration;
   protected int volume;
   protected int light;
    public Mp4(String title,int duration,int volume,int light){
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.light = light;



    }

    public int getDuration() {
        return duration;
    }

    public int setDuration(int duration) {
        return this.duration = duration;
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
        for (int i = 0; i <this.getVolume() -1 ; i++) {
            esc+=esc;
        }
        return esc;

    }

    public int getLight() {
        return light;
    }

    public int turnUpLight(int light){
        return this.light += light;
    }
    public int turnDawnLight(int light){
        return this.light -= light;
    }
    public String astlLight (int light) {
        String esc = "*";
        for (int i = 0; i <this.getLight() -1; i++) {
           return esc+=esc;
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
            System.out.println("The video is playing");
            for (int i = 0; i < this.getDuration(); i++) {

                System.out.println(this.getTitle() + this.esclVol(this.volume)+ this.astlLight(this.light));

            }


            System.out.println("Do you want Turn up or Turn dawn the volume or the Light? yes/no");


            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("yes")) {
                System.out.println("do you want Turn up the volume or you want Turn dawn the volume or the light? volume/light");
                String TurnUpOrDawnVolOrLight = sc.nextLine();
                if (TurnUpOrDawnVolOrLight.equals("volume")) {
                    System.out.println("do you want turn-up the volume or turn-dawn? turn-up/turn-dawn");
                   String TurnUpOrDawnVol = sc.nextLine();
                   if (TurnUpOrDawnVol.equals("turn-up")){ System.out.println(
                           "write an integer to raise the volume from the initial volume plus that value ="+" "+this.getVolume());
                       int value = sc.nextInt();
                       this.turnUpVolume(value);
                       System.out.println("the volume is: "+ this.getVolume());
                   }if (TurnUpOrDawnVol.equals("turn-dawn")){
                        System.out.println(
                                "write an integer to lower the volume from the initial volume minus that value"+" ="+" "+this.getVolume());
                        int valueV = sc.nextInt();
                        this.turnDownVolume(valueV);
                        System.out.println("the volume is: "+ this.getVolume());
                    }



                } if (TurnUpOrDawnVolOrLight.equals("light")) {
                    System.out.println("do you want turn-up the light or turn-dawn? turn-up/turn-dawn");
                    String TurnUpOrDawnLight = sc.nextLine();
                    if (TurnUpOrDawnLight.equals("turn-up")){ System.out.println(
                            "write an integer to raise the light from the initial light plus that value ="+" "+this.getLight());
                        int value = sc.nextInt();
                        this.turnUpLight(value);
                        System.out.println("the volume is: "+ this.getLight());
                    }if (TurnUpOrDawnLight.equals("turn-dawn")){
                        System.out.println(
                                "write an integer to lower the volume from the initial volume minus that value"+" ="+" "+this.getLight());
                        int valueL = sc.nextInt();
                        this.turnDawnLight(valueL);
                        System.out.println("the light is: "+ this.getLight());
                    }

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
