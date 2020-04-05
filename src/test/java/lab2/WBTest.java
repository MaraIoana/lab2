package lab2;

import lab2.Domain.Teme;
import lab2.Repository.TemeRepo;
import lab2.Validator.TemeValidator;
import lab2.Validator.ValidationException;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class WBTest {
    @Test
    public void testAddAssignmentIDNull()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(null,"aasa",1,2));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentIDNotNull()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",1,2));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentID0Invalid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(0,"aasa",1,2));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }

    @Test
    public void testAddAssignmentDeadline0Invalid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",1,0));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentDeadline15Invalid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",1,15));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentDeadline14Valid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",1,14));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentDeadlineSmallerThanAssignInvalid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",2,1));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentAssigned0Invalid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",0,2));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentAssigned15Invalid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",15,2));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
    @Test
    public void testAddAssignmentAssigned12Valid()
    {
        TemeValidator temeValidator = new TemeValidator();
        TemeRepo temeRepo = new TemeRepo(temeValidator,"C:\\Users\\Mara\\IdeaProjects\\cat\\src\\main\\java\\lab2\\teme.xml");
        try
        {
            temeRepo.save(new Teme(1,"aasa",12,13));
        }
        catch(ValidationException e)
        {
            e.printStackTrace();
            //assert("data not valid", e.getMessage());
        }
    }
}
