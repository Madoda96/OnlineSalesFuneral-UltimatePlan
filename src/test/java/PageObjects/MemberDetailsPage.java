package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MemberDetailsPage extends PageObject {

  // Elements will be used when the intro email is required

  //member page webElements

  String EmailXpath = "//input[@id=\"introEmail\"]";

  String TitleXpath = "//select[@name=\"onTtl\"]";

  String SurnameXpath = "//input[@name=\"onSurname\"]";

  String NameXpath = "//input[@name=\"onName\"]";

  String IdentityNumberXpath;

  String EmailXPATH ="//*[@id=\"onEmail\"]";  // Email field on the members page

  String MobileNuXpath = "//input[@name=\"onMobile\"]";

  String PostalAddressXpath = "//input[@name=\"onAddress1\"]";

  String PostalCodeXpath = "//*[@id=\"onPostal\"]";

  String MonthlyIncomeXpath = "//select[@name=\"onIncome\" ]";

  String OccupationXpath = "//select[@name=\"onOccupation\" ]";

//  String educationXpath = "//*[@id=\"onEducation\"]/option[3]";
   String educationXpath = "//select[@name=\"onEducation\"]";

  String FicDecl01Xpath = "//select[@name=\"fica01\"]";

  String FicDecl02Xpath = "//select[@name=\"fica02\" ]";

  String OnContinue = "//*[@id=\"onlineSaleForm\"]/div/div[1]/div[2]/div[2]";

  public MemberDetailsPage() {
    IdentityNumberXpath = "//input[@name=\"onID\"]";
  }


  // Methods to be used.

  @Step("Enter email")
  public void EnterEmail(String email) {

    //$(By.xpath(EmailXpath)).sendkeys(email);

    $(By.xpath(EmailXpath)).sendKeys(email);


  }
  @Step("Select Title")
  public void SelectTitle(String Title) {

    WebElement e = $(By.xpath(TitleXpath));
    selectFromDropdown(e, Title);
    //    Select select = $(By.xpath(TitleXpath));
//    select.selectByValue(Title);

  }

  @Step("Enter name")
  public void EnterName(String name) {
    $(By.xpath(NameXpath)).sendKeys(name);
  }

  @Step("enter surname")
  public void Entersurname(String surname) {

    $(By.xpath(SurnameXpath)).sendKeys(surname);

  }


  @Step("enter id")
  public void Enterid(String id) {

    $(By.xpath(IdentityNumberXpath)).sendKeys(id);
  }

  @Step("Enter mobile Number")
  public void enterMobileNum(String MOBNo) {
    $(By.xpath(MobileNuXpath)).sendKeys(MOBNo);

  }

  @Step("Enter postal address")
  public void enterPostalAddress(String postalAddress) {
    $(By.xpath(PostalAddressXpath)).sendKeys(postalAddress);

  }

  @Step("Enter postal code")
  public void EnterPostalCode(String postcode) {
    $(By.xpath(PostalCodeXpath)).sendKeys(postcode);

  }

  @Step("Verify that Email address is populated to email field")
  public void EmailAddresPopulated() {
    WebElement Email = (WebElement) $(By.xpath(EmailXpath));

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
    WebElement e = $(By.xpath(MonthlyIncomeXpath));
    e.click();
    selectFromDropdown(e, value);


    //Select select = $(By.xpath(MonthlyIncomeXpath));
    //select.selectByValue(value);

  }

  @Step(" Select Occupation")
  public void selectOccupation(String value) {
    WebElement e = $(By.xpath(OccupationXpath));
    e.click();
    selectFromDropdown(e, value);





    //Select select = $(By.xpath(OccupationXpath));
    //select.selectByValue(occupation);

  }

  @Step("Select education")
  public void selectEducation(String value) {
    WebElement e = $(By.xpath(educationXpath));
    e.click();
    selectFromDropdown(e, value);



    //Select select = $(By.xpath(educationXpath));
    //select.selectByValue(edu);

  }

  @Step("Accept FICA declaration ")
  public void acceptFICAdecl(String value) {

    WebElement e = $(By.xpath(FicDecl01Xpath));
    e.click();
    selectFromDropdown(e, value);

    //*[@id="onOccupation"]/option[4]



    //Select select = $(By.xpath(FicDecl01Xpath));
    //select.selectByValue(Yes_No);

  }

  @Step("Accept FICA declaration ")
  public void acceptFicaDeclaration2(String value) {
    WebElement e = $(By.xpath(FicDecl02Xpath));
    e.click();
    selectFromDropdown(e, value);


    //Select select = $(By.xpath(FicDecl02Xpath));
    //select.selectByValue(YES_NO);
  }


  @Step("Click On Continue Button")
  public void clickonContinue() {
    $(By.xpath(OnContinue));

  }

  public void clickContinueBtn(String onContinue) {
  }

  public void EnterId(String number) {
  }


//  public void clickOn(String Continue) {
//  }
}
























