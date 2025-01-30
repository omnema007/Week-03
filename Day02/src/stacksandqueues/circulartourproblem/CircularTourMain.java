package stacksandqueues.circulartourproblem;

public class CircularTourMain {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = CircularTour.findStartingPoint(petrol, distance);

        if (start != -1) {
            System.out.println("Start at petrol pump index: " + start);
        } else {
            System.out.println("No possible tour");
        }
    }

}
