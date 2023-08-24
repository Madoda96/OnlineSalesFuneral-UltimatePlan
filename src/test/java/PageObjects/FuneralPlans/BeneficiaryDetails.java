package PageObjects.FuneralPlans;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BeneficiaryDetails extends PageObject {

    String TitleXpath = "//select[@id=\"onTtlB1\"]";
    String BeneficiaryNameXpath = "//input[@id=\"onNameB1\"]";
    String BeneficiarySurnameXpath = "//input[@id=\"onSurnameB1\"]";
    String BeneficiaryIDnumberXpath = "//input[@id=\"onIdB1\"]";
    String BeneficiaryDOBXpath = "//input[@id=\"onDobB1\" ]";
    String MonthXPATH = "//select[@class=\"ui-datepicker-month\"]";

    String YearXpath = "//select[@class=\"ui-datepicker-year\"]";
    String BeneficiaryRelationshipXpath = "//select[@id=\"onRelationB1\"]";
    String AllocatedPercentageXpath = "//select[@id=\"allocationSlider1\"]";


    String TitleXpath2 = "//select[@id=\"onTtlB2\"]";
    String BeneficiaryNameXpath2 = "//input[@id=\"onNameB2\"]";
    String BeneficiarySurnameXpath2 = "//input[@id=\"onSurnameB2\"]";
    //String BeneficiaryIDnumberXpath2 = "//id=\"onIdB2\"]";
    String BeneficiaryIDnumberXpath2 = "//input[@id=\"onIdB2\"]";
    String BeneficiaryDOBXpath2 = "//input[@id=\"onDobB2\" ]";
    String MonthXPATH2 = "//select[@class=\"ui-datepicker-month\"]";

    //String YearXpath2 = "//select[@class=\"ui-datepicker-year\"]";
    String YearXPATH2 = "//select[@class=\"ui-datepicker-year\"]";
    String BeneficiaryRelationshipXpath2 = "//select[@id=\"onRelationB2\"]";
    String AllocatedPercentageXpath2 = "//select[@id=\"allocationSlider2\"]";


    String saveBtnXpath = "//div[@id=\"SaveBeneficiary\"]";

    String continueBtnXpath = "//div[@onclick=\"loader();step('3','no');\"]";
    String backBtnXpath = "//div[@onclick=\"stepback('1');\"]";

    String AddAnotherBeneficiaryXpath = "//button[@id=\"AddBeneficiary\"]";


    @Step("Select beneficial relationship")
    public void SelectBeneficiaryRelationship(String BeneficiaryRelationship) {

        WebElement benefiTitle = $(By.xpath(BeneficiaryRelationshipXpath));
        selectFromDropdown(benefiTitle, BeneficiaryRelationship);

    }

    @Step("Select percentage allocation")
    public void SelectPercentageAllocation(String PercentageAllocation) {

        WebElement Allocation = $(By.xpath(AllocatedPercentageXpath));
        selectFromDropdown(Allocation, PercentageAllocation);
    }

    @Step("Select beneficiary Title")
    public void SelectBeneficiaryTite(String Title) {
        WebElement benefiTitle = $(By.xpath(TitleXpath));
        selectFromDropdown(benefiTitle, Title);
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
        WebElement Year = $(By.xpath(YearXPATH2));
        WebElement months = $(By.xpath(MonthXPATH2));


        selectFromDropdown(Year, year);


        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, month);

        WebElement dts = $(By.xpath(activedatesXpath));
        List<WebElement> activedates = dts.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {
            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }
    }



    //Just a capture
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

    }

    @Step("Select beneficial relationship")
    public void SelectBeneficiaryRelationship2(String BeneficiaryRelationship) {

        WebElement benefiTitle = $(By.xpath(BeneficiaryRelationshipXpath2));
        selectFromDropdown(benefiTitle, BeneficiaryRelationship);

    }

    @Step("Select percentage allocation")
    public void SelectPercentageAllocation2(String PercentageAllocation) {

        WebElement Allocation = $(By.xpath(AllocatedPercentageXpath2));
        selectFromDropdown(Allocation, PercentageAllocation);
    }

    @Step("Select beneficiary Title")
    public void SelectBeneficiaryTite2(String Title) {
        WebElement benefiTitle = $(By.xpath(TitleXpath2));
        selectFromDropdown(benefiTitle, Title);
    }

    @Step(" Enter the name of the beneficiary")
    public void EnterBeneficiaryName2(String name) {
        $(By.xpath(BeneficiaryNameXpath2)).sendKeys(name);
    }

    @Step("Enter the surname of the beneficiary")
    public void EnterBeneficiarySurname2(String Bsurname) {
        $(By.xpath(BeneficiarySurnameXpath2)).sendKeys(Bsurname);
    }



}





