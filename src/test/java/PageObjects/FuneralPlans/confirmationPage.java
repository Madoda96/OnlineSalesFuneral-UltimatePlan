package PageObjects.FuneralPlans;

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

    String NonInsuranceXpath = "//*[@id=\"AdditionalBenefitsCnt\"]";


    //Policy page that contain Policy number and Monthly premium.Will be doing confirmations

    String ThankYouMsgXpath = "//span[@id=\"ThankYouMain\"]";
    String FinalMonthlyPremiumXpath = "//span[@id=\"Amount\"]";

    String PolicyNumXpath = "//span[@id=\"PolicyNumber\"]";



    String AgeErrorMessageXpath = "//*[@id=\"onlineSaleForm\"]/div/div[5]/div[2]/div[5]/ul/li";

    String staffDiscountPopUpXpath = "//div[@id=\"inline-payer-staff\"]";

    String staffDiscountPopupOkBtnXpath = "//*[@id=\"onlinepayerstaff\"]";

    String perksInformationXpath = "//*[@id=\"yuocovertextDiscountMsg\"]";



    @Step("Verify user view employee discounted amount and click okay button")
    public void discountAmnt(){

        boolean employeeDiscount = $(By.xpath(staffDiscountPopUpXpath)).isDisplayed();
        String employeeDiscountDescription = $(By.xpath(staffDiscountPopUpXpath)).getText();

        if(employeeDiscount){

            System.out.println("staff discount is visible to the user " + employeeDiscountDescription );
            $(By.xpath(staffDiscountPopupOkBtnXpath)).click();
        }else {
            Assert.fail("staff discount not displayed to user ");

        }
    }










    @Step("Check final premium amount")
    public String FinalAmount() {
        return $(By.xpath(FinalMonthlyPremiumXpath)).getText();

    }

    @Step("Check Non-Insurance information")
    public void NonInsuranceInfo() throws InterruptedException {

       Thread.sleep(5000);
        boolean nonInsuranceInfo = $(By.xpath(NonInsuranceXpath)).isDisplayed();

        if (nonInsuranceInfo) {
            System.out.println("Non-insurance information is showing: " + $(By.xpath(NonInsuranceXpath)).getText());

        } else {

            Assert.fail("Non-insurance information is not showing ");


        }


    }

    @Step("view total premium and first premium debit date")
    public void viewPremium() {
        boolean isPremiumVisibile = $(By.xpath(PremiumXpath)).isDisplayed();
        if (isPremiumVisibile) {
            System.out.println("Premiums are visibile to client based on the information captured");
        } else {

            Assert.fail("Premium is not visible to the user, check for any errors ");

        }


    }

    @Step(" Check Total initial premium amount")
    public void premiumAmount() {

        $(By.xpath(PremiumXpath)).getText();

    }

    @Step("View who is covered as per additional members added and main member")
    public void ViewWhoIsCovered() {
        boolean isWhoIsCoveredVisible = $(By.xpath(WhoIsCoveredXpath)).isDisplayed();
        if (isWhoIsCoveredVisible) {

            System.out.println("information about who is covered is displaye:" + $(By.xpath(WhoIsCoveredXpath)).getText());
        } else {

            Assert.fail("Information is not showing, check captured information if there are not error");

        }


    }

    @Step("View if the list of benefits is visible for the applicant")
    public void ViewBenefits() {
        boolean BenefitsVisible = $(By.xpath(BenefitsXpath)).isDisplayed();
        if (BenefitsVisible) {

            System.out.println("Benefits are showing to the user:" + $(By.xpath(BenefitsXpath)).getText());

        } else {

            Assert.fail("Benefits are not showing to the user");

        }




    }
    @Step("View if the Annual increase note is visible for the applicant")
    public void AnnualIncrease() {

        boolean isAnnualIncreaseVisible = $(By.xpath(AnnualIncreasesXpath)).isDisplayed();
        if (isAnnualIncreaseVisible) {
            System.out.println("Annual increase information is showing: " + $(By.xpath(AnnualIncreasesXpath)).getText());

        } else {


            Assert.fail("Annual increase information is not showing");
        }

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
    public void AcceptTermsAndConditions (){



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
    public void ViewThankYouMessage () {
        boolean ThankYouMsgVisible = $(By.xpath(ThankYouMsgXpath)).isDisplayed();

        if (ThankYouMsgVisible) {

            System.out.println("Thank you message is visible to the user: " + $(By.xpath(ThankYouMsgXpath)).getText());
        } else {

            Assert.fail("Thank you messsage is not visible to the user");

        }

    }
    @Step("View final monthly premium")
    public void finalPremiumMnth(String CoverAmount) {

        boolean isFinalMonth = $(By.xpath(FinalMonthlyPremiumXpath)).isDisplayed();
        if (isFinalMonth) {

            String CoverPremium = $(By.xpath(FinalMonthlyPremiumXpath)).getText();


            System.out.println("Final monthly premium is visible to the user:" + CoverPremium );
            Assert.assertEquals(CoverPremium, CoverAmount );


        } else {


            Assert.fail("Final premium is not visible to the user /  Final premium is not the same ");

        }


    }
    @Step("View and confirm if the applicants can see generated policy number ")
    public void PolicyNumber () {
        boolean isPolicyNUM = $(By.xpath(PolicyNumXpath)).isDisplayed();
        if (isPolicyNUM) {

            System.out.println("Policy number is generated and visible to the user: " + $(By.xpath(PolicyNumXpath)).getText());

        } else {


            Assert.fail("Policy number is not generated ");

        }

    }

    @Step("Check Age error message ")
    public void AgeErrorMessage (){
        String errorMessage = $(By.xpath(AgeErrorMessageXpath)).getText();
        String ExpectedErrorMessage ="The child (David Zulu) age of 20 is above the maximum allowed age of 18. The child (Mlandeli Zulu) age of 20 is above the maximum allowed age of 18.";

        Assert.assertTrue($(By.xpath(AgeErrorMessageXpath)).isDisplayed());
        if (errorMessage.equalsIgnoreCase(ExpectedErrorMessage)){
            System.out.println("Age error message is shown to the user");
        }else {

            Assert.fail("Age error message is not showing");

        }


    }


}
