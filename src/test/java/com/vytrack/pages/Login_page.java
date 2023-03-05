package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Login_page {

    public Login_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "_username")
    public WebElement input_username;

    @FindBy(name = "_password")
    public WebElement input_password;

    @FindBy(name = "_submit")
    public WebElement btn_login;

    public void login_salesManager() {
        input_username.sendKeys(ConfigurationReader.getProperty("salesmanager_username"));
        input_password.sendKeys(ConfigurationReader.getProperty("salesmanager_password"));
        btn_login.click();
    }

    public void login_driver() {
        input_username.sendKeys(ConfigurationReader.getProperty("driver_username"));
        input_password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        btn_login.click();
    }

    public void login_storeManager() {
        input_username.sendKeys(ConfigurationReader.getProperty("storemanager_username"));
        input_password.sendKeys(ConfigurationReader.getProperty("storemanager_password"));
        btn_login.click();
    }



/*
    public void hoveringSelect(String mainMenu, String subMenu, String subSub) {

        Driver.getDriver().get("https://qa3.vytrack.com/%22);
                VytrackLogin vytrackLogin = new VytrackLogin();
        vytrackLogin.loginAsStoreManager();

        Actions actions = new Actions(Driver.getDriver());
        // System.out.println("vytrackLogin.mainMenuButtons.size() = " + vytrackLogin.mainMenuButtons.size());

        for (WebElement eachButtons : vytrackLogin.mainMenuButtons) {
            //System.out.println("eachButtons.getText() = " + eachButtons.getText());
            if (eachButtons.getText().contains(mainMenu)) {
                eachButtons.click();
            }

            for (WebElement eachSub : vytrackLogin.subMenuButtons) {
                if (eachSub.getText().contains(subMenu)) {
                    actions.moveToElement(eachSub).perform();
                    // eachSub.click();
                }
                //   actions.moveToElement(eachButtons).perform();
                // System.out.println("eachSub.getText() = " + eachSub.getText());
                // System.out.println("eachSub.getSize() = " + eachSub.getSize());

                for (WebElement eachSubSub : vytrackLogin.subSubMenuButtons) {

                    if (eachSubSub.getText().contains(subSub)) {
                        actions.moveToElement(eachSubSub).click().perform();
                    }
                }
            }
        }
    }


 */

}
