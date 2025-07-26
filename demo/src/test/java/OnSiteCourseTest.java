import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import com.example.OnSiteCourse;

public class OnSiteCourseTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Iniciando pruebas para OnSiteCourse.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finalizando pruebas para OnSiteCourse.");
    }

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

    @ParameterizedTest
    @CsvFileSource(resources = "/onSiteCourses.csv", numLinesToSkip = 1)
    @DisplayName("Validar ShowInformation (parametrizado)")
    void testShowInformationParameterized(String title, int duration, String professor, String room, int quota, String expectedInfo) {
        OnSiteCourse onSiteCourse = new OnSiteCourse(title, duration, professor, room, quota);
        assertEquals(expectedInfo, onSiteCourse.showInformation());
    }
}