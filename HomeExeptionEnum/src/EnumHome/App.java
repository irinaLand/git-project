package EnumHome;

/**
 * Created by Ирина on 18.01.2016.
 */
public class App {
    public static void main(String[] args) {
        Position position=new Position(2,2);
        for (int i = 0; i <3 ; i++) {
            position.nextPosition();
            System.out.println(position.toString());
        }
    }
}
