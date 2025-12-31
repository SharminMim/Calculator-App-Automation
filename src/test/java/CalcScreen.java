import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class CalcScreen {
    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnAdd;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnClear;
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;
    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public String calcuateSeries(String equation){
        char[] chars=equation.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='+'){
                btnAdd.click();
            } else if (chars[i]=='-') {
                btnSub.click();
            }else if (chars[i]=='*') {
                btnMul.click();
            }else if (chars[i]=='/') {
                btnDiv.click();
            }else{
                driver.findElement(By.id("com.google.android.calculator:id/digit_"+chars[i])).click();
            }
        }
        btnEqual.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return txtResult.getText();
    }


}
