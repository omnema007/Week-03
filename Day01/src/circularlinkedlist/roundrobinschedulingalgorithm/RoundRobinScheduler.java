package circularlinkedlist.roundrobinschedulingalgorithm;

class RoundRobinScheduler {
    private Process head;
    private Process tail;

    // Add a new process to the end of the circular list
    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);

        if (head == null) {
            head = tail = newProcess;
            newProcess.next = head; // Make it circular
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head; // Maintain circular nature
        }
    }

    // Remove a process by Process ID
    public void removeProcess(int processID) {
        if (head == null) {
            System.out.println("No processes to remove.");
            return;
        }

        Process current = head;
        Process previous = tail;

        do {
            if (current.processID == processID) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Update tail to point to new head
                } else {
                    previous.next = current.next;
                }

                if (current == tail) {
                    tail = previous; // Update tail if the last process is removed
                }

                System.out.println("Process " + processID + " has been removed.");
                return;
            }

            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process " + processID + " not found.");
    }

    public void simulateScheduling(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        Process current = head;

        while (head != null) {
            current = head;
            do {
                if (current.burstTime > 0) {
                    int timeSpent = Math.min(current.burstTime, timeQuantum);
                    current.burstTime -= timeSpent;

                    System.out.println("Process " + current.processID + " executed for " + timeSpent + " units.");

                    // If the process is completed
                    if (current.burstTime == 0) {
                        System.out.println("Process " + current.processID + " has completed.");
                        removeProcess(current.processID);
                    }
                }

                current = current.next;
            } while (current != head);
        }

        System.out.println("All processes have been executed.");
    }

    // Display all processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process current = head;
        System.out.println("Processes in the queue:");
        do {
            System.out.println("Process ID: " + current.processID + ", Burst Time: " + current.burstTime +
                    ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }
}
