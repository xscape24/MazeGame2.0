import jdk.swing.interop.SwingInterOpUtils;
import java.util.Random;
import java.util.Scanner;

/*      Class: CSE 1321L
        Section: Spring 2022
        Term: Spring 2022
        Instructor: Gayathri Yella
        Name: Eben Nduwimana
        Lab#: 6
*/
public class Lab6B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int userNum, randomNum;
        int count = 0;


        while (true) {
            System.out.println("Please enter a number between 1 and 1000:");
            userNum = scan.nextInt();
            if (userNum >= 1 && userNum <= 1000)
                break;
        }

        while (true) {
            randomNum = rand.nextInt(1000) + 1;
            count++;
            System.out.println("My guess was " + randomNum++);
            if (randomNum == userNum)
                break;
        }

        System.out.println("I guessed the number was " + userNum + " and it only took me " + count + " tries.");


    }
}