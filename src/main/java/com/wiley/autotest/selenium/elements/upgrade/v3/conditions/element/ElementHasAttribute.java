package com.wiley.autotest.selenium.elements.upgrade.v3.conditions.element;

import com.wiley.autotest.selenium.elements.upgrade.TeasyElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.annotation.Nullable;

public class ElementHasAttribute implements ExpectedCondition<Boolean> {
    private TeasyElement element;
    private String attributeName;

    public ElementHasAttribute(TeasyElement element, String attributeName) {
        this.element = element;
        this.attributeName = attributeName;
    }

    @Nullable
    @Override
    public Boolean apply(@Nullable WebDriver driver) {
        return element.getAttribute(attributeName) != null;
    }

    @Override
    public String toString() {
        return String.format("Element '%s' does not have attribute '%s'", element.toString(), attributeName);
    }
}
