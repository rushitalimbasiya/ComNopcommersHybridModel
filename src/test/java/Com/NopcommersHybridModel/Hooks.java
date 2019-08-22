package Com.NopcommersHybridModel;


import java.util.concurrent.TimeUnit;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BasePage {

    BrowserSelector browserSelector=new  BrowserSelector();
    LoadProp loadProp = new LoadProp();
    @Before
    public void openBrowser(){
        browserSelector.browserSelection();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get(loadProp.getproperty("url"));
        driver.manage().deleteAllCookies();
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }

}
