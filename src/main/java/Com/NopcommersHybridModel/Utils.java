package Com.NopcommersHybridModel;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {


    //click Method
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    //clear Method
    public static void clearOnElement(By by)
    {
        driver.findElement(by).clear();
    }
    //sendKey Method
    public static void sendKeyMethod(By by,String sendkey){
        driver.findElement(by).sendKeys(sendkey);
    }
    //assertEqual Method
    public static void assertEqualsMethod(By by,String expectedResult  ){
    }
    //getText Method
    public static String getTextMethod(By by)
    {
        return driver.findElement(by).getText();
    }
    //for selectDropdownByValue for TestNG
    public static void selectByValueMethod(By by, String value){
        Select sc = new  Select(driver.findElement(by));
        sc.selectByValue(value);
    }
    //for selectDropdownByIndex TestNG
    public static void selectByIndexMethod(By by,int index){
        Select sc = new Select(driver.findElement(by));
        sc.selectByIndex(index);
    }
    //for selectDropdownByVisibleText TestNG
    public static void selectByVisibleTextMethod(By by,String visibleText ) {
        Select sc = new Select(driver.findElement(by));
        sc.selectByVisibleText(visibleText);
    }
    //for DateStamp Method
    public static String GetCurrentDateStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat(
                "ddmmss");// dete ,min,second
        Date today = new Date();
        String strDate = sdfDate.format(today);
        return strDate;
    }
    // Assert TestNG - Reusing Get Text Method
    public static void assertEqualMethod(By by, String expectedResult){
        Assert.assertEquals(getTextMethod(by),expectedResult);
    }
//    public static void scerrnshotMethod() {
//        String dateAndTimeStamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(scrFile, new File("src/test/Resourcer/ScreenShot/" + dateAndTimeStamp + "name" + ".jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    //}

    public static void waitMethod(By by) {
        try {
            driver.findElement(by).wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
