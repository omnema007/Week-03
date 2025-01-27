package singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        studentList.addAtBeginning(1, "Alice", 20, "A");
        studentList.addAtEnd(2, "Bob", 22, "B");
        studentList.addAtPosition(2, 3, "Charlie", 21, "C");

        System.out.println("All student records:");
        studentList.displayRecords();

        System.out.println("\nSearching for Roll Number 2:");
        studentList.searchByRollNumber(2);

        System.out.println("\nUpdating grade for Roll Number 3:");
        studentList.updateGrade(3, "A+");

        System.out.println("\nDeleting Roll Number 1:");
        studentList.deleteByRollNumber(1);

        System.out.println("\nAll student records after deletion:");
        studentList.displayRecords();
    }
}
