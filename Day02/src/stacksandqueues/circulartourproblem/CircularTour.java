package stacksandqueues.circulartourproblem;
import java.util.Stack;
class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        Stack<Integer> stack = new Stack<>();
        int totalSurplus = 0, currentSurplus = 0;

        for (int i = 0; i < n; i++) {
            int balance = petrol[i] - distance[i];
            totalSurplus += balance;
            currentSurplus += balance;

            stack.push(i);

            while (!stack.isEmpty() && currentSurplus < 0) {
                int removedIndex = stack.pop();
                currentSurplus -= (petrol[removedIndex] - distance[removedIndex]);
            }
        }

        return (totalSurplus >= 0) ? stack.firstElement(): -1;
    }

}
