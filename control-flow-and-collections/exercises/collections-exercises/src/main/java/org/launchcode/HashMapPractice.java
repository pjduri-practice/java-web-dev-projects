package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String newStudent;
        System.out.println("Enter student information (or Enter to quit):");
        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.println("ID: ");
                Integer newStudentId = input.nextInt();
                students.put(newStudentId, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("Class roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.printf("ID: %1$s %2$sName: %3$s",
                    student.getKey(), System.lineSeparator(), student.getValue());
        }
    }

}
