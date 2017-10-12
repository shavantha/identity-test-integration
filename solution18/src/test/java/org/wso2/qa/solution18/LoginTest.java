package org.wso2.qa.solution18;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.qa.commons.operations.LoginOperations;
import org.wso2.qa.commons.operations.ServiceProviderOperations;
import org.wso2.qa.commons.pageobjects.menus.MenuItems;
import org.wso2.qa.commons.pageobjects.serviceprovider.ServiceProviderCreatePage;
import org.wso2.qa.commons.testbase.TestBase;

import java.io.IOException;

public class LoginTest extends TestBase {

    @BeforeClass
    public void init() {
        super.init();
    }

    @Test
    public void loginTest() throws InterruptedException, IOException {

        String username = "admin";
        String password = "admin";
        driver.get(getMgtConsoleURL());
        LoginOperations login = new LoginOperations(driver);
        login.executeLogin(username, password);

        // check menu items
        MenuItems menuItems = new MenuItems(driver);
        menuItems.tabMain().click();
        menuItems.tabMonitor().click();
        menuItems.tabConfigure().click();
        menuItems.tabTools().click();

        // check main menu items
        menuItems.tabMain().click();
        menuItems.userNrolesAdd().click();
        menuItems.userNrolesList().click();
        menuItems.userStoresAdd().click();
        menuItems.userStoresList().click();
        menuItems.claimsAdd().click();
        menuItems.claimsList().click();
        menuItems.spAdd().click();
        menuItems.spList().click();
        menuItems.spResident().click();
        menuItems.idpAdd().click();
        menuItems.idpList().click();
        menuItems.idpResident().click();

        // SP
        menuItems.spAdd().click();
        ServiceProviderCreatePage serviceProviderCreatePage = new ServiceProviderCreatePage(driver);
        serviceProviderCreatePage.txtBoxServiceProviderName().sendKeys("sample");
        serviceProviderCreatePage.txtBoxServiceProvierDescription().sendKeys("Sample Desc");
        serviceProviderCreatePage.btnRegister().click();
        menuItems.spList().click();

        ServiceProviderOperations serviceProviderOperations = new ServiceProviderOperations(driver);
        System.out.println(serviceProviderOperations.getRecordCount());
        serviceProviderOperations.clickServiceProviderDeleteElement("sample");
        getlLogout().click();
    }

    @AfterClass
    private void clearnUp() {
        driver.close();
    }
}
