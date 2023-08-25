package PageObjects.FuneralPlans;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayerDetails extends PageObject {


    String PayerTitleXpath = "//select[@name=\"onTtlP\"]";
    String PayerNameXpath = "//input[@name=\"onNameP\"]";
    String PayerSurnameXpath = "//input[@name=\"onSurnameP\"]";
    String PayerIDXpath = "//input[@name=\"onIDP\"]";
    String PayerMobileNumberXpath = "//input[@id=\"onMobileP\"]";
    String PayerWorkNumbXpath = "//input[@id=\"onWorkP\"]";
    String PayerHomeNumXpath = "//input[@id=\"onHomeP\"]";
    String PayerEmailXpath = "//input[@name=\"onEmailP\"]";

    String TotalPremiumXpath = "//span[@id=\"payerTotal\"]";


    //banking details xpaths

    String PayerBankNameXpath = "//select[@id=\"bankbankname\"]";
    String PayerBranchNameXpath = "//select[@name=\"bankbranchname\"]";
    String PayerAccountTypeXpath = "//select[@name=\"acctype\"]";
    String PayerAccountNumberXpath = "//input[@name=\"accnumber\" ]";
    String PayerDebitDateXpath = "//select[@name=\"debitdate\"]";


    // Debicheck Xpath

    String PayerCellphoneInHandXpath = "//select[@name=\"debicheck\"]";

    // Authorize
    String PayerDebitBankAccountXpath = "//*[@id=\"StripBank\"]/div[2]/div[4]/div/div[1]/table/tbody/tr/td[2]/label/span";


    // Back and Continue button
    String PayerBackButtonXpath = "//div[@onclick=\"stepbackFromPayment('2');\"]";

    String PayerContinueButtonXpath = "//div[@ onclick=\"loader();step('4','no');\"]";

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));



    @Step("Check Total Premium")
    public String TotalPremium() {
        String PremiumAmount = "";
        Assert.assertTrue($(By.xpath(TotalPremiumXpath)).isDisplayed());
        PremiumAmount = $(By.xpath(TotalPremiumXpath)).getText();
        return PremiumAmount;

    }


    @Step("Select payer title")
    public void SelectPayerTitle(String PayerTitle) {
        WebElement e = $(By.xpath(PayerTitleXpath));
        selectFromDropdown(e, PayerTitle);

    }

    @Step("Enter payer name")
    public void EnterPayerName(String PayerName) {
        $(By.xpath(PayerNameXpath)).sendKeys(PayerName);

    }
    @Step("Enter payer surname")
    public void EnterPayerSurname(String PayerSurname){
        $(By.xpath(PayerSurnameXpath)).sendKeys(PayerSurname);
    }

    @Step("Enter Payer ID number")
    public void EnterPayIDNumber (String PayerIDnum){
        $(By.xpath(PayerIDXpath)).sendKeys(PayerIDnum);


    }
    @Step("Enter payer mobile number")
    public void EnterPayerMobileNumber(String PayerMobileNum){
        $(By.xpath(PayerMobileNumberXpath)).sendKeys(PayerMobileNum);
    }
    @Step("Select bank name")
    public void SelectBankName (String bankName){


       WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PayerBankNameXpath)));
        selectFromDropdown(e, bankName);

    }
    @Step("Select branch name")
    public void selectBranchName (String BranchName){
        WebElement e = $(By.xpath(PayerBranchNameXpath));
        selectFromDropdown(e, BranchName);

    }
    @Step("Select payer account number")
    public void SelectAccountType(String AccountType){

        WebElement e = $(By.xpath(PayerAccountTypeXpath));
        selectFromDropdown(e, AccountType);

    }

    @Step("Enter account number")
    public void EnterAccNumber (String AccountNumber){
        $(By.xpath(PayerAccountNumberXpath)).sendKeys(AccountNumber);
    }
    @Step("Select debit date")
    public void EnterDebitDate (String DebitDate){
        WebElement e = $(By.xpath(PayerDebitDateXpath));
        selectFromDropdown(e, DebitDate);
    }

    @Step("Select Yes or No on cellphone on hand")
    public void Cellphone_on_hand(String Yes_No){
        WebElement e = $(By.xpath(PayerCellphoneInHandXpath));
        selectFromDropdown(e, Yes_No);
    }
    @Step("Authorize clientele to debit bank account")
    public void debitBankAcc (){

        $(By.xpath(PayerDebitBankAccountXpath)).click();

    }

    @Step("Click continue to see navigate to payer details page")
    public void clickContinueBtn(){
        $(By.xpath(PayerContinueButtonXpath)).click();
    }

    @Step("Verify that page is Payer details")
    public void payerdetailsPage (){
        String pageTitle = getTitle();
        String ExpectedTitle = "Online Sales";

        if (pageTitle.equals(ExpectedTitle)){

            System.out.println("User is on the the payer details page");

        }else {

            Assert.fail("User did not land on the payer details page");
        }




    }

}
