import entities.Mp3;
import entities.Mp4;
import entities.MultimedialElements;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mp3 canzone1 = new Mp3("Rap-God",5,3);
        Mp4 video1 = new Mp4("EPICODE",10,5,7);
//       canzone1.play();
        video1.play();
        }

}