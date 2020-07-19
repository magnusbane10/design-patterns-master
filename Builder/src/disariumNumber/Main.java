package disariumNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number.");
        int input = sc.nextInt();
        String check = "" + input;
        int count = 0;
        long sum = 0L;

        for (char x : check.toCharArray()) {
            sum += (Math.pow(Integer.parseInt(check.charAt(count) + ""), ++count));
        }
        System.out.println(sum);
        do{


            if (sum == input) {
                System.out.println("Disarium Number:" + input);
            } else {
                System.out.println("Not Disarium number:" + input);
                System.out.println("Try again");

            }
        }while (sum != input);
    }

}
