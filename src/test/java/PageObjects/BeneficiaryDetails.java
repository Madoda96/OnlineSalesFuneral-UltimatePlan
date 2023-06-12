package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BeneficiaryDetails extends PageObject {

    String TitleXpath = "//select[@name=\"onTtlB\"]";
    String BeneficiaryNameXpath = "//input[@id=\"onNameB1\"]";
    String BeneficiarySurnameXpath = "//input[@id=\"onSurnameB1\"]";
    String BeneficiaryIDnumberXpath = "id=\"onIdB1\"";
    String BeneficiaryDOBXpath = "//input[@id=\"onDobB1\" ]";
    String MonthXPATH = "//select[@class=\"ui-datepicker-month\"]";

    String YearXpath = "//select[@class=\"ui-datepicker-year\"]";
    String BeneficiaryRelationshipXpath = "//select[@id=\"onRelationB1\"]";
    String AllocatedPercentageXpath = "//span[@id=\"dispAmount\"]";

    String saveBtnXpath = "//div[@id=\"SaveBeneficiary\"]";

    String continueBtnXpath = "//div[@onclick=\"loader();step('3','no');\"]";
    String backBtnXpath = "//div[@onclick=\"stepback('1');\"]";

    String AddAnotherBeneficiaryXpath = "//button[@id=\"AddBeneficiary\"]";


    @Step("Select beneficial relationship")
    public void SelectBeneficiaryRelationship(String BeneficiaryRelationship){

        WebElement benefiTitle = $(By.xpath(BeneficiaryRelationshipXpath));
        selectFromDropdown(benefiTitle, BeneficiaryRelationship);

    }

    @Step("Select percentage allocation")
    public void SelectPercentageAllocation(String PercentageAllocation){

        WebElement Allocation = $(By.xpath(AllocatedPercentageXpath));
        selectFromDropdown(Allocation, AllocatedPercentageXpath);



    }
    @Step("Select beneficiary Title")
    public void SelectBeneficiaryTite(String Title) {
        WebElement benefiTitle = $(By.xpath(TitleXpath));
        selectFromDropdown(benefiTitle, Title);


        //        Select select = $(By.xpath(TitleXpath));
//        select.selectByValue(Title);


    }

    @Step(" Enter the name of the beneficiary")
    public void EnterBeneficiaryName(String name) {
        $(By.xpath(BeneficiaryNameXpath)).sendKeys(name);
    }

    @Step("Enter the surname of the beneficiary")
    public void EnterBeneficiarySurname(String Bsurname) {
        $(By.xpath(BeneficiarySurnameXpath)).sendKeys(Bsurname);
    }

    @Step("Enter the beneficiary ID number")
    public void EnterBenefiaryIDnum(String IDnum) {
        $(By.xpath(BeneficiaryIDnumberXpath)).sendKeys(IDnum);
    }


    @Step(" Enter beneficiary date of birth")
    public void EnterDateOfBirth(String day, String month, String year) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody";

        $(By.xpath(BeneficiaryDOBXpath)).click();
        WebElement Year = $(By.xpath(YearXpath));
        WebElement months = $(By.xpath(MonthXPATH));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(Year, year);
//    yr.selectByVisibleText(Year);

        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, month);
//    mnth.selectByVisibleText(Month);

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


    @Step("Save captured beneficiary details")
    public void clickSaveDetails() {
        $(By.xpath(saveBtnXpath)).click();
    }

    @Step("Click continue button to land on the Payer details page ")
    public void clickContinueButtn() {
        $(By.xpath(continueBtnXpath)).click();

    }

    @Step("click back button to land on the additional members page")
    public void clickBackButton() {
        $(By.xpath(backBtnXpath)).click();


    }

    @Step("Click to add another beneficiary")
    public void clickToaddBeneficiary() {
        $(By.xpath(AddAnotherBeneficiaryXpath)).click();
   ////////
    }
}





