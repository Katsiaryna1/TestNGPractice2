import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestManagerTestNG {
   Manager m ;


   //set up
   @BeforeClass
   public void setUp(){
      System.out.println("In setup method");
      Manager m = new Manager("John", 23, 2000);

   }
    //test
   @Test
   public void testGetBonus(){
      System.out.println("In Test");
     //set the experience for John
      m.setExp(11);
      //compute actual bonus
      double actualBonus = m.getSalary() * .15;
     // validation
      int experience = m.getExp();
      double bonus = m.getBonus(experience);

      int equal = Double.compare(actualBonus, bonus);

      Assert.assertEquals(equal, 0, "Validation failed for getBonus method");
   }
   //test
   @Test
   public void testGetBonus1(){
      System.out.println("In test2");
   }

    //cleanup
   @AfterClass
   public void tearDown(){
      System.out.println("In teardown");

   }
}
