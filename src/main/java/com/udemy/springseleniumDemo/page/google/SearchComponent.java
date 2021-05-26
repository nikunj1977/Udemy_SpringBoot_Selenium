package com.udemy.springseleniumDemo.page.google;

import com.udemy.springseleniumDemo.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchBtns;

    public void search(final String keywork){
        this.searchBox.sendKeys();
        this.searchBtns
                .stream()
                .filter(element -> element.isDisplayed() && element.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }


    @Override
    public boolean isAt() {
        return this.wait.until((driver -> this.searchBox.isDisplayed()));

    }
}
