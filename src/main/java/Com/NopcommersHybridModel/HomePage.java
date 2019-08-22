package Com.NopcommersHybridModel;

import org.openqa.selenium.By;

public class HomePage extends Utils {
   LoadProp loadProp = new LoadProp();

    private static By _RegisterLink = By.className("ico-register");//click on RegisterButton


    public void clickOnRegisterLink()

    {
        clickOnElement(_RegisterLink);
    }
}
