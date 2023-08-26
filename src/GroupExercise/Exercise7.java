package GroupExercise;

public class Exercise7 {public static void main(String[] args) {
    int max = 10;
    int first = 0;
    int next = 1;
    System.out.print("Fibonacci Series of " + max + " numbers:");
    for (int i = 1; i <= max; ++i) {
        System.out.print(first + " ");

        int sum = first + next;
        first = next;
        next = sum;

    }
}
}




