package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import com.example.Course;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
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
    @Order(1)
    @Tag("smoke")
    @DisplayName("Duración del curso.")
    void testGetDuration() {
        Course course = new Course("Default", 50, "Default");
        assertEquals(50, course.getDuration());
    }

    @Test
    @Tag("regression")
    @Order(2)
    void testGetProfessorUnassigned() {
        Course course = new Course("Automatización", 120);
        assertEquals("Unassigned", course.getProfessor());
    }

    @Test
    @Order(3)
    void testShowInformation() {
        Course course = new Course("Testing", 120, "Juan Perez");
        String expectedInfo = "Testing (120 hs) - Professor: Juan Perez";
        assertEquals(expectedInfo, course.showInformation());
    }

    @Tag("regression")
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

    static Stream<Arguments> courseDataProvider() {
        return Stream.of(
                arguments("Testing", 120, "Juan Perez"),
                arguments("Automatización", 100, "Maria Lopez"),
                arguments("Prgramación", 100, "Giuliana Bentancor"));
    }

    @ParameterizedTest
    @MethodSource("courseDataProvider")
    @DisplayName("Profesor asignado correctamente (con MethodSource)")
    void testGetProfessorWithMethodSource(String title, int duration, String professor) {
        Course course = new Course(title, duration, professor);
        assertEquals(professor, course.getProfessor());
    }

    @ParameterizedTest
    @NullSource
    @DisplayName("Profesor nulo debería lanzar NullPointerException")
    void testNullProfessorThrows(String nullProfessor) {
        assertThrows(NullPointerException.class, () -> {
            new Course("Testing", 100, nullProfessor);
        });
    }
}