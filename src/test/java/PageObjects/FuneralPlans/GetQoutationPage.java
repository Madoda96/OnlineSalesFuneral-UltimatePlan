package PageObjects.FuneralPlans;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetQoutationPage extends PageObject {

    String FullNameXpath = "//input[@id=\"tfname\"]";
    String ContactNumberXpath = "//input[@id=\"tfcontact\"]";

    String EmailAddressXpath ="//input[@id=\"tfemail\"]";

    String DOBdateXpath = "//select[@id=\"tfday\"]";

    String DOBdMonthXpath = "//select[@id=\"tfmonth\"]";

    String DOBYearXpath = "//select[@id=\"tfyear\"]";


    String ChoosePlanXpath = "//select[@id=\"tfplan\"]";

    String CoverTypeXpath = "//select[@id=\"tfcover\"]";

    String CoverAmountXpath = "//select[@id=\"tfamount\"]";

    String ExtendedFamilyXpath = "//select[@id=\"tfadd\"]";

    String member1AgeXpath = "//html/body/div/form/div[9]/div[1]/table/tbody/tr[2]/td[2]/select";

    String member2AgeXpath = "/html/body/div/form/div[9]/div[1]/table/tbody/tr[3]/td[2]/select";

    String member3AgeXpath = "/html/body/div/form/div[9]/div[1]/table/tbody/tr[4]/td[2]/select";

    String member4AgeXpath = "/html/body/div/form/div[9]/div[1]/table/tbody/tr[5]/td[2]/select";

    String member5AgeXpath = "/html/body/div/form/div[9]/div[1]/table/tbody/tr[6]/td[2]/select";

    String member6AgeXpath = "/html/body/div/form/div[9]/div[1]/table/tbody/tr[7]/td[2]/select";

    String member7AgeXpath = "/html/body/div/form/div[9]/div[1]/table/tbody/tr[8]/td[2]/select";

    String member8AgeXpath = "/html/body/div/form/div[9]/div[1]/table/tbody/tr[9]/td[2]/select";

    String AddAnotherFamilyMember = "//input[@id=\"btnAdd\"]";

    String DeleteMemberXpath = "//input[@id=\"btnDel\"]";

    String SubmitXpath = "//input[@id=\"quote-submit\"]";

    String CoverInformationXpath = "//*[@id=\"emailwrap\"]/div[2]";





    public void AddAnotherFamMem(){
        $(By.xpath(AddAnotherFamilyMember)).click();

    }

    public void switchToFrame (){


        WebElement frame = $(By.tagName("iframe"));
        getDriver().switchTo().frame(frame);


    }



    @Step("Verify cover information based on captured information")
    public void CoverInformation(){
        boolean isCoverInfoDisplayed = $(By.xpath(CoverInformationXpath)).isDisplayed();

        if (isCoverInfoDisplayed){

            System.out.println("Cover information is captured : " + $(By.xpath(CoverInformationXpath)).getText() );
        }else
        {

            Assert.fail("Cover information is not showing");
        }
   }




    @Step("Enter full name ")
    public void EnterFullName(String fullName){
        $(By.xpath(FullNameXpath)).sendKeys(fullName);

    }
    @Step("Enter contact number ")
    public void EnterContactNumber(String ContactNum){

        $(By.xpath(ContactNumberXpath)).sendKeys(ContactNum);
    }

    @Step("Enter email address")
    public void EnterEmailAddress (String EnterEmail){
        $(By.xpath(EmailAddressXpath)).sendKeys(EnterEmail);

    }
    @Step("select Plan type")
    public void SelectPlanType(String selectPlanType){
        WebElement PlanTypeElement = $(By.xpath(ChoosePlanXpath));
        selectFromDropdown(PlanTypeElement,selectPlanType);


    }

    @Step("select cover type")
    public void SelectCoverType(String TypeOfCover){

        WebElement CoverTypeElement = $(By.xpath(CoverTypeXpath));
        selectFromDropdown(CoverTypeElement, TypeOfCover);

    }

    @Step("select cover amount")
    public void SelectCoverAmount(String CoverAmount){

        WebElement Coveramount = $(By.xpath(CoverAmountXpath));
        selectFromDropdown(Coveramount, CoverAmount);


    }

    @Step("select Plan type")
    public void SelectAddAnExtendedFamilyMember(String AdditionalFamilyMember){
        WebElement AddAdditionalFamilyMemberElement = $(By.xpath(ExtendedFamilyXpath));
        selectFromDropdown(AddAdditionalFamilyMemberElement,AdditionalFamilyMember );


    }

    @Step("Click the submit button")
    public void clickSubmit(){
        $(By.xpath(SubmitXpath)).click();
    }

    @Step("Click delete button to delete family member")
    public void ClickDelete(){
        $(By.xpath(DeleteMemberXpath)).click();

    }
    @Step("Select day of date of birth")
    public void dayOfDOB(String day){
        WebElement dayDOB = $(By.xpath(DOBdateXpath));
        selectFromDropdown(dayDOB, day);

    }

    @Step("select month of date of birth")
    public void monthOfDOB(String month){
        WebElement DOBMonth = $(By.xpath(DOBdMonthXpath));
        selectFromDropdown(DOBMonth, month);

    }

    @Step("select Year of date of birth")
    public void YearOfDOB(String month){
        WebElement DOBYear = $(By.xpath(DOBYearXpath));
        selectFromDropdown(DOBYear, month);

    }
    @Step("Select additional member age")
    public void selectAddMem1Age(String age){
        WebElement addMemAge = $(By.xpath(member1AgeXpath));
        selectFromDropdown(addMemAge, age);

    }

    @Step("Select additional member age")
    public void selectAddMem2Age(String age){
        WebElement addMemAge = $(By.xpath(member2AgeXpath));
        selectFromDropdown(addMemAge, age);

    }

    @Step("Select additional member age")
    public void selectAddMem3Age(String age){
        WebElement addMemAge = $(By.xpath(member3AgeXpath));
        selectFromDropdown(addMemAge, age);

    }

    @Step("Select additional member age")
    public void selectAddMem4Age(String age){
        WebElement addMemAge = $(By.xpath(member4AgeXpath));
        selectFromDropdown(addMemAge, age);

    }

    @Step("Select additional member age")
    public void selectAddMem5Age(String age){
        WebElement addMemAge = $(By.xpath(member5AgeXpath));
        selectFromDropdown(addMemAge, age);

    }
    @Step("Select additional member age")
    public void selectAddMem6Age(String age){
        WebElement addMemAge = $(By.xpath(member6AgeXpath));
        selectFromDropdown(addMemAge, age);

    }

    @Step("Select additional member age")
    public void selectAddMem7Age(String age){
        WebElement addMemAge = $(By.xpath(member7AgeXpath));
        selectFromDropdown(addMemAge, age);

    }

    @Step("Select additional member age")
    public void selectAddMem8Age(String age){
        WebElement addMemAge = $(By.xpath(member8AgeXpath));
        selectFromDropdown(addMemAge, age);

    }

}
