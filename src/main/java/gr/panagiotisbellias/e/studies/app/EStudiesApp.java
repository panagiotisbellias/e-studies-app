package gr.panagiotisbellias.e.studies.app;

import gr.panagiotisbellias.e.studies.app.models.Student;
import gr.panagiotisbellias.e.studies.app.util.StudentUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

/**
 * E Studies App
 *
 */
public class EStudiesApp {

    public static void main( String[] args ) throws IOException {
        // Create a Properties object
        Properties props = new Properties();

        // Get an InputStream for the application.properties file
        InputStream input = EStudiesApp.class.getClassLoader().getResourceAsStream("application.properties");

        // Load the properties from the InputStream
        props.load(input);

        // Close the InputStream
        input.close();

        // Retrieve the values from the Properties object
        String title = props.getProperty("appTitle");

        // Print the app title with a message
        System.out.println("Welcome to " + title);

        // Start user interaction
        run();

        // Print a goodbye message
        System.out.println("Goodbye");

    }

    private static void run() {

        ArrayList<Student> students = new ArrayList<>();

        boolean exit = false;
        while(true) {
            System.out.println(getOptions());

            switch(getUserOption()) {
                case 7:
                    exit = true;
                    break;
                case 6:
                    System.out.println(StudentUtil.getAll());
                    break;
                case 5:
                    System.out.println(StudentUtil.getById());
            }

            if (exit) {
                break;
            }
        }

    }

    private static String getOptions() {
        return "Choose what you want to do entering a number between 1-7:\n"
                + "1. Add new student and assign a unique id\n"
                + "According to his id:\n"
                + "2. Delete student\n"
                + "3. Find student\n"
                + "4. Update student's data\n"
                + "5. Print a student's data\n"
                + "And\n"
                + "6. Print data of all students\n"
                + "7. Quit";
    }

    private static int getUserOption() {
        int userOption;
        while (true) {
            try {
                userOption = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Only integer arithmetic value 1 to 7 please. Try again...");
                continue;
            }

            if (userOption >= 1 && userOption <= 7) {
                break;
            }
            System.out.println("You must choose from 1 to 7. Please try again...");
        }

        return userOption;

    }

}
