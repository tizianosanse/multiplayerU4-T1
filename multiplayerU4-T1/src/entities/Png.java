package entities;

import java.util.Scanner;

public class Png extends MultimedialElements{
   protected int light;
    public Png(String title,int light){
        super(title);
        this.light = light;


    }

    public int getLight() {
        return light;
    }
    public String astlLightPng () {
        String esc = "*";
        for (int i = 0; i <this.getLight()- 1 ; i++) {
            esc+=esc;
        }
        return esc;

    }
    public boolean show (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write show to show the image:");
        String show = sc.nextLine();
        if (show.equals("show")){
            System.out.println(this.getTitle() +this.astlLightPng());
        }



        return true;
    }
}
