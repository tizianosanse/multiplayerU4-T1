import entities.Mp3;
import entities.Mp4;
import entities.MultimedialElements;
import entities.Png;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mp3 canzone2 = new Mp3("Wihthout me",5,2);

        Png image1= new Png("Avengers",2);
        Mp4 video2= new Mp4("react",2,1,2);
//      canzone2.play();
//       video2.play();
//        image1.show();
        Scanner sc= new Scanner(System.in);
        String[] arr=new String[5];
        System.out.println("create an object");
        String value = sc.nextLine();
        arr[0]=value;
        System.out.println("hai aggiunto un oggetto inseriscine un altro");
        String value2 = sc.nextLine();
        arr[1]=value2;
        System.out.println("hai aggiunto un oggetto inseriscine un altro");
        String value3 = sc.nextLine();
        arr[2]=value3;
        System.out.println("hai aggiunto un oggetto inseriscine un altro");
        String value4 = sc.nextLine();
        arr[3]=value4;
        System.out.println("hai aggiunto un oggetto inseriscine un altro");
        String value5 = sc.nextLine();
        arr[4]=value5;
        System.out.println("scegli un oggetto inserendo un numero da 1 a 5");
        int select = sc.nextInt();
        if (select == 1){
            System.out.println(value);
        }if (select == 2){
            System.out.println(value2);
        }if (select == 3){
            System.out.println(value3);
        }if (select == 4){
            System.out.println(value4);
        }if (select == 5){
            System.out.println(value5);
        }
        }

}