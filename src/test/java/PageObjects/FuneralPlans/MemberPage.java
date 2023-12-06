package PageObjects.FuneralPlans;

import PageObjects.ID_Number;
import groovy.transform.Final;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class MemberPage extends PageObject {



    ID_Number idNumber;

    // element will be used when intro email is required
    String EmailXpath = "//input[@id=\"introEmail\"]";

    // elements for selecting Funeral dignity plan or ultimate dignity plan.
    String UltimateDignityPlanXpath = "//a[@href=\"?sale=OU\"]";
    String UltimateDignityPlanXpathHELP = "//a[@href=\"?sale=OG\"]";
    String FuneralDignityPlanXpath = "//a[@href=\"?sale=OR\"]";
    String HighestAmountXpath = "//*[@id=\"priceSliderTrack\"]/div[5]";


    String TitleXpath = "//select[@name=\"onTtl\"]";

    String NameXpath = "//input[@name=\"onName\"]";

    String SurnameXpath = "//input[@name=\"onSurname\"]";

    String IDnumXpath = "//input[@name=\"onID\"]";


    String EmailXPATH = "//*[@id=\"onEmail\"]";  // Email field on the members page
    String MobileNuXpath = "//input[@name=\"onMobile\"]";


    String PostalAddressXpath = "//input[@name=\"onAddress1\"]";
    String PostalCodeXpath = "//*[@id=\"onPostal\"]";

    String MaximumCoverXpath = "//*[@id=\"priceSliderTrack\"]/div[3]";
    String MonthlIncomeXpath = "//select[@name=\"onIncome\" ]";
    String OccupationXpath = "//select[@name=\"onOccupation\" ]";
    String educationXpath = "//select[@name=\"onEducation\"]";
    String FicDecl01Xpath = "//select[@name=\"fica01\" ]";
    String FicDecl02Xpath = "//select[@name=\"fica02\" ]";

    String sliderAmount = "//div[@class=\"fl trsm\"]";

    String ContinueBtnXpath = "(//div[@class='fr btn'][normalize-space()='Continue'])[1]";

    String CintXpath = "//*[@id=\"onlineSaleForm\"]/div/div[1]/div[2]/div[2]";

    String FuneralDignityPlanOptionXpath = "//*[@id=\"inline-landing\"]/table/tbody/tr[2]/td[1]";
    String UltimateDignityPlanOptionXpath = "//*[@id=\"inline-landing\"]/table/tbody/tr[3]/td[1]";

    String IDNumberValidation = "//span[@class=\"error nosuccess\"]";
    String ErrorXpath = "//*[@id=\"onlineSaleForm\"]/div/div[1]/div[1]/fieldset[1]/p[4]/span";
    String MultiplePolicyError = "//*[@id=\"onlineSaleForm\"]/div/div[1]/div[2]/div[4]";



    @Step("Verify slider amounts and select different amount")
    public void DifferentAmnt() throws InterruptedException {


        List<WebElement> amounts = getDriver().findElements(By.xpath(sliderAmount));

        List<String> amountsAvailible = new ArrayList<>();

        amountsAvailible.add(amounts.get(0).getText());

        amountsAvailible.add(amounts.get(1).getText());


        amountsAvailible.add(amounts.get(2).getText());


        amountsAvailible.add(amounts.get(3).getText());

 //       amountsAvailible.add(amounts.get(4).getText());


        for (String s : amountsAvailible) {
            if (s.equalsIgnoreCase("R125,000") || s.equalsIgnoreCase("R150,000") || s.equalsIgnoreCase("R200,000") || s.equalsIgnoreCase("R250,000")){
                System.out.println("Amounts are available for selection");
            } else {


                Assert.fail("amount have been changed");

            }

        }
    }

    @Step("Select R35000")
        public void selectR35000() throws InterruptedException {

            Actions actions = new Actions(getDriver());

            WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider\"]/span"));
            Thread.sleep(2000);

            actions.clickAndHold(elem_slider).moveByOffset(344,0).release().perform();

        }

    @Step("Select R40000")
    public void selectR40000() throws InterruptedException {

        Actions actions = new Actions(getDriver());

        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider\"]/span"));
        Thread.sleep(2000);

        actions.clickAndHold(elem_slider).moveByOffset(497,0).release().perform();

    }

    @Step("Select R45000")
    public void selectR45000() throws InterruptedException {

        Actions actions = new Actions(getDriver());

        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider\"]/span"));
        Thread.sleep(2000);

        actions.clickAndHold(elem_slider).moveByOffset(651,0).release().perform();

    }

    @Step("Select R50000")
    public void selectR50000() throws InterruptedException {

        Actions actions = new Actions(getDriver());

        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider\"]/span"));
        Thread.sleep(2000);

        actions.clickAndHold(elem_slider).moveByOffset(804,0).release().perform();

    }

    @Step("Select R200,000 H.E.L.P cover amount")
    public void selectR200000() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(getDriver());

        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider\"]/span"));




      // $(By.xpath(ContinueBtnXpath)).sendKeys(Keys.DOWN);
        WebElement a = $(By.xpath(ContinueBtnXpath));
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", a);

        Thread.sleep(2000);
        actions.clickAndHold(elem_slider).moveByOffset(426,0).release().perform();





    }

    @Step("Select R150,000 H.E.L.P cover amount")
    public void selectR150000() throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(getDriver());

        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider\"]/span"));
        Thread.sleep(2000);

        WebElement a = $(By.xpath(ContinueBtnXpath));
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", a);

        Thread.sleep(2000);
        actions.clickAndHold(elem_slider).moveByOffset(290,0).release().perform();





    }

    @Step("Select R250,000 H.E.L.P cover amount")
    public void selectR250000() throws InterruptedException {
        Actions actions = new Actions(getDriver());

        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider\"]/span"));
        Thread.sleep(2000);

        WebElement a = $(By.xpath(ContinueBtnXpath));
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", a);

        Thread.sleep(2000);
        actions.clickAndHold(elem_slider).moveByOffset(859,0).release().perform();





    }

    @Step("Generate random email address")
    public String GeneratedEmailAddress() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(100000);
        return "Address" + randomInt + "@gmail.com";


    }

    @Step("Check maximum cover to equal to R50000")
    public void
    MaximumCover() {
        boolean MaxCoverAmount = $(By.xpath(MaximumCoverXpath)).isDisplayed();
        if (MaxCoverAmount) {
            System.out.println("Max cover is displayed, The max cover amount is: " + $(By.xpath(MaximumCoverXpath)).getText());

        } else {
            Assert.fail("Max cover amount not displayed, please check member age entered");

        }

//        Assert.assertTrue($(By.xpath(MaximumCoverXpath)).containsText("R50,000"));


    }

    @Step("Confirm that Funeral dignity plan is visible")

    public void FuneraldignityPlanOption() {
        Assert.assertTrue($(By.xpath(FuneralDignityPlanOptionXpath)).isDisplayed());
        Assert.assertTrue($(By.xpath(FuneralDignityPlanOptionXpath)).isVisible());


    }

    @Step("Confirm that Ultimate dignity plan is visible")
    public void FuneralUltimatePlanOption() {
        Assert.assertTrue($(By.xpath(UltimateDignityPlanOptionXpath)).isDisplayed());
        Assert.assertTrue($(By.xpath(UltimateDignityPlanOptionXpath)).isVisible());


    }


    @Step(" check if 50000 is showing for selection")
    public void Is50000Avaliable() {

        boolean isR50000 = $(By.xpath(HighestAmountXpath)).isDisplayed();

        if (isR50000) {
            System.out.println("R50000 is available for selection");

        } else {

            Assert.fail("R50000 is not showing to the user");

        }

    }

    @Step("Enter email ")
    public void EnterEmail(String email) {

        $(By.xpath(EmailXpath)).sendKeys(email);


    }

    @Step("Select ultimate dignity plan")
    public void selectUltimatePlan() {

        Assert.assertTrue($(By.xpath(UltimateDignityPlanXpath)).isDisplayed());
        Assert.assertTrue($(By.xpath(UltimateDignityPlanXpath)).isClickable());
        $(By.xpath(UltimateDignityPlanXpath)).click();

    }



    @Step("Select ultimate dignity plan for H.E.L.P ")
    public void selectUltimatePlanforHelp() {

        Assert.assertTrue($(By.xpath(UltimateDignityPlanXpathHELP)).isDisplayed());
        Assert.assertTrue($(By.xpath(UltimateDignityPlanXpathHELP)).isClickable());
        $(By.xpath(UltimateDignityPlanXpathHELP)).click();

    }


    @Step("Select Title")
    public void SelectTitle(String Title) throws InterruptedException {
        Thread.sleep(20000);

        if ($(By.xpath("//*[@id=\"inline-cont\"]")).isDisplayed()) {

            $(By.xpath("//*[@id=\"contsale\"]")).click();
        }

        WebElement e = $(By.xpath(TitleXpath));
        selectFromDropdown(e, Title);

    }

    @Step("Enter name")
    public void EnterName(String name) {
        $(By.xpath(NameXpath)).sendKeys(name);

    }

    @Step("enter surname")
    public void Entersurname(String surname) {

        $(By.xpath(SurnameXpath)).sendKeys(surname);

    }

    @Step("enter member ID number ")
    public void enterMemberIDnum(String IDNUMBER) {



        $(By.xpath(IDnumXpath)).sendKeys(IDNUMBER);




    }

    @Step("Enter mobile Number")
    public void enterMobileNum(String MOBNo) {
        $(By.xpath(MobileNuXpath)).sendKeys(MOBNo);

    }

    @Step("Enter postal address")
    public void enterPostalAddress(String postaddres) {
        $(By.xpath(PostalAddressXpath)).sendKeys(postaddres);

    }

    @Step("Enter postal code")
    public void EnterPostalCode(String postcode) {
        $(By.xpath(PostalCodeXpath)).sendKeys(postcode);

    }

    @Step("Verify that Email address is populated to email field")

    public void EmailAdresPopulated() {
        WebElement Email = $(By.xpath(EmailXPATH));

        Assert.assertTrue(Email.isDisplayed());
        String emailTxt = Email.getText();
        if (emailTxt.isEmpty()) {
            System.out.println("Email address not populated");

        } else {

            Assert.fail("Email address is populated");


        }

    }

    @Step(" Select Monthly income")
    public void selectIncome(String value) {
        WebElement INC = $(By.xpath(MonthlIncomeXpath));
        INC.click();
        selectFromDropdown(INC, value);


    }

    @Step(" Select occupation")
    public void selectOccupation(String occupation) {
        WebElement occu = $(By.xpath(OccupationXpath));
        selectFromDropdown(occu, occupation);

    }

    @Step("Select education")
    public void selectEducation(String edu) {
        WebElement educ = $(By.xpath(educationXpath));
        selectFromDropdown(educ, edu);
    }

    @Step("Accept FICA declaration ")
    public void acceptFICAdecl(String Yes_No) {
        WebElement FD1 = $(By.xpath(FicDecl01Xpath));
        selectFromDropdown(FD1, Yes_No);
    }

    @Step("Accept FICA declaration ")
    public void acceptFicaDeclaration2(String YES_NO) {
        WebElement FD2 = $(By.xpath(FicDecl02Xpath));
        selectFromDropdown(FD2, YES_NO);
    }

    @Step("Click the continue button")
    public void clickContinueBtMember() throws InterruptedException {
        Thread.sleep(5000);

//        if ($(By.xpath(ContinueBtnXpath)).isClickable()) {
            $(By.xpath(CintXpath)).click();
//        } else {
//
//            Assert.fail("Button not clickable");
//        }
 }

    @Step("Verify that field is  validated and marked as red ")

    public void IDNumfieldValidated() {

        boolean IDValidationdisplayed = $(By.xpath(IDNumberValidation)).isDisplayed();

        if (IDValidationdisplayed){
            System.out.println("ID number validation is showing ");
        }else {

            Assert.fail("ID number validation is not showing");

        }

    }

    @Step(": confirm that error message is displayed")
    public void confirm_that_error_message_is_displayed() {
        Assert.assertTrue($(By.xpath(ErrorXpath)).isDisplayed());
    }

    @Step(" Message that confirm multiple policy should displayed")
    public void message_that_confirm_multiple_policy_should_displayed() {
        $(By.xpath(MultiplePolicyError)).isDisplayed() ;
        $(By.xpath(MultiplePolicyError)).click();

        String exp = "Multiple policies with main member details appear in our records.\n" +
                "One of our consultants will be in contact to assist you further.";
        WebElement m = $(By.xpath(MultiplePolicyError));
        String act = m.getText();
        System.out.println("Error message is: "+ act);
        //verify error message with Assertion
        Assert.assertEquals(exp, act);


    }
}

