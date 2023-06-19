package PageObjects;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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


    //Policy page that contain Policy number and Monthly premium.Will be doing confirmations

    String ThankYouMsgXpath = "//span[@id=\"ThankYouMain\"]";
    String FinalMonthlyPremiumXpath = "//span[@id=\"Amount\"]";

    String PolicyNumXpath = "//span[@id=\"PolicyNumber\"]";




    @Step("view total premium and first premium debit date")
    public void viewPremium(){
        boolean isPremiumVisibile = $(By.xpath(PremiumXpath)).isDisplayed();

        Assert.assertTrue((isPremiumVisibile));


    }
    @Step("View who is covered as per additional members added and main member")
    public void ViewWhoIsCovered(){
        boolean isWhoIsCoveredVisible = $(By.xpath(WhoIsCoveredXpath)).isDisplayed();
        Assert.assertTrue(isWhoIsCoveredVisible);
    }

    @Step("View if the list of benefits is visible for the applicant")
    public void ViewBenefits(){
        boolean BenefitsVisible = $(By.xpath(BenefitsXpath)).isDisplayed();
        Assert.assertTrue(BenefitsVisible);

    }
    @Step("View if the Annual increase note is visible for the applicant")
    public void AnnualIncrease(){
        boolean isAnnualIncreaseVisible = $(By.xpath(AnnualIncreasesXpath)).isDisplayed();
        Assert.assertTrue(isAnnualIncreaseVisible);



    }
    @Step("View if disclaimer is available for applicant to read ")
    public void disclaimer(){
        WebDriver driver = getDriver();
        driver.switchTo().frame("Disclaimer");

        boolean isDisclosure = $(By.xpath(DisclosureXpath)).isDisplayed();
        Assert.assertTrue(isDisclosure);

        driver.switchTo().parentFrame();
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
        boolean ThankYouMsgVisible = $(By.xpath(ThankYouMsgXpath)).isDisplayed();
        Assert.assertTrue(ThankYouMsgVisible);

    }
    @Step("View final monthly premium")
    public void finalPremiumMnth(){

        boolean isFinalMonth = $(By.xpath(FinalMonthlyPremiumXpath)).isDisplayed();

        Assert.assertTrue(isFinalMonth);

    }
    @Step("View and confirm if the applicants can see generated policy number ")
    public void PolicyNumber (){
        boolean isPolicyNUM = $(By.xpath(PolicyNumXpath)).isDisplayed();
        Assert.assertTrue(isPolicyNUM);

    }


}
