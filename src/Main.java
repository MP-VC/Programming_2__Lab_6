import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int option;
        int option2;
        Scanner scanner = new Scanner(System.in);
        //Loop to create array
        System.out.println("Size of the array:");
        option = scanner.nextInt();
        for (int i = 0; i < option; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            System.out.println("Size of the " + i +"th inner array:");
            option2 = scanner.nextInt();
            System.out.println("Enter elements in array:");
            for (int j = 0; j < option2; j++) {
                temp.add(scanner.nextInt());
            }
            list.add(temp);
        }
        System.out.println(list);

        //loop to check coordinates
        System.out.println("number of coordinates to check:");
        option = scanner.nextInt();
        for (int i = 0; i < option; i++) {
            System.out.println("enter coordinates in array:");
            System.out.println("Outer:");
            int x = scanner.nextInt();
            System.out.println("Inner:");
            int y = scanner.nextInt();
            System.out.println((list.get(x)).get(y));
        }
    }
}