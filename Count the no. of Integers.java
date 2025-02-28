import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[10];
        int count = 0;

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            ar[i] = sc.nextInt(); 
        }

        for (int i = 0; i < ar.length; i++) {
            count++;
        }

        System.out.println("Number of integers entered: " + count);
        
        sc.close(); 
    }
}

