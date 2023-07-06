package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class MemberPage extends PageObject {


    // element will be used when intro email is required
    String EmailXpath = "//input[@id=\"introEmail\"]";

    // elements for selecting Funeral dignity plan or ultimate dignity plan.
    String UltimateDignityPlanXpath = "//a[@href=\"?sale=OU\"]";
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
    String ContinueBtnXpath = "//div[@onclick=\"loader();step('1','no');\"]";

    String FuneralDignityPlanOptionXpath = "//*[@id=\"inline-landing\"]/table/tbody/tr[2]/td[1]";
    String UltimateDignityPlanOptionXpath = "//*[@id=\"inline-landing\"]/table/tbody/tr[3]/td[1]";

    String IDNumberValidation = "//*[@id=\"onlineSaleForm\"]/div/div[1]/div[1]/fieldset[1]/p[4]/span";


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
            System.out.println("Max cover amount not displayed, please check member age entered");
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

        boolean is50000 = $(By.xpath(HighestAmountXpath)).isDisplayed();

        if (is50000) {
            System.out.println("R50000 is available for selection");

        } else {
            System.out.println("R50000 is not showing to the user");

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

    @Step("Select Title")
    public void SelectTitle(String Title) {

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
    public void enterPostalAddress(String postadress) {
        $(By.xpath(PostalAddressXpath)).sendKeys(postadress);

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
            System.out.println("Email address is populated");

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
    public void clickContinueBt() {
        if ($(By.xpath(ContinueBtnXpath)).isClickable()) {
            $(By.xpath(ContinueBtnXpath)).click();
        } else {
            System.out.println("Button not clickable");
        }
    }

    @Step("Verify that field is  validated and marked as red ")
    public void IDNumfieldValidated() {

        Assert.assertTrue($(By.xpath(IDNumberValidation)).isDisplayed());

    }


}