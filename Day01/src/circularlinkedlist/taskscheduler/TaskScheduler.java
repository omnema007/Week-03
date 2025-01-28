package circularlinkedlist.taskscheduler;

class TaskScheduler {
    private Task head;
    private Task tail;
    private Task currentTask;

    // Add a task at the beginning
    public void addTaskAtBeginning(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);

        if (head == null) { // If the list is empty
            head = tail = newTask;
            newTask.next = head; // Make it circular
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; // Update tail to point to the new head
        }
    }

    // Add a task at the end
    public void addTaskAtEnd(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);

        if (tail == null) { // If the list is empty
            head = tail = newTask;
            newTask.next = head; // Make it circular
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head; // Maintain the circular nature
        }
    }

    // Add a task at a specific position
    public void addTaskAtPosition(int taskID, String taskName, int priority, String dueDate, int position) {
        if (position <= 1 || head == null) {
            addTaskAtBeginning(taskID, taskName, priority, dueDate);
            return;
        }

        Task newTask = new Task(taskID, taskName, priority, dueDate);
        Task current = head;
        int currentPosition = 1;

        while (currentPosition < position - 1 && current.next != head) {
            current = current.next;
            currentPosition++;
        }

        newTask.next = current.next;
        current.next = newTask;

        // Update tail if the new task is added at the end
        if (current == tail) {
            tail = newTask;
        }
    }

    // Remove a task by Task ID
    public void removeTask(int taskID) {
        if (head == null) {
            System.out.println("The task list is empty.");
            return;
        }

        Task current = head;
        Task previous = tail;

        do {
            if (current.taskID == taskID) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Update tail to point to the new head
                } else {
                    previous.next = current.next;
                }

                // If the removed task is the tail, update the tail
                if (current == tail) {
                    tail = previous;
                }

                System.out.println("Task with ID " + taskID + " has been removed.");
                return;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Task with ID " + taskID + " not found.");
    }

    // View the current task and move to the next task
    public void viewAndMoveToNextTask() {
        if (currentTask == null) {
            currentTask = head; // Start from the head if no task has been viewed
        }

        if (currentTask == null) {
            System.out.println("The task list is empty.");
            return;
        }

        System.out.println("Current Task: ID=" + currentTask.taskID + ", Name=" + currentTask.taskName +
                ", Priority=" + currentTask.priority + ", Due Date=" + currentTask.dueDate);
        currentTask = currentTask.next; // Move to the next task
    }

    // Display all tasks in the list starting from the head
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("The task list is empty.");
            return;
        }

        Task current = head;

        System.out.println("Task List:");
        do {
            System.out.println("ID=" + current.taskID + ", Name=" + current.taskName +
                    ", Priority=" + current.priority + ", Due Date=" + current.dueDate);
            current = current.next;
        } while (current != head);
    }

    // Search for tasks by Priority
    public void searchTasksByPriority(int priority) {
        if (head == null) {
            System.out.println("The task list is empty.");
            return;
        }

        Task current = head;
        boolean found = false;

        System.out.println("Tasks with Priority " + priority + ":");
        do {
            if (current.priority == priority) {
                System.out.println("ID=" + current.taskID + ", Name=" + current.taskName +
                        ", Due Date=" + current.dueDate);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tasks found with Priority " + priority + ".");
        }
    }
}
