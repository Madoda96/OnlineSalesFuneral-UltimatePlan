package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MemberPage extends PageObject {


    //member page webElements

    WebElement EnterEmail = $(By.xpath("//input[@id=\"introEmail\"]")); // element will be used when intro email is required

//     WebElement selectTitle = $(By.xpath("//select[@id=\"onTtl\"]"));

    WebElement Name = $(By.xpath("//input[@name=\"onName\"]"));

    WebElement Surname = $(By.xpath("//input[@name=\"onSurname\"]"));

    WebElement IDnum = $(By.xpath("//input[@name=\"onID\"]"));


    WebElement Email = $(By.xpath("//*[@id=\"onEmail\"]"));
    WebElement MobileNu = $(By.xpath("//input[@name=\"onMobile\"]"));


    WebElement PostalAddress = $(By.xpath("//input[@name=\"onAddress1\"]"));

    WebElement PostalCode = $(By.xpath("//*[@id=\"onPostal\"]"));
    WebElement MonthlIncome = $(By.xpath("//select[@name=\"onIncome\" ]"));
    WebElement Occupation = $(By.xpath("//select[@name=\"onOccupation\" ]"));
    WebElement education = $(By.xpath("//select[@name=\"onEducation\"]"));
    WebElement FicDecl01 = $(By.xpath("//select[@name=\"fica01\" ]"));
    WebElement FicDecl02 = $(By.xpath("//select[@name=\"fica02\" ]"));


    @Step("Enter email ")
    public void EnterEmail(String email){
        EnterEmail.sendKeys(email);

    }
    @Step("Select Title")
    public void SelectTitle(String Title) {
        Select select = $(By.xpath("//select[@id=\"onTtl\"]"));
        select.selectByVisibleText(Title);

    }

    @Step("Enter name")
    public void EnterName(String name) {
        Name.sendKeys(name);

    }

    @Step("enter surname")
    public void Entersurname(String surname) {

        Surname.sendKeys(surname);

    }

    @Step("Enter mobile Number")
    public void enterMobileNum(String MOBNo) {
        MobileNu.sendKeys(MOBNo);

    }

    @Step("Enter postal address")
    public void enterPostalAddress(String postadress) {
        PostalAddress.sendKeys(postadress);

    }

    @Step("Enter postal code")
    public void EnterPostalCode(String postcode) {
        PostalCode.sendKeys(postcode);

    }

    @Step("Verify that Email address is populated to email field")
    public void EmailAdressPopulated() {


        Assert.assertTrue(Email.isDisplayed());
        String emailTxt = Email.getText();
        if (emailTxt.isEmpty()) {
            System.out.println("Email address not populated");

        } else {
            System.out.println("Email address is populated");

        }

    }

    @Step(" Select Monthly income")
    public void selectIncome(String value) {
        Select select = $(By.xpath("//select[@name=\"onIncome\" ]"));
        select.selectByValue(value);

    }

    @Step(" Select occupation")
    public void selectOccupation(String occupation) {

        Select select = $(By.xpath("//select[@name=\"onOccupation\" ]"));
        select.selectByValue(occupation);

    }

    @Step("Select education")
    public void selectEducation(String edu) {

        Select select = $(By.xpath("//select[@name=\"onEducation\"]"));
        select.selectByValue(edu);

    }

    @Step("Accept FICA declaration ")
    public void acceptFICAdecl(String Yes_No) {

        Select select = $(By.xpath("//select[@name=\"fica01\" ]"));
        select.selectByValue(Yes_No);

    }

    @Step("Accept FICA declaration ")
    public void acceptFicaDeclaration2(String YES_NO) {
        Select select = $(By.xpath("//select[@name=\"fica01\" ]"));
        select.selectByValue(YES_NO);
    }
}