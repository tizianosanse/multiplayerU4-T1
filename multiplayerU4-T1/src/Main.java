import entities.Mp3;
import entities.Mp4;
import entities.MultimedialElements;
import entities.Png;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mp3 canzone2 = new Mp3("Wihthout me",5,2);

        Png image1= new Png("Avengers",2);
        Mp4 video2= new Mp4("react",2,1,2);
      canzone2.play();
//        video2.play();
//        image1.show();
        }

}