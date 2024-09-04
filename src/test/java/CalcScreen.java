import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {


    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnAdd;
    @FindBy(id="com.google.android.calculator:id/op_sub")
    WebElement btnSub;
    @FindBy(id="com.google.android.calculator:id/op_mul")
    WebElement btnMul;
    @FindBy(id="com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;
    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnClear;

    AndroidDriver driver;
    public CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSeries1(String equation1){
        char[] chars = equation1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+') {
                btnAdd.click();
            } else if (chars[i] == '-') {
                btnSub.click();
            } else if (chars[i] == '*') {
                btnMul.click();
            } else if (chars[i] == '/') {
                btnDiv.click();
            } else {
                driver.findElement(By.id("com.google.android.calculator:id/digit_" + chars[i])).click();
            }
        }
        btnEqual.click();
        return txtResult.getText();
    }

    public String doSeries2(String equation2){
        char[] chars = equation2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+') {
                btnAdd.click();
            } else if (chars[i] == '-') {
                btnSub.click();
            } else if (chars[i] == '*') {
                btnMul.click();
            } else if (chars[i] == '/') {
                btnDiv.click();
            } else {
                driver.findElement(By.id("com.google.android.calculator:id/digit_" + chars[i])).click();
            }
        }
        btnEqual.click();
        return txtResult.getText();
    }


}
