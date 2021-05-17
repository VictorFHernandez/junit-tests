import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

   Cohort marco;
   Student victor;
   Student meliodas;

   @Before
   public void tools(){
       marco = new Cohort();
       victor = new Student(1L, "victor");
       meliodas = new Student(2L, "meliodas");
   }

    @Test
    public void testGetStudents(){
       assertNotNull(marco.getStudents());
       Cohort deimos = null;
       assertNull(deimos);
    }

    @Test
    public void testAddStudent(){
       assertEquals(0, marco.getStudents().size());
       marco.addStudent(victor);
       assertEquals(1, marco.getStudents().size());
       marco.addStudent(meliodas);
        assertEquals(2, marco.getStudents().size());
    }

    @Test
    public void testGetCohortAverage(){
       marco.addStudent(victor);
       victor.addGrade(90);
       victor.addGrade(70);
       marco.addStudent(meliodas);
       meliodas.addGrade(75);
       meliodas.addGrade(95);
       assertEquals(82.5, marco.getCohortAverage(), 0.0);
    }
}
