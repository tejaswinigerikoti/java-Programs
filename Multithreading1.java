import java.util.*;

class Addition extends Thread {
    public void run() {
        System.out.println("Addition task started");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num1:");
        int num1 = sc.nextInt();

        System.out.println("Enter the value of num2:");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The result is: " + sum);
        System.out.println("Addition task completed");
    }
}

class CharacterPrint extends Thread {
    public void run() {
        System.out.println("Character printing started");

        for (int i = 65; i <= 75; i++) {
            System.out.println("The character is: " + (char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Character printing task completed");
    }
}

class NumberPrint extends Thread {
    public void run() {
        System.out.println("Number printing started");

        for (int i = 1; i <= 10; i++) {
            System.out.println("The number is: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Number printing task completed");
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        Addition a = new Addition();
        CharacterPrint c = new CharacterPrint();
        NumberPrint n = new NumberPrint();

        a.start();
        c.start();
        n.start();
    }
}
