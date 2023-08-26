package GroupExercise;

public class Exercise1 {public static void main(String[] args) {

    int[] temperatures = {70, 75, 87, 67, 90, 95, 98};
    int highest = temperatures[0];
    int lowest = temperatures[0];

    for (int i = 0; i < temperatures.length; i++) {
        if(temperatures[i]<lowest){
            lowest=temperatures[i];
        }
        if(temperatures[i]>highest){
            highest=temperatures[i];
        }
    }
    System.out.println("Lowest Temperature is "+lowest);
    System.out.println("Highest Temperature is "+highest);
}
}


