package gr.panagiotisbellias.e.studies.app.util;

import gr.panagiotisbellias.e.studies.app.models.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentUtilTest {

    @AfterEach
    void resetStudents() throws Exception {
        Field field = StudentUtil.class.getDeclaredField("students");
        field.setAccessible(true);
        field.set(null, new ArrayList<>());
    }

    @Test
    void getAll_shouldReturnMessageWhenNoStudentsExist() {
        String result = StudentUtil.getAll();

        assertEquals("No students found", result);
    }

    @Test
    void getAll_shouldReturnFormattedStudentsWhenStudentsExist() throws Exception {
        Field field = StudentUtil.class.getDeclaredField("students");
        field.setAccessible(true);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "1"));
        students.add(new Student("Bob", "2"));

        field.set(null, students);

        String result = StudentUtil.getAll();

        assertTrue(result.contains("Name"));
        assertTrue(result.contains("ID"));
        assertTrue(result.contains("Alice"));
        assertTrue(result.contains("1"));
        assertTrue(result.contains("Bob"));
        assertTrue(result.contains("2"));
    }

    @Test
    void readInt_shouldReadIntegerFromScanner() {
        Scanner scanner = new Scanner("5");

        int result = StudentUtil.readInt(scanner);

        assertEquals(5, result);
    }

    @Test
    void getById_shouldReturnStudentWhenIdExists() throws Exception {
        Field field = StudentUtil.class.getDeclaredField("students");
        field.setAccessible(true);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "1"));

        field.set(null, students);

        // Simulate user input
        System.setIn(new java.io.ByteArrayInputStream("1\n".getBytes()));

        String result = StudentUtil.getById();

        assertTrue(result.contains("Alice"));
        assertTrue(result.contains("1"));
    }

    @Test
    void getById_shouldReturnMessageWhenStudentDoesNotExist() throws Exception {
        Field field = StudentUtil.class.getDeclaredField("students");
        field.setAccessible(true);

        field.set(null, new ArrayList<>());

        System.setIn(new java.io.ByteArrayInputStream("99\n".getBytes()));

        String result = StudentUtil.getById();

        assertTrue(result.contains("99"));
    }

}
