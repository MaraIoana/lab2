package lab2;

import lab2.Domain.Student;
import lab2.Repository.StudentRepo;
import lab2.Validator.StudentValidator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public  void testAddStudent(){
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        studentRepo.save(new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"));
        assertNotNull(studentRepo.findAll().iterator().hasNext());
    }

    @Test
    public  void testAddStudent2(){
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        studentRepo.save(new Student("1","Ana",932,"ce@a.com", "Prof. Dr. Ana"));
        assertEquals("Ana",studentRepo.findOne("1").getNume());

    }
}
