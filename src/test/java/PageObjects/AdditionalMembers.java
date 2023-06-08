package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AdditionalMembers extends PageObject {


  // Add spouse Webelements
  String AddSpouseCheckbxXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[7]/fieldset/div[1]/div[1]/label/span";

  String TitleXpath = "//select[@id=\"onTtlSp\"]";

  String Spouse_NameXpath = "//input[@name=\"onNameSp\"]";

  String Spouse_SurnameNameXpath = "//input[@name=\"onSurnameSp\"]";

  String Spouse_GenderXpath = "//select[@id=\"onGenderSp\"]";

  String Spouse_IDXpath = "//input[@name=\"onIdNumSp\"]";

  String Spouse_DoBXpath = "//input[@name=\"onDob\"]";
  String CalenderYear = "//select[@class=\"ui-datepicker-year\"]";

  String CalenderMonth = "//select[@class=\"ui-datepicker-month\"]";

  String SaveBtnXpath = "//div[@id=\"SaveSpouse\"]";

  String DeleteBtnXpath = "//div[@class=\"butDelete\"]";

  String EditBtnXpath = "//div[@class=\"butEdit\"]";

  String ContinueBtnXpath = "//div[@onclick=\"loader();step('2','no');\"]";

  String BackBtnXpath = "//div[@onclick=\"stepback('0');\"]";


  @Step("Check checkbox to add a spouse ")
  public void addSpouse() {
    $(By.xpath(AddSpouseCheckbxXpath)).click();

  }

  @Step("select spouse Title")
  public void selectTitle(String title) {
    $(By.xpath(TitleXpath)).sendKeys(title);
  }

  @Step("Enter spouse name")
  public void enterSpouseName(String spouse_Name) {
    $(By.xpath(Spouse_NameXpath)).sendKeys(spouse_Name);

  }

  @Step("Enter spouse surname")
  public void enterSpouseSurname(String surname) {
    $(By.xpath(Spouse_SurnameNameXpath)).sendKeys(surname);

  }

  @Step("Select spouse gender")
  public void selectGender(String Gender) {
    Select gender = $(By.xpath(Spouse_GenderXpath));
    gender.selectByValue(Gender);

  }

  @Step(" Enter spouse ID number")
  public void EnterSpouseIDNo(String IdNum) {
    $(By.xpath(Spouse_IDXpath)).sendKeys(IdNum);
  }

  @Step("enter spouse date of birth")
  public void enterDateOfBirth(String Year, String Month, String day) {

    String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

    $(By.xpath(Spouse_DoBXpath)).click();
    Select yr = $(By.xpath(CalenderYear));
    Select mnth = $(By.xpath(CalenderMonth));
    //  enter the year eg 1990,1991,1992. etc
    yr.selectByVisibleText(Year);

    // enter the month eg Jan,Feb,Mar,April,etc
    mnth.selectByVisibleText(Month);

    List<WebElement> activedates = $(By.xpath(activedatesXpath));

    for (WebElement dates : activedates) {
      String date = dates.getText();
//      System.out.println(date);
      if (date.equals(day)) {
        dates.click();
        break;
      }
    }

  }

  @Step("Save spouse details ")
  public void saveSpousedtls(){
    $(By.xpath(SaveBtnXpath)).click();

  }

@Step("Delete created spouse details")
public void DeleteSpouse(){
  Assert.assertTrue($(By.xpath(DeleteBtnXpath)).isDisplayed());
  $(By.xpath(DeleteBtnXpath)).click();

}

@Step(" Edit spouse details ")
 public void EditSpouseDetails(){
    $(By.xpath(EditBtnXpath)).click();


}
@Step("click on Continue to proceed to beneficiaries Details page")
public void clickContinue(){
    Assert.assertTrue($(By.xpath(ContinueBtnXpath)).isClickable());
    $(By.xpath(ContinueBtnXpath)).click();

}
@Step("Click back button to see member details page")
public void clickBackBtn(){
    Assert.assertTrue($(By.xpath(ContinueBtnXpath)).isClickable());
    $(By.xpath(BackBtnXpath)).click();

}


}
