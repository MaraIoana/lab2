package lab2;

import lab2.Domain.Student;
import lab2.Domain.Teme;
import lab2.Repository.StudentRepo;
import lab2.Repository.TemeRepo;
import lab2.Validator.StudentValidator;
import lab2.Validator.TemeValidator;
import lab2.Validator.ValidationException;
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
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\studenti.xml");
        studentRepo.save(new Student("1","Ana",932,"ce@a.com", "Prof. Dr. Ana"));
        assertEquals("Ana",studentRepo.findOne("1").getNume());

    }

    @Test
    public void testAddAssignment1()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",1,2));
            assertNotNull(temeRepo.findAll().iterator().hasNext());
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignment2()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",4,2));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }


}
