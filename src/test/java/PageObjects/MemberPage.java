package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MemberPage extends PageObject {


    //member page webElements


    String EmailXpath = "//input[@id=\"introEmail\"]";
    // element will be used when intro email is required

//     WebElement selectTitle = $(By.xpath("//select[@id=\"onTtl\"]"));

    String TitleXpath = "//select[@name=\"onTtl\"]";

    String NameXpath = "//input[@name=\"onName\"]";

    String SurnameXpath = "//input[@name=\"onSurname\"]";

    String IDnumXpath = "//input[@name=\"onID\"]";


    String EmailXPATH ="//*[@id=\"onEmail\"]";  // Email field on the members page
    String MobileNuXpath = "//input[@name=\"onMobile\"]";


    String PostalAddressXpath = "//input[@name=\"onAddress1\"]";
    String PostalCodeXpath = "//*[@id=\"onPostal\"]";


    String MonthlIncomeXpath = "//select[@name=\"onIncome\" ]";
    String OccupationXpath = "//select[@name=\"onOccupation\" ]";
    String educationXpath = "//select[@name=\"onEducation\"]";
    String FicDecl01Xpath = "//select[@name=\"fica01\" ]";
    String FicDecl02Xpath = "//select[@name=\"fica02\" ]";


    @Step("Enter email ")
    public void EnterEmail(String email){

        $(By.xpath(EmailXpath)).sendKeys(email);


    }
    @Step("Select Title")
    public void SelectTitle(String Title) {
        Select select = $(By.xpath(TitleXpath));
        select.selectByVisibleText(Title);

    }

    @Step("Enter name")
    public void EnterName(String name) {
        $(By.xpath(NameXpath)).sendKeys(name);

    }

    @Step("enter surname")
    public void Entersurname(String surname) {

        $(By.xpath(SurnameXpath)).sendKeys(surname);

    }

    @Step("Enter mobile Number")
    public void enterMobileNum(String MOBNo) {
        $(By.xpath(MobileNuXpath)).sendKeys(MOBNo);

    }

    @Step("Enter postal address")
    public void enterPostalAddress(String postadress) {
        $(By.xpath(PostalAddressXpath)).sendKeys(postadress);

    }

    @Step("Enter postal code")
    public void EnterPostalCode(String postcode) {
        $(By.xpath(PostalCodeXpath)).sendKeys(postcode);

    }

    @Step("Verify that Email address is populated to email field")
    public void EmailAdresPopulated() {
        WebElement Email = $(By.xpath(EmailXPATH));

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
        Select select = $(By.xpath(MonthlIncomeXpath));
        select.selectByValue(value);

    }

    @Step(" Select occupation")
    public void selectOccupation(String occupation) {

        Select select = $(By.xpath(OccupationXpath));
        select.selectByValue(occupation);

    }

    @Step("Select education")
    public void selectEducation(String edu) {

        Select select = $(By.xpath(educationXpath));
        select.selectByValue(edu);

    }

    @Step("Accept FICA declaration ")
    public void acceptFICAdecl(String Yes_No) {

        Select select = $(By.xpath(FicDecl01Xpath));
        select.selectByValue(Yes_No);

    }

    @Step("Accept FICA declaration ")
    public void acceptFicaDeclaration2(String YES_NO) {
        Select select = $(By.xpath(FicDecl02Xpath));
        select.selectByValue(YES_NO);
    }
}