package thePiramid;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert how big your piramid to be: ");
        int m= sc.nextInt();
        for (int i=1;i<=m;i++){
            for (int j=0;j<(m-i);j++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("/\\");
            }
            System.out.print("\n");
        }
    }
}