import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.Course;

public class CourseTest {
    @Test
    void testGetDuration() {
        Course course = new Course("Performance", 100, "Giuliana");
        assertEquals(100, course.getDuration());
    }

    @Test
    void testGetProfessor() {
        Course course = new Course("Automatizacion", 120, "Maria Perez");
        assertEquals("Maria Perez", course.getProfessor());
    }

    @Test
    void testGetProfessorUnassigned () {
        Course course = new Course("Automatización", 120);
        assertEquals("Unassigned", course.getProfessor());
    }

    @Test
    void testGetTitle() {
        Course course = new Course("Programacion", 100, "Giuliana");
        assertEquals("Programacion", course.getTitle());
    }

    @Test
    void testShowInformation() {
        Course course = new Course("Testing", 120, "Juan Perez");
        String expectedInfo = "Testing (120 hs) - Professor: Juan Perez";
        assertEquals(expectedInfo, course.showInformation());
    }
}