import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student victor;

    @Test
    public void testCreateStudent(){
        victor = new Student(1, "victor");
        assertEquals(1, victor.getId());
        assertEquals("victor", victor.getName());
        assertNotEquals(2, victor.getId());
        assertNotEquals("Triple H", victor.getName());
        Student rambo = new Student(2, "rambo");
        assertEquals(2, rambo.getId());
        assertNotEquals("Chuck", rambo.getName());
    }

    @Test
    public void testAddGrade(){
        Student albert = new Student(1L, "albert");
        assertEquals(0, albert.getGrade().size());
        albert.addGrade(100);
        assertEquals(1, albert.getGrade().size());
        albert.addGrade(100);
        assertEquals(2, albert.getGrade().size());
    }

}
