package gr.panagiotisbellias.e.studies.app.util;

import gr.panagiotisbellias.e.studies.app.models.Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentUtil {

    private static ArrayList<Student> students = new ArrayList<>();

    public static String getAll() {

        if (students.isEmpty()) {
            return "No students found";
        }

        StringBuilder studentsInfo = new StringBuilder("Name\t\tID");
        for (Student student : students) {
            studentsInfo.append(student.getName()).append("\t").append(student.getId());
        }
        return studentsInfo.toString();

    }

    public static String getById() {
        System.out.print("Enter student's id: ");
        int id = getUserOption();

        for (Student student : students) {
            if (student.getId().equals(String.valueOf(id))) {
                return student.toString();
            }
        }

        return "There is no student with id: " + id;

    }

    private static int getUserOption() {
        int userOption;
        while (true) {
            try {
                userOption = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Only integer arithmetic positive please. Try again...");
                continue;
            }

            if (userOption > 0) {
                break;
            }
            System.out.println("You must provide positive integer. Please try again...");
        }

        return userOption;

    }
}
