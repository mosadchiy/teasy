package com.wiley.autotest.framework.tests.domElements;

import com.wiley.autotest.framework.config.BaseTest;
import com.wiley.autotest.framework.pages.TestDomElementPage;
import com.wiley.autotest.framework.pages.TestElementPage;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

/**
 * Created by shekhavtsov on 29/09/2017.
 */
public class NonexistentDomElementThrowsException extends BaseTest {

    @Autowired
    private TestDomElementPage testDomElementPage;

    @Test(expectedExceptions = NoSuchElementException.class)
    public void test() {
        openPage("mainTestElement.html");
        testDomElementPage.checkDomElementNotFound();
    }
}
