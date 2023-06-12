package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PayerDetails extends PageObject {


    String PayerTitleXpath = "//select[@name=\"onTtlP\"]";
    String PayerNameXpath = "//input[@name=\"onNameP\"]";
    String PayerSurnameXpath = "//input[@name=\"onSurnameP\"]";
    String PayerIDXpath = "//input[@name=\"onIDP\"]";
    String PayerMobileNumberXpath = "//input[@id=\"onMobileP\"]";
    String PayerWorkNumbXpath = "//input[@id=\"onWorkP\"]";
    String PayerHomeNumXpath = "//input[@id=\"onHomeP\"]";
    String PayerEmailXpath = "//input[@name=\"onEmailP\"]";


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





    public void SelectPayerTitle (String PayerTitle){
        WebElement e = $(By.xpath(PayerTitleXpath));
        selectFromDropdown(e, PayerTitle);

    }

    public void EnterPayerName(String PayerName){
        $(By.xpath(PayerNameXpath)).sendKeys(PayerName);

    }
    public void EnterPayerSurname(String PayerSurname){
        $(By.xpath(PayerSurnameXpath)).sendKeys(PayerSurname);
    }

    public void EnterPayIDNumber (String PayerIDnum){
        $(By.xpath(PayerIDXpath)).sendKeys(PayerIDnum);


    }
    public void EnterPayerMobileNumber(String PayerMobileNum){
        $(By.xpath(PayerMobileNumberXpath)).sendKeys(PayerMobileNum);
    }
    public void SelectBankName (String bankName){


    }
}
