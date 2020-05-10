package lab2;

import lab2.Domain.Nota;
import lab2.Domain.Student;
import lab2.Domain.Teme;
import lab2.Repository.NoteRepo;
import lab2.Repository.StudentRepo;
import lab2.Repository.TemeRepo;
import lab2.Validator.NotaValidator;
import lab2.Validator.StudentValidator;
import lab2.Validator.TemeValidator;
import lab2.Validator.ValidationException;
import org.junit.Test;

import java.util.AbstractMap;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

public class Integration {
    @Test
    public  void testAddStudent(){
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        studentRepo.save(new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"));
        assertNotNull(studentRepo.findAll().iterator().hasNext());
    }

    @Test
    public void testAddAssignment()
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
    public void testAddGrade()
    {
        NotaValidator notaValidator = new NotaValidator();
        NoteRepo noteRepo = new NoteRepo(notaValidator);
        try
        {
            Map.Entry<String,Integer> entry =
                    new AbstractMap.SimpleEntry<String, Integer>("exmpleString", 42);
            noteRepo.save(new Nota(entry,new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"),new Teme(1,"aasa",1,2),1,2));
            assertNotNull(noteRepo.findAll().iterator().hasNext());
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testIntegration()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");

        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");

        NotaValidator notaValidator = new NotaValidator();
        NoteRepo noteRepo = new NoteRepo(notaValidator);
        try
        {
            studentRepo.save(new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"));
            temeRepo.save(new Teme(1,"aasa",1,2));
            Map.Entry<String,Integer> entry =
                    new AbstractMap.SimpleEntry<String, Integer>("exmpleString", 42);
            noteRepo.save(new Nota(entry,new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"),new Teme(1,"aasa",1,2),1,2));

            assertNotNull(studentRepo.findAll().iterator().hasNext());
            assertNotNull(noteRepo.findAll().iterator().hasNext());
            assertNotNull(noteRepo.findAll().iterator().hasNext());
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }

    @Test
    public  void testAddStudent1(){
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");
        studentRepo.save(new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"));
        assertNotNull(studentRepo.findAll().iterator().hasNext());
    }

    @Test
    public void testAddAssignment1()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");

        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            studentRepo.save(new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"));
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
    public void testAddGrade1()
    {
        StudentValidator studentValidator = new StudentValidator();
        StudentRepo studentRepo = new StudentRepo(studentValidator,"C:\\Users\\Mara\\IdeaProjects\\lab2\\src\\main\\java\\lab2\\studenti.xml");

        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");

        NotaValidator notaValidator = new NotaValidator();
        NoteRepo noteRepo = new NoteRepo(notaValidator);
        try
        {
            studentRepo.save(new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"));
            temeRepo.save(new Teme(1,"aasa",1,2));
            Map.Entry<String,Integer> entry =
                    new AbstractMap.SimpleEntry<String, Integer>("exmpleString", 42);
            noteRepo.save(new Nota(entry,new Student("1","Ana",932,"email@email.com", "Prof. Dr. Ana"),new Teme(1,"aasa",1,2),1,2));
            assertNotNull(noteRepo.findAll().iterator().hasNext());
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }

}
