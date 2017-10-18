package samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by YS on 10/18/17
 */


    @Test
public class SampleTest {
    public void first(){
        System.out.println("1");
        Assert.assertEquals("1", "1");

      }
    @Test
    public void second() {
        System.out.println("2");
        }
    @Test
    public void third() {
        System.out.println("3");

        }
    }


