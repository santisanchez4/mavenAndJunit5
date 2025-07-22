import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.OnlineCourse;

public class OnlineCourseTest {
    @Test
    void testGetPlatform() {
        OnlineCourse onlineCourse = new OnlineCourse("Programacion", 150, "Giuliana", "Bios");
        assertEquals("Bios", onlineCourse.getPlatform());
    }

    @Test
    void testSetPlatform() {
        OnlineCourse onlineCourse = new OnlineCourse("Performance", 100, "Juan Perez", "Zoom");
        onlineCourse.setPlatform("Zoom");
    }

    @Test
    void testShowInformation() {
        OnlineCourse onlineCourse = new OnlineCourse("Java Automation", 120, "Manuel Perez", "Bios");
        String expectedInfo = "[Online] Java Automation (120 hs) - Professor: Manuel Perez - Platform: Bios";
        assertEquals(expectedInfo, onlineCourse.showInformation());
    }
}