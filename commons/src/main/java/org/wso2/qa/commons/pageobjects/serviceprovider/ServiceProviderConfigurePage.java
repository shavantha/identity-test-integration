/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.qa.commons.pageobjects.serviceprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Service Provider Configuration Page locator class
 * <p>
 * TODO - move element values into the property file
 */
public class ServiceProviderConfigurePage {

    private WebElement element;
    private WebDriver driver;

    public ServiceProviderConfigurePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement txtBoxServiceProviderName() {
        element = driver.findElement(By.xpath("//*[@id=\"spName\"]"));
        return element;
    }

    public WebElement txtBoxServiceProviderDescription() {
        element = driver.findElement(By.xpath("//*[@id=\"sp-description\"]"));
        return element;
    }

    public WebElement chkBoxSAAS() {
        element = driver.findElement(By.xpath("//*[@id=\"isSaasApp\"]"));
        return element;
    }

    /*
     * Configuration tabs
     */

    public WebElement tabClaimConfiguration() {
        element = driver.findElement(By.xpath
                ("//*[@id=\"claims_head\"]"));
        return element;
    }

    public WebElement tabRolePermissionConfiguration() {
        element = driver.findElement(By.xpath
                ("//*[@id=\"authorization_permission_head\"]"));
        return element;
    }

    public WebElement tabInboundAuthenticationConfiguration() {
        element = driver.findElement(By.xpath
                ("//*[@id=\"app_authentication_head\"]"));
        return element;
    }

    public WebElement tabLocalOutboundAuthenticationConfiguration() {
        element = driver.findElement(By.xpath
                ("//*[@id=\"app_authentication_advance_head\"]"));
        return element;
    }

    public WebElement tabInboundProvisioningConfiguration() {
        element = driver.findElement(By.xpath
                ("//*[@id=\"inbound_provisioning_head\"]"));
        return element;
    }

    public WebElement tabOutboundProvisioningConfiguration() {
        element = driver.findElement(By.xpath
                ("//*[@id=\"outbound_provisioning_head\"]"));
        return element;
    }
}

