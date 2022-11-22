package gradepointaverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Can you enter your physics grade?");
        double pyhsics = input.nextDouble();

        System.out.println("Can you enter your math grade?");
        double math = input.nextDouble();

        System.out.println("Can you enter your turkish grade?");
        double turkish = input.nextDouble();

        System.out.println("Can you enter your chemistry grade?");
        double chemistry = input.nextDouble();

        double result = (pyhsics + math + turkish + chemistry) /4;

        System.out.println("Your course grade average :" + result);


    }
}
