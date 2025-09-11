public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi puzzle
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            // Base case: only one disk to move
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        solveHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        solveHanoi(n - 1, auxiliary, source, destination);
    } 

    public static void main(String[] args) {
        int numberOfDisks = 3; 

        System.out.println("Tower of Hanoi solution for " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, 'A', 'B', 'C'); 
    } 
}
