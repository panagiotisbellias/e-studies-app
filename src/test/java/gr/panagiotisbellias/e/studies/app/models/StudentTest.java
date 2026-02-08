package gr.panagiotisbellias.e.studies.app.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void constructor_shouldSetFieldsCorrectly() {
        Student student = new Student("Alice", "1");

        assertEquals("Alice", student.getName());
        assertEquals("1", student.getId());
    }

    @Test
    void defaultConstructor_shouldInitializeEmptyFields() {
        Student student = new Student();

        assertEquals("", student.getName());
        assertEquals("", student.getId());
    }

    @Test
    void setters_shouldUpdateFields() {
        Student student = new Student();

        student.setName("Bob");
        student.setId("2");

        assertEquals("Bob", student.getName());
        assertEquals("2", student.getId());
    }

    @Test
    void toString_shouldContainNameAndId() {
        Student student = new Student("Alice", "1");

        String result = student.toString();

        assertTrue(result.contains("Alice"));
        assertTrue(result.contains("1"));
    }
}
