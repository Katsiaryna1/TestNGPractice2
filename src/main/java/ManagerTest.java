import org.testng.Assert;

public class ManagerTest {
    public static void main(String[] args) {

        Manager m = new Manager("John", 23, 2000);

        //our test code starts here
        //set the exp for John

        m.setExp(9);
        //compute actual bonus

        double actualBonus = m.getSalary() * .1;
        int experience = m.getExp();
        double bonus = m.getBonus(experience);
        System.out.println(bonus);
        int equal = Double.compare(actualBonus, bonus);

        if(Double.compare(actualBonus, bonus) == 0){
            System.out.println("PASS");
            //pass
        }else{
            //fail
            System.out.println("FAIL");
        }

    }
}