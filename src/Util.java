import java.util.ArrayList;
public class Util {
    public static void checkCoordinates(ArrayList<ArrayList<Integer>> list, int x, int y) {
        try {
            System.out.println((list.get(x)).get(y));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR!");
        }
    }
}
