package circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinSchedulingAlgorithm {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Add processes
        scheduler.addProcess(1, 10, 3);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 2);

        // Display initial processes
        scheduler.displayProcesses();


        scheduler.simulateScheduling(3);
    }
}
