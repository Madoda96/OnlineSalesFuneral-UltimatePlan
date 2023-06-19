package PageObjects;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
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

  String AddChildrenCheckBoxXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[8]/fieldset/div[1]/div[1]/label/span";

  String AddExtendedMemberCheckBoxXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[9]/fieldset/div[1]/div[1]/label/span";


  // Non insurance Web Element
  String AddOptionalClienteleBlueRewardsXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[10]/fieldset/div[2]/div[1]/label/span";

  String AddOptionalClienteleSilverRewardXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[11]/fieldset/div[2]/div[1]/label/span";

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
  String ChildNameXpath = "//input[@id=\"onNameCh1\"]";
  String ChildSurnameNameXpath = "//input[@id=\"onSurnameCh1\"]";
  String ChildGenderXpath = "//select[@id=\"onGenderCh1\"]";
  String ChildIsStudenteXpath = "//select[@id=\"onChIsStudent1\"]";
  String ChildIDnumXpath = "//input[@id=\"onIdNumCh1\"]";
  String ChildDOBXpath = "//input[@name=\"onDobCh\"]";
  String AddAnotherChild = "//button[@id=\"AddChild\"]";
  String ChildSaveDetails = "//div[@id=\"SaveChild\"]";
  
  String TotalPremiumXpath = "//div[@id=\"AllSumtotasl\"]";


  @Step("Check checkbox to add a spouse ")
  public void addSpouse() {
    $(By.xpath(AddSpouseCheckbxXpath)).click();

  }

  @Step("select spouse Title")
  public void selectTitle(String title) {
    WebElement STitle = $(By.xpath(TitleXpath));
    selectFromDropdown(STitle,title);

//    Select tit = $(By.xpath(TitleXpath));
//    tit.selectByVisibleText(title);

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
  public void selectSpouseGender(String Gender) {
    WebElement seleGend = $(By.xpath(Spouse_GenderXpath));
    selectFromDropdown(seleGend, Gender);

//    Select gender = $(By.xpath(Spouse_GenderXpath));
//    gender.selectByValue(Gender);

  }

  @Step(" Enter spouse ID number")
  public void EnterSpouseIDNo(String IdNum) {
    $(By.xpath(Spouse_IDXpath)).sendKeys(IdNum);
  }

  @Step("enter spouse date of birth")
  public void enterSpouseDateOfBirth(String Year, String Month, String day) {

    String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

    $(By.xpath(Spouse_DoBXpath)).click();
    WebElement YRR = $(By.xpath(CalenderYear));
    WebElement months = $(By.xpath(CalenderMonth));


    //  enter the year eg 1990,1991,1992. etc
    selectFromDropdown(YRR,Year);
//    yr.selectByVisibleText(Year);

    // enter the month eg Jan,Feb,Mar,April,etc
    selectFromDropdown(months,Month);


    WebElement S = $(By.xpath(activedatesXpath));

    List<WebElement> activedates = S.findElements(By.tagName("td"));

    //   ListOfWebElementFacades activedates = findAll((By.tagName("td")));

    for (WebElement dates : activedates) {
      System.out.println(dates.getSize());
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
@Step("Add a child name")
  public void EnterChildName (String Childname){
    $(By.xpath(ChildNameXpath)).sendKeys(Childname);
}
@Step("Add a child surname")
  public void EnterChildSurname(String childSurname){
    $(By.xpath(ChildSurnameNameXpath)).sendKeys(childSurname);

}
@Step("Select child gender")
  public void selectChildGender(String gender){
    WebElement g = $(By.xpath(ChildGenderXpath));
    selectFromDropdown(g, gender);

    //    Select g = $(By.xpath(ChildGenderXpath));
//    g.selectByVisibleText(gender);

}
@Step("Select if  the child  is a student or not ")
  public void IsChildStudentOrNot(String isStudent_or_Not){
    WebElement isStudent = $(By.xpath(ChildIsStudenteXpath));
    selectFromDropdown(isStudent,isStudent_or_Not);

//    Select isStudent = $(By.xpath(ChildIsStudenteXpath));
//    isStudent.selectByVisibleText(isStudent_or_Not);
}
@Step("Enter the child ID number")
  public void childIDNUM (String childIDNo){

    $(By.xpath(ChildIDnumXpath)).sendKeys(childIDNo);

}
@Step("Enter the child date of birth")
  public void childDateOfBirth(String year, String month, String day){

    String calenderMonthXpath = "//select[@class=\"ui-datepicker-month\"]";
    String calenderYear = "//select[@class=\"ui-datepicker-year\"]";
    String dates = "//*[@id=\"ui-datepicker-div\"]/table";

    WebElement calenderMn = $(By.xpath(calenderMonthXpath));
    WebElement calendeYr = $(By.xpath(calenderYear));

    $(By.xpath(ChildDOBXpath)).click();

//    String IDnumValues = $(By.xpath(Spouse_IDXpath)).getText();

//    if ($(By.xpath(Spouse_IDXpath)).containsText(IDnumValues)){
//      return;
//    }

  selectFromDropdown(calendeYr,year);
    selectFromDropdown(calenderMn, month);



//    Select mnth = $(By.xpath(calenderMonthXpath));
//    Select yer = $(By.xpath(calenderYear));
//    yer.selectByVisibleText(year);
//    mnth.selectByVisibleText(month);
  WebElement dats = $(By.xpath(dates));
  List<WebElement> activedates = dats.findElements(By.tagName("td"));

  for (WebElement datess : activedates) {
    String date = datess.getText();
//      System.out.println(date);
    if (date.equals(day)) {
      datess.click();
      break;
    }
  }

}

@Step("Click add another child button to add multiple children")
  public  void addAnotherCh(){
    $(By.xpath(AddAnotherChild)).click();

}
@Step("Click save details button to save captured child details")
  public void SaveChildDetails(){
    $(By.xpath(ChildSaveDetails)).click();
}
@Step("Check the add child(ren) checkbox")
  public void addChildrencheckBox(){
    $(By.xpath(AddChildrenCheckBoxXpath)).click();
}
@Step("select add optional clientele blue rewards")
  public void SelectBlueRewards(){
    $(By.xpath(AddOptionalClienteleBlueRewardsXpath)).click();

}
@Step("select add optional silver rewards")
    public void SelectSilverRewards(){
      $(By.xpath(AddOptionalClienteleSilverRewardXpath)).click();
  }
//@Step("Check total premium for cover selected")
//String checkPremium(){
//  final String text = $(By.xpath(TotalPremiumXpath)).getText();
//  return text;
//}
}






