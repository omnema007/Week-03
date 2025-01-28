package circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks
        scheduler.addTaskAtEnd(1, "Complete Assignment", 1, "30-01-205");
        scheduler.addTaskAtEnd(2, "Prepare Presentation", 2, "29-01-205");
        scheduler.addTaskAtBeginning(3, "Buy Groceries", 3, "30-01-205");
        scheduler.addTaskAtPosition(4, "Attend Meeting", 2, "31-01-205", 2);

        // Display all tasks
        scheduler.displayAllTasks();

        // View current task and move to the next
        scheduler.viewAndMoveToNextTask();
        scheduler.viewAndMoveToNextTask();

        // Search for tasks by priority
        scheduler.searchTasksByPriority(2);

        // Remove a task
        scheduler.removeTask(2);

        // Display all tasks after removal
        scheduler.displayAllTasks();

        // Try to view next task after removal
        scheduler.viewAndMoveToNextTask();
    }
}
