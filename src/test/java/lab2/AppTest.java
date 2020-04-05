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
    public  void testAddStudent1(){
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
    @Test
    public void testAddStudentIDEmpty()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student(null,"Ana",932,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentIDNotEmpty()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentIDNumber()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentIDNotNumber()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("a","Ana",932,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupNaturalNumber()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupNotNaturalNumber()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",-932,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroup110Invalid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",110,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroup111Valid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",111,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroup938Invalid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",938,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroup937Valid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",937,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupYear0Invalid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",907,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupYear1Valid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",917,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupYear3Valid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",937,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupYear4Invalid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",947,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupClass0Invalid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",920,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupClass1Valid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",921,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupClass7Valid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",927,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentGroupClass8Invalid()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",928,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentNameEmpty()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","",927,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddStudentNameNotEmpty()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        Student student1 = new Student("1","Ana",927,"email@email.com", "Prof. Dr. Ana");
        try
        {
            studentRepo.save(student1);
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
}
