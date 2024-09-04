import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    @Test(priority = 1, description = "Do Series1: 100/10*5-10+60")
    public void doSeries1() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        Thread.sleep(3000);
        String resActual=calcScreen.doSeries1("100/10*5-10+60");
//        System.out.println(resActual);
        String resExpected="100";
        Assert.assertTrue(resActual.contains(resExpected));
    }

    @Test(priority = 2, description = "Do Series2: 50+10-20*2+10/2")
    public void doSeries2() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        Thread.sleep(3000);
        String resActual=calcScreen.doSeries2("50+10-20*2+10/2");
//        System.out.println(resActual);
        String resExpected="25";
        Assert.assertTrue(resActual.contains(resExpected));
    }

    @AfterMethod
    public void clearScr() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        Thread.sleep(3000);
        calcScreen.btnClear.click();
    }
}
