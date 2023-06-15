package PageObjects;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class confirmationPage extends PageObject {



    String EditBtnXpath = "//div[@onclick=\"stepTwo('1');\"]";
    String PremiumXpath = "//td[@id=\"StartText\"]";

    String WhoIsCoveredXpath = "//td[@id=\"PolicyMembers\"]";

    String BenefitsXpath = "//td[@id=\"EndText\"]";

    String AnnualIncreasesXpath = "//*[@id=\"PremiumIncreases\"]/table/tbody/tr[1]";

    String DisclosureXpath = "//iframe[@id=\"Disclaimer\"]";

    String ReadTermsAndConditions = "//*[@id=\"onlineSaleForm\"]/div/div[5]/div[1]/div[6]/div[2]/div/div[1]/table/tbody/tr/td[2]/label/span"; // redefine this xpath because it's too long

    String BackBtnXpath = "//div[@onclick=\"stepback('3');\"]";

    String ConfirmBtn = "//div[@onclick=\"loader();step('5','no');\"]";


    //Policy page that contain Policy number and Monthly premium.

    String ThankYouMsgXpath = "//span[@id=\"ThankYouMain\"]";
    String FinalMonthlyPremiumXpath = "//span[@id=\"Amount\"]";

    String PolicyNumXpath = "//span[@id=\"PolicyNumber\"]";




    @Step("view total premium and first premium debit date")
    public void viewPremium(){
        Assert.assertTrue($(By.xpath(PremiumXpath)).isDisplayed());

    }
    @Step("View who is covered as per additional members added and main member")
    public void ViewWhoIsCovered(){
        Assert.assertTrue($(By.xpath(WhoIsCoveredXpath)).isDisplayed());
    }

    @Step("View if the list of benefits is visible for the applicant")
    public void ViewBenefits(){
        Assert.assertTrue($(By.xpath(BenefitsXpath)).isDisplayed());

    }
    @Step("View if the Annual increase note is visible for the applicant")
    public void AnnualIncrease(){
        Assert.assertTrue($(By.xpath(AnnualIncreasesXpath)).isDisplayed());

    }
    @Step("View if disclaimer is available for applicant to read ")
    public void disclaimer(){
        Assert.assertTrue($(By.xpath(DisclosureXpath)).isDisplayed());

    }
    @Step("Click the checkbox to agree to terms and conditions")
    public void clickTermsAndConditions (){
        $(By.xpath(ReadTermsAndConditions)).click();

    }
    @Step("Click back button to navigate to payer details page")
    public void ClickBackBtn (){
        $(By.xpath(BackBtnXpath)).click();

    }
    @Step("Click confirm button ")
    public void ClickConfirmBtn (){
        $(By.xpath(ConfirmBtn)).click();

    }

    @Step("View thank you message ")
    public void ViewThankYouMessage (){
        Assert.assertTrue($(By.xpath(ThankYouMsgXpath)).isDisplayed());

    }
    @Step("View final monthly premium")
    public void finalPremiumMnth(){
        Assert.assertTrue($(By.xpath(FinalMonthlyPremiumXpath)).isDisplayed());

    }
    @Step("View and confirm if the applicants can see generated policy number ")
    public void PolicyNumber (){
        Assert.assertTrue($(By.xpath(PolicyNumXpath)).isDisplayed());

    }


}
