import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import com.example.Course;

public class CourseTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Iniciando pruebas para Course.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finalizando pruebas para Course.");
    }

    @Test
    @DisplayName("Duración del curso.")
    void testGetDuration() {
        Course course = new Course("Default", 50, "Default");
        assertEquals(50, course.getDuration());
    }

    @Test
    void testGetProfessorUnassigned() {
        Course course = new Course("Automatización", 120);
        assertEquals("Unassigned", course.getProfessor());
    }

    @Test
    void testShowInformation() {
        Course course = new Course("Testing", 120, "Juan Perez");
        String expectedInfo = "Testing (120 hs) - Professor: Juan Perez";
        assertEquals(expectedInfo, course.showInformation());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/courses.csv", numLinesToSkip = 1)
    @DisplayName("Profesor asignado correctamente (parametrizado)")
    void testGetProfessorParameterized(String title, int duration, String professor) {
        Course course = new Course(title, duration, professor);
        assertEquals(professor, course.getProfessor());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/courses.csv", numLinesToSkip = 1)
    @DisplayName("Título del curso correcto (parametrizado)")
    void testGetTitleParameterized(String title, int duration, String professor) {
        Course course = new Course(title, duration, professor);
        assertEquals(title, course.getTitle());
    }
}