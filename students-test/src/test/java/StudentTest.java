import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student victor;

    @Test
    public void testCreateStudent(){
        victor = new Student(1, "victor");

        assertEquals(1, victor.getId());
    }

}
