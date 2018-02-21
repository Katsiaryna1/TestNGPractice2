import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNew {
    @BeforeClass
    public void classSetup(){
        System.out.println("In class setup");
    }


    @AfterClass
    public void cleanupMethod(){
        System.out.println("cleanup method");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("setup method");
    }

    @Test(priority=1)
    public void test1(){
        System.out.println("Test1");
    }


    @Test
    public void test2(){
        System.out.println("Test2");
    }
    @AfterClass
   public void Cleanup(){
        System.out.println("class Clean up");
    }

}
