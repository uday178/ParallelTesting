package com.oktay.testng.page;

import com.oktay.testng.constants.AmazonHomePage_Constants;
import com.oktay.testng.util.BasePageUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class AmazonHomePage extends BasePageUtil implements AmazonHomePage_Constants {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public AmazonLoginPage callLoginPage() {
        Assert.assertTrue(getTitle().equals(txtHomePageTitle));
        clickElement(btnLoginPage);
        Assert.assertTrue(getTitle().equals(txtLoginPageTitle));
        return new AmazonLoginPage(driver);
    }

}
