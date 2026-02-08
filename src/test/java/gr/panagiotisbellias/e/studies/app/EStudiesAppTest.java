package gr.panagiotisbellias.e.studies.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EStudiesAppTest {

    @Test
    void getOptions_shouldContainAllMenuOptions() {
        String options = invokeGetOptions();

        assertTrue(options.contains("1. Add new student"));
        assertTrue(options.contains("5. Print a student's data"));
        assertTrue(options.contains("6. Print data of all students"));
        assertTrue(options.contains("7. Quit"));
    }

    // Reflection helper to access private method
    private String invokeGetOptions() {
        try {
            var method = EStudiesApp.class.getDeclaredMethod("getOptions");
            method.setAccessible(true);
            return (String) method.invoke(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
