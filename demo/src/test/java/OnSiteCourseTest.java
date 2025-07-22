import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.OnSiteCourse;

public class OnSiteCourseTest {
    @Test
    void testGetRoom() {
        OnSiteCourse onSiteCourse = new OnSiteCourse("Programacion", 40, "Giulina", "Room 101", 30);
        assertEquals("Room 101", onSiteCourse.getRoom());
    }

    @Test
    void testSetMaxQuota() {
        OnSiteCourse onSiteCourse = new OnSiteCourse("Automatizacion", 120, "Juan Perez", "Room 102", 30);
        assertEquals(30, onSiteCourse.getMaxQuota());
    }

    @Test
    void testShowInformation() {
        OnSiteCourse onSiteCourse = new OnSiteCourse("Performance", 100, "Juan Perez", "Room 101", 40);
        String expectedInfo = "[On Site] Performance (100 hs) - Professor: Juan Perez - Room: Room 101, Quota: 40";
        assertEquals(expectedInfo, onSiteCourse.showInformation());
    }
}