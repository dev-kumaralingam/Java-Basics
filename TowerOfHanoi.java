import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoi {

    public static void moveDisks(int n, char source, char target, char auxiliary,
                                 Stack<Integer> sourceRod, Stack<Integer> targetRod, Stack<Integer> auxiliaryRod) {
        if (n == 1) {
            int disk = sourceRod.pop();
            targetRod.push(disk);
            System.out.println("Move disk " + disk + " from rod " + source + " to rod " + target);
            printRods(sourceRod, targetRod, auxiliaryRod);
            return;
        }
        moveDisks(n - 1, source, auxiliary, target, sourceRod, auxiliaryRod, targetRod);
        int disk = sourceRod.pop();
        targetRod.push(disk);
        System.out.println("Move disk " + disk + " from rod " + source + " to rod " + target);
        printRods(sourceRod, targetRod, auxiliaryRod);
        moveDisks(n - 1, auxiliary, target, source, auxiliaryRod, targetRod, sourceRod);
    }

    
    public static void printRods(Stack<Integer> sourceRod, Stack<Integer> targetRod, Stack<Integer> auxiliaryRod) {
        System.out.println("Rod A: " + sourceRod);
        System.out.println("Rod B: " + auxiliaryRod);
        System.out.println("Rod C: " + targetRod);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of disks: ");
        int numDisks = scanner.nextInt();

        
        Stack<Integer> sourceRod = new Stack<>();
        Stack<Integer> targetRod = new Stack<>();
        Stack<Integer> auxiliaryRod = new Stack<>();

        
        for (int i = numDisks; i >= 1; i--) {
            sourceRod.push(i);
        }

        
        System.out.println("Initial state:");
        printRods(sourceRod, targetRod, auxiliaryRod);

        
        System.out.println("The sequence of moves involved in the Tower of Hanoi are:");
        moveDisks(numDisks, 'A', 'C', 'B', sourceRod, targetRod, auxiliaryRod);

        scanner.close();
    }
}

