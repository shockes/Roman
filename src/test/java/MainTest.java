import org.junit.Assert;
import org.junit.Test;

import static org.example.Main.ageCategory;

public class MainTest {
    @Test
    public void ageCategoryTest(){
        Assert.assertEquals("Ребенок",ageCategory(10));
        Assert.assertEquals("Взрослый",ageCategory(20));
        Assert.assertEquals("Пенсионер",ageCategory(41));
        Assert.assertEquals("Ребенок",ageCategory(17));
        Assert.assertEquals("Взрослый",ageCategory(18));
        Assert.assertEquals("Пенсионер",ageCategory(40));
    }
}
