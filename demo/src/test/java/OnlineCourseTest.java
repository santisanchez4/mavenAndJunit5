import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import com.example.OnlineCourse;

public class OnlineCourseTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("Iniciando pruebas para OnlineCourse.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finalizando pruebas para OnlineCourse.");
    }

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

    @ParameterizedTest
    @CsvFileSource(resources = "/onlineCourses.csv", numLinesToSkip = 1)
    @DisplayName("Validar ShowInformation (parametrizado)")
    void testShowInformationParameterized(String title, int duration, String professor, String platform, String expectedInfo) {
        OnlineCourse oc = new OnlineCourse(title, duration, professor, platform);
        assertEquals(expectedInfo, oc.showInformation());
    }
}