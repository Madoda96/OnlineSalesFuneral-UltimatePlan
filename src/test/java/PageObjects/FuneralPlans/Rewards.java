package PageObjects.FuneralPlans;

import PageObjects.ID_Number;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static net.serenitybdd.core.Serenity.getDriver;

public class Rewards extends PageObject {

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

    //Additional Members
    String AddSpouseCheckbxXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[7]/fieldset/div[1]/div[1]/label/span";
    String ADDSpouseXpath = "//label[@for='addspouse01']//span[@class='rd']";
    String AddChildrenCheckBoxXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[8]/fieldset/div[1]/div[1]/label/span";
    String AddExtendedMemberCheckBoxXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[9]/fieldset/div[1]/div[1]/label/span";
    String AdSpouseCHKBOX = "(//span[@class='rd'])[1]";



    // additional member web elements

    String ExtendedMemberTitleXpath1 = "//select[@id=\"onTtlMem1\"]";
    String ExtendedMemberNameXpath1 = "//input[@id=\"onNameMem1\"]";
    String ExtendedMemberSurnameXpath1 = "//input[@id=\"onSurnameMem1\"]";
    String ExtendedMemberGenderXpath1 = "//select[@id=\"onGenderMem1\"]";
    String ExtendedMemberDOBpath1 = "//input[@id=\"onDobMem1\"]";
    String ExtendedMemberRelationXpath1 = "//select[@id=\"onRelationMem1\"]";


    String ExtendedMemberTitleXpath2 = "//select[@id=\"onTtlMem2\"]";
    String ExtendedMemberNameXpath2 = "//input[@id=\"onNameMem2\"]";
    String ExtendedMemberSurnameXpath2 = "//input[@id=\"onSurnameMem2\"]";
    String ExtendedMemberGenderXpath2 = "//select[@id=\"onGenderMem2\"]";
    String ExtendedMemberDOBpath2 = "//input[@id=\"onDobMem2\"]";
    String ExtendedMemberRelationXpath2 = "//select[@id=\"onRelationMem2\"]";

    String ExtendedMemberTitleXpath3 = "//select[@id=\"onTtlMem3\"]";
    String ExtendedMemberNameXpath3 = "//input[@id=\"onNameMem3\"]";
    String ExtendedMemberSurnameXpath3 = "//input[@id=\"onSurnameMem3\"]";
    String ExtendedMemberGenderXpath3 = "//select[@id=\"onGenderMem3\"]";
    String ExtendedMemberDOBpath3 = "//input[@id=\"onDobMem3\"]";
    String ExtendedMemberRelationXpath3 = "//select[@id=\"onRelationMem3\"]";

    String ExtendedMemberTitleXpath4 = "//select[@id=\"onTtlMem4\"]";
    String ExtendedMemberNameXpath4 = "//input[@id=\"onNameMem4\"]";
    String ExtendedMemberSurnameXpath4 = "//input[@id=\"onSurnameMem4\"]";
    String ExtendedMemberGenderXpath4 = "//select[@id=\"onGenderMem4\"]";
    String ExtendedMemberDOBpath4 = "//input[@id=\"onDobMem4\"]";
    String ExtendedMemberRelationXpath4 = "//select[@id=\"onRelationMem4\"]";

    String ExtendedMemberTitleXpath5 = "//select[@id=\"onTtlMem5\"]";
    String ExtendedMemberNameXpath5 = "//input[@id=\"onNameMem5\"]";
    String ExtendedMemberSurnameXpath5 = "//input[@id=\"onSurnameMem5\"]";
    String ExtendedMemberGenderXpath5 = "//select[@id=\"onGenderMem5\"]";
    String ExtendedMemberDOBpath5 = "//input[@id=\"onDobMem5\"]";
    String ExtendedMemberRelationXpath5 = "//select[@id=\"onRelationMem5\"]";

    String ExtendedMemberTitleXpath6 = "//select[@id=\"onTtlMem6\"]";
    String ExtendedMemberNameXpath6 = "//input[@id=\"onNameMem6\"]";
    String ExtendedMemberSurnameXpath6 = "//input[@id=\"onSurnameMem6\"]";
    String ExtendedMemberGenderXpath6 = "//select[@id=\"onGenderMem6\"]";
    String ExtendedMemberDOBpath6 = "//input[@id=\"onDobMem6\"]";
    String ExtendedMemberRelationXpath6 = "//select[@id=\"onRelationMem6\"]";


    String ExtendedMemberTitleXpath7 = "//select[@id=\"onTtlMem7\"]";
    String ExtendedMemberNameXpath7 = "//input[@id=\"onNameMem7\"]";
    String ExtendedMemberSurnameXpath7 = "//input[@id=\"onSurnameMem7\"]";
    String ExtendedMemberGenderXpath7 = "//select[@id=\"onGenderMem7\"]";
    String ExtendedMemberDOBpath7 = "//input[@id=\"onDobMem7\"]";
    String ExtendedMemberRelationXpath7 = "//select[@id=\"onRelationMem7\"]";

    String ExtendedMemberTitleXpath8 = "//select[@id=\"onTtlMem8\"]";
    String ExtendedMemberNameXpath8 = "//input[@id=\"onNameMem8\"]";
    String ExtendedMemberSurnameXpath8 = "//input[@id=\"onSurnameMem8\"]";
    String ExtendedMemberGenderXpath8 = "//select[@id=\"onGenderMem8\"]";
    String ExtendedMemberDOBpath8 = "//input[@id=\"onDobMem8\"]";
    String ExtendedMemberRelationXpath8 = "//select[@id=\"onRelationMem8\"]";

    String SaveExtendedMemberBtnXpath = "//div[@id=\"SaveMember\"]";
    String ERXpath = "//input[@id=\"onNameB1\"]";

    String AddAnotherExtendedMmeberBtnXpath = "//button[@id=\"AddMember\"]";

    String RemoveExtendedMmemberXpath = "//button[@id=\"RemoveMember\"]";


    // Non insurance Web Element
    String AddOptionalClienteleBlueRewardsXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[10]/fieldset/div[2]/div[1]/label/span";

    String AddOptionalClienteleSilverRewardXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[11]/fieldset/div[2]/div[1]/label/span";

    String TitleAddXpath = "//select[@id=\"onTtlSp\"]"; //select[@id="onTtlSp"]

    String Spouse_NameXpath = "//input[@name=\"onNameSp\"]";

    String Spouse_SurnameNameXpath = "//input[@name=\"onSurnameSp\"]";

    String Spouse_GenderXpath = "//select[@id=\"onGenderSp\"]";

    String Spouse_IDXpath = "//input[@name=\"onIdNumSp\"]";

    String Spouse_DoBXpath = "//input[@name=\"onDob\"]";
    String Spouse_DoBXpathh = "//*[@id=\"onDob\"]";
    String CalenderYear = "//select[@class=\"ui-datepicker-year\"]";

    String CalenderMonth = "//select[@class=\"ui-datepicker-month\"]";

    String SaveBtnXpath = "//div[@id=\"SaveSpouse\"]";

    String DeleteBtnXpath = "//div[@class=\"butDelete\"]";

    String EditBtnXpath = "//div[@class=\"butEdit\"]";

    String ContinueBtnAddXpath = "//div[@onclick=\"loader();step('2','no');\"]";
    String BackBtnXpath = "//div[@onclick=\"stepback('0');\"]";
    String ChildNameXpath = "//input[@id=\"onNameCh1\"]";
    String ChildSurnameNameXpath = "//input[@id=\"onSurnameCh1\"]";
    String ChildGenderXpath = "//select[@id=\"onGenderCh1\"]";
    String ChildIsStudenteXpath = "//select[@id=\"onChIsStudent1\"]";
    String ChildIDnumXpath = "//input[@id=\"onIdNumCh1\"]";
    String ChildDOBXpath = "//input[@id=\"onDobCh1\"]";

    String Child2NameXpath = "//input[@id=\"onNameCh2\"]";
    String Child2Xpath = "//*[@id=\"onNameCh2\"]";
    String Child2SurnameNameXpath = "//input[@id=\"onSurnameCh2\"]";
    String Child2GenderXpath = "//select[@id=\"onGenderCh2\"]";
    String Child2IsStudenteXpath = "//select[@id=\"onChIsStudent2\"]";
    String ChildID2numXpath = "//input[@id=\"onIdNumCh2\"]";

    String Child2DOBXpath = "//input[@id=\"onDobCh2\"]";


    String Child3NameXpath = "//input[@id=\"onNameCh3\"]";
    String Child3Xpath = "//*[@id=\"onNameCh3\"]";
    String Child3SurnameNameXpath = "//input[@id=\"onSurnameCh3\"]";
    String Child3GenderXpath = "//select[@id=\"onGenderCh3\"]";
    String Child3IsStudenteXpath = "//select[@id=\"onChIsStudent3\"]";
    String ChildID3numXpath = "//input[@id=\"onIdNumCh3\"]";
    String Child3DOBXpath = "//input[@id=\"onDobCh3\"]";


    String AddAnotherChild = "//button[@id=\"AddChild\"]";
    String ChildSaveDetails = "//div[@id=\"SaveChild\"]";

    String TotalPremiumXpath = "//div[@id=\"AllSumtotasl\"]";


    String BlueRewardsXpath = "//*[@id=\"onlineSaleForm\"]/div/div[2]/div[1]/div[10]/fieldset/div[2]/div[1]/label/span";

    String BlueRewardsAccessToDevice = "//*[@id=\"addRewardText\"]/span[1]";

    String SilverRewardsAccessToDevice = "//*[@id=\"addRewardText2\"]/span[1]";

    String SaveBlueRewardsAccessToDevice = "//div[@id=\"SaveRewards\"]";

    String SaveSilverRewardsAccessToDevice = "//div[@id=\"SaveRewards2\"]";

    String SilverRewardsXpath = "(//span[@class='rd'])[4]";

    String BlueRewardsInfoXpath = "//div[@id=\"RewardsFieldsGroup\"]";

    String SilverRewardsInfoXpath = "//div[@id=\"RewardsFieldsGroup2\"]";

    String MinimumAmountForMembersLessThan50Xpath = "//*[@id=\"priceSliderTrack1\"]/div[1]";

    String MaximumAmountForMembersLessThan50Xpath = "//*[@id=\"priceSliderTrack1\"]/div[5]";

    String MinimumAmountForMembersgreatherThan50Xpath = "//*[@id=\"priceSliderTrack1\"]/div[1]";

    String MaximumAmountForMembersgreaterThan50Xpath = "//*[@id=\"priceSliderTrack1\"]/div[6]";
    String CoverInfomation = "//div[@id=\"yuocovertext2\"]";

    String PerksPopUp = "//div[@class=\"overlayDiscountMsgBox\"]";

    String ClosePerksPopUpXpath = "//*[@id=\"overlayDiscount\"]/div/div[1]/img";


    //Beneficiary
    String TitleBenXpath = "//select[@id=\"onTtlB1\"]";
    String BeneficiaryNameXpath = "//input[@id=\"onNameB1\"]";
    String BeneficiaryName1Xpath = "//*[@id=\"onNameB1\"]";
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


//PayerDetails

    String PayerTitleXpath = "//select[@name=\"onTtlP\"]";
    String PayerNameXpath = "//input[@name=\"onNameP\"]";
    String PayerSurnameXpath = "//input[@name=\"onSurnameP\"]";
    String PayerIDXpath = "//input[@name=\"onIDP\"]";
    String PayerMobileNumberXpath = "//input[@id=\"onMobileP\"]";
    String PayerWorkNumbXpath = "//input[@id=\"onWorkP\"]";
    String PayerHomeNumXpath = "//input[@id=\"onHomeP\"]";
    String PayerEmailXpath = "//input[@name=\"onEmailP\"]";

    String TotalPremiumPayXpath = "//span[@id=\"payerTotal\"]";


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



    @Step("Verify that employee receives 20% for perks")
    public void employeePerks() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        boolean PerksPopupDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PerksPopUp))).isDisplayed();


        if(PerksPopupDisplayed){

            System.out.println("Perks discount is available for employee and they have received 20%");
            $(By.xpath(ClosePerksPopUpXpath)).click();

        }else {

            Assert.fail("Employee doesn't have perks and they will not be receiving 20%");


        }
    }

    @Step("select that you have access to andriod/IOS device for silver rewards")
    public void checkAccessToDeviceForSilver() {
        $(By.xpath(SilverRewardsAccessToDevice)).click();
        $(By.xpath(SaveSilverRewardsAccessToDevice)).click();

    }

    @Step("select that you have access to andriod/IOS device for blue rewards")
    public void checkAccessToDeviceForBlue() {
        $(By.xpath(BlueRewardsAccessToDevice)).click();
        $(By.xpath(SaveBlueRewardsAccessToDevice)).click();

    }

    @Step("Check cover information with captured information")
    public void CheckInformationWithAdditionalMembers() {
        Assert.assertTrue($(By.xpath(CoverInfomation)).isVisible());
        Assert.assertTrue($(By.xpath(CoverInfomation)).isDisplayed());
        Assert.assertTrue($(By.xpath(CoverInfomation)).containsText("Reward"));



    }


    @Step("Verify that R30000 is the maximum cover amount for members between 0 and 50")
    public void verifyMaximumCoverAmountForExtendedMembers0_and_50() {
        Assert.assertTrue($(By.xpath(MaximumAmountForMembersLessThan50Xpath)).isDisplayed());
        Assert.assertTrue($(By.xpath(MaximumAmountForMembersLessThan50Xpath)).containsText("R50,000"));

    }

    @Step("Verify that R10000 is the minimum cover amount for members between 0 and 50")
    public void verifyMiniumCoverAmountForExtendedMembers0_and_50() {
        Boolean minimumAmntForMembersLessThan50 = $(By.xpath(CoverInfomation)).isDisplayed();
        Boolean ContainsAmount = $(By.xpath(MinimumAmountForMembersLessThan50Xpath)).containsText("R10,000");
        if (minimumAmntForMembersLessThan50 && ContainsAmount) {
            System.out.println("minimum amount is displayed to user: " + $(By.xpath(MinimumAmountForMembersLessThan50Xpath)).getText());

        } else {


            Assert.fail("minimum amount is not displayed to user");

        }


    }

    @Step("Verify that R5000 is the minimum cover amount for members between 51 and 81")
    public void verifyMiniumCoverAmountForExtendedMembers51_and81() {
        boolean MinimumAmountForMembersGreaterthan50 = $(By.xpath(MinimumAmountForMembersgreatherThan50Xpath)).isDisplayed();
        if (MinimumAmountForMembersGreaterthan50) {
            System.out.println("R5000 minimum cover is dislayed:" + $(By.xpath(MinimumAmountForMembersgreatherThan50Xpath)).getText());

        } else {

            Assert.fail("R5000 is not displayed check if entered age is above 51 but less than 81");

        }


    }

    @Step("Verify that R30000 is the maximum cover amount for members between 51 and 81")
    public void verifyMaximumCoverAmountForExtendedMembers51_and81() {
        boolean MaximumAmountForMembersgreaterThan50 = $(By.xpath(MaximumAmountForMembersgreaterThan50Xpath)).isDisplayed();
        if (MaximumAmountForMembersgreaterThan50) {
            System.out.println("Maximum amount is showing for users between the ages of 51 and 81:" + $(By.xpath(MaximumAmountForMembersgreaterThan50Xpath)).getText());

        } else {

            Assert.fail("Maximum amount not showing to users, check the age of extended member(s)");

        }


    }


    @Step(" Read blue rewards information")
    public void ReadBlueRewardsInfo() {
        boolean blueRewardsInfo = $(By.xpath(BlueRewardsInfoXpath)).isVisible();
        if (blueRewardsInfo) {
            System.out.println("Blue rewards information is visibible: " + $(By.xpath(BlueRewardsInfoXpath)).getText());

        } else {

            Assert.fail("Blue rewards information is not showing");

        }



    }

    @Step(" Read silver rewards information")
    public void ReadSilverRewardsInfo() {
        boolean silverRewardsInfo = $(By.xpath(SilverRewardsInfoXpath)).isVisible();
        if (silverRewardsInfo) {

            System.out.println("Silver rewards information is showing " + $(By.xpath(SilverRewardsInfoXpath)).getText());

        } else {
            Assert.fail("Silver rewards information is not showing ");

        }

    }

    @Step("select non insurance blue rewards")
    public void selectBlueReward() {
        $(By.xpath(BlueRewardsXpath)).click();

    }

    @Step("Select non insurance silver rewards")
    public void selectSilverRewards10() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(SilverRewardsXpath)).click();

    }


    @Step("Click additional member checkbox")

    public void clickExtendedMemberCheckbx() throws InterruptedException {

//        boolean addExtendedMember = $(By.xpath(AddExtendedMemberCheckBoxXpath)).isDisplayed();
//
//        if (addExtendedMember) {

        $(By.xpath(AddExtendedMemberCheckBoxXpath)).click();

//        } else {
//
//            Assert.fail("Checkbox not displayed");
//
//        }

    }

    @Step("Select extended member title")

    public void selectExtMemberTitle1(String ExtendedMemberTitle) {

        WebElement ExtmemeberTitle1 = $(By.xpath(ExtendedMemberTitleXpath1));
        selectFromDropdown(ExtmemeberTitle1, ExtendedMemberTitle);

    }

    @Step("Select extended member title")
    public void selectExtMemberTitle2(String ExtendedMemberTitle2) {

        WebElement ExtmemeberTitle2 = $(By.xpath(ExtendedMemberTitleXpath2));
        selectFromDropdown(ExtmemeberTitle2, ExtendedMemberTitle2);

    }

    @Step("Select extended member title")
    public void selectExtMemberTitl3(String ExtendedMemberTitle3) {

        WebElement ExtmemeberTitle3 = $(By.xpath(ExtendedMemberTitleXpath3));
        selectFromDropdown(ExtmemeberTitle3, ExtendedMemberTitle3);

    }

//
//    @Step("Select different amount for extended member 1")
//    public void selectDifferentAmnt() throws InterruptedException {
//
//
//        Actions actions = new Actions(getDriver());
//
//        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"priceSlider1\"]/span"));
//        Thread.sleep(2000);
//
//        String sliderAmount = "//div[@class=\"fl trsm\"]";
//
//        actions.clickAndHold(elem_slider).moveByOffset(219, 0).release().perform();
//
//
//        List<WebElement> amounts = getDriver().findElements(By.xpath(sliderAmount));
//
//        List<String> amountsAvailible = new ArrayList<>();
//        amountsAvailible.add(amounts.get(5).getText());
//        System.out.println(amounts.get(5).getLocation());
//
//
//        amountsAvailible.add(amounts.get(6).getText());
//        System.out.println(amounts.get(6).getLocation());
//
//        amountsAvailible.add(amounts.get(7).getText());
//        System.out.println(amounts.get(7).getLocation());
//
//        amountsAvailible.add(amounts.get(8).getText());
//        System.out.println(amounts.get(8).getLocation());
//
//        amountsAvailible.add(amounts.get(9).getText());
//        System.out.println(amounts.get(9).getLocation());
//        //       amountsAvailible.add(amounts.get(5).getText());
//
//
//        for (String s : amountsAvailible) {
//            if (s.equalsIgnoreCase("R30,000") || s.equalsIgnoreCase("R35,000") || s.equalsIgnoreCase("R40,000") || s.equalsIgnoreCase("R45,000") || s.equalsIgnoreCase("R50,000")) {
//                System.out.println("Amounts are available for selection");
//            } else {
//
//                System.out.println("amount are  not available for selection");
//                Assert.fail("Some amounts are not visible to the user");
//
//            }
//
//        }
//
//
//    }


    @Step("Select extended member title")
    public void selectExtMemberTitle4(String ExtendedMemberTitle4) {

        WebElement ExtmemeberTitle4 = $(By.xpath(ExtendedMemberTitleXpath4));
        selectFromDropdown(ExtmemeberTitle4, ExtendedMemberTitle4);

    }

    @Step("Select extended member title")
    public void selectExtMemberTitle5(String ExtendedMemberTitle5) {

        WebElement ExtmemeberTitle5 = $(By.xpath(ExtendedMemberTitleXpath5));
        selectFromDropdown(ExtmemeberTitle5, ExtendedMemberTitle5);

    }

    @Step("Select extended member title")
    public void selectExtMemberTitle6(String ExtendedMemberTitle6) {

        WebElement ExtmemeberTitle6 = $(By.xpath(ExtendedMemberTitleXpath6));
        selectFromDropdown(ExtmemeberTitle6, ExtendedMemberTitle6);

    }

    @Step("Select extended member title")
    public void selectExtMemberTitle7(String ExtendedMemberTitle7) {

        WebElement ExtmemeberTitle7 = $(By.xpath(ExtendedMemberTitleXpath7));
        selectFromDropdown(ExtmemeberTitle7, ExtendedMemberTitle7);

    }

    @Step("Select extended member title")
    public void selectExtMemberTitle8(String ExtendedMemberTitle8) {

        WebElement ExtmemeberTitle8 = $(By.xpath(ExtendedMemberTitleXpath8));
        selectFromDropdown(ExtmemeberTitle8, ExtendedMemberTitle8);

    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName1(String ExtendedMemberName1) {
        $(By.xpath(ExtendedMemberNameXpath1)).sendKeys(ExtendedMemberName1);
    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName2(String ExtendedMemberName2) {
        $(By.xpath(ExtendedMemberNameXpath2)).sendKeys(ExtendedMemberName2);
    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName3(String ExtendedMemberName3) {
        $(By.xpath(ExtendedMemberNameXpath3)).sendKeys(ExtendedMemberName3);
    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName4(String ExtendedMemberName4) {
        $(By.xpath(ExtendedMemberNameXpath4)).sendKeys(ExtendedMemberName4);
    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName5(String ExtendedMemberName5) {
        $(By.xpath(ExtendedMemberNameXpath5)).sendKeys(ExtendedMemberName5);
    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName6(String ExtendedMemberName6) {
        $(By.xpath(ExtendedMemberNameXpath6)).sendKeys(ExtendedMemberName6);
    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName7(String ExtendedMemberName7) {
        $(By.xpath(ExtendedMemberNameXpath7)).sendKeys(ExtendedMemberName7);
    }

    @Step("Enter extended member Name")
    public void EnterExtendedMemberName8(String ExtendedMemberName8) {
        $(By.xpath(ExtendedMemberNameXpath8)).sendKeys(ExtendedMemberName8);
    }


    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname(String ExtendedMenberSurname) {
        $(By.xpath(ExtendedMemberSurnameXpath1)).sendKeys(ExtendedMenberSurname);

    }

    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname2(String ExtendedMenberSurname2) {
        $(By.xpath(ExtendedMemberSurnameXpath2)).sendKeys(ExtendedMenberSurname2);

    }

    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname3(String ExtendedMenberSurname3) {
        $(By.xpath(ExtendedMemberSurnameXpath3)).sendKeys(ExtendedMenberSurname3);

    }

    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname4(String ExtendedMenberSurname4) {
        $(By.xpath(ExtendedMemberSurnameXpath4)).sendKeys(ExtendedMenberSurname4);

    }

    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname5(String ExtendedMenberSurname5) {
        $(By.xpath(ExtendedMemberSurnameXpath5)).sendKeys(ExtendedMenberSurname5);

    }

    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname6(String ExtendedMenberSurname6) {
        $(By.xpath(ExtendedMemberSurnameXpath6)).sendKeys(ExtendedMenberSurname6);

    }

    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname7(String ExtendedMenberSurname7) {
        $(By.xpath(ExtendedMemberSurnameXpath7)).sendKeys(ExtendedMenberSurname7);

    }

    @Step("Enter extended member surname ")
    public void EnterExtendedMemberSurname8(String ExtendedMenberSurname8) {
        $(By.xpath(ExtendedMemberSurnameXpath8)).sendKeys(ExtendedMenberSurname8);

    }

    @Step("Select extended member gender")
    public void SelectExtendedMemberGender1(String ExtendedMemberGender1) {
        WebElement ExtMemberGender1 = $(By.xpath(ExtendedMemberGenderXpath1));
        selectFromDropdown(ExtMemberGender1, ExtendedMemberGender1);

    }


    @Step("Select extended member gender")
    public void SelectExtendedMemberGender2(String ExtendedMemberGender2) {
        WebElement ExtMemberGender2 = $(By.xpath(ExtendedMemberGenderXpath2));
        selectFromDropdown(ExtMemberGender2, ExtendedMemberGender2);

    }

    @Step("Select extended member gender")
    public void SelectExtendedMemberGender3(String ExtendedMemberGender3) {
        WebElement ExtMemberGender3 = $(By.xpath(ExtendedMemberGenderXpath3));
        selectFromDropdown(ExtMemberGender3, ExtendedMemberGender3);

    }

    @Step("Select extended member gender")
    public void SelectExtendedMemberGender4(String ExtendedMemberGender4) {
        WebElement ExtMemberGender4 = $(By.xpath(ExtendedMemberGenderXpath4));
        selectFromDropdown(ExtMemberGender4, ExtendedMemberGender4);

    }

    @Step("Select extended member gender")
    public void SelectExtendedMemberGender5(String ExtendedMemberGender5) {
        WebElement ExtMemberGender5 = $(By.xpath(ExtendedMemberGenderXpath5));
        selectFromDropdown(ExtMemberGender5, ExtendedMemberGender5);

    }

    @Step("Select extended member gender")
    public void SelectExtendedMemberGender6(String ExtendedMemberGender6) {
        WebElement ExtMemberGender6 = $(By.xpath(ExtendedMemberGenderXpath6));
        selectFromDropdown(ExtMemberGender6, ExtendedMemberGender6);

    }

    @Step("Select extended member gender")
    public void SelectExtendedMemberGender7(String ExtendedMemberGender7) {
        WebElement ExtMemberGender7 = $(By.xpath(ExtendedMemberGenderXpath7));
        selectFromDropdown(ExtMemberGender7, ExtendedMemberGender7);

    }

    @Step("Select extended member gender")
    public void SelectExtendedMemberGender8(String ExtendedMemberGender8) {
        WebElement ExtMemberGender8 = $(By.xpath(ExtendedMemberGenderXpath8));
        selectFromDropdown(ExtMemberGender8, ExtendedMemberGender8);

    }

    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation1(String ExtendedMemberRelation1) {
        WebElement ExtMemberRelation1 = $(By.xpath(ExtendedMemberRelationXpath1));
        selectFromDropdown(ExtMemberRelation1, ExtendedMemberRelation1);

    }

    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation2(String ExtendedMemberRelation2) {
        WebElement ExtMemberRelation2 = $(By.xpath(ExtendedMemberRelationXpath2));
        selectFromDropdown(ExtMemberRelation2, ExtendedMemberRelation2);

    }

    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation3(String ExtendedMemberRelation3) {
        WebElement ExtMemberRelation3 = $(By.xpath(ExtendedMemberRelationXpath3));
        selectFromDropdown(ExtMemberRelation3, ExtendedMemberRelation3);

    }

    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation4(String ExtendedMemberRelation4) {
        WebElement ExtMemberRelation4 = $(By.xpath(ExtendedMemberRelationXpath4));
        selectFromDropdown(ExtMemberRelation4, ExtendedMemberRelation4);

    }

    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation5(String ExtendedMemberRelation5) {
        WebElement ExtMemberRelation5 = $(By.xpath(ExtendedMemberRelationXpath5));
        selectFromDropdown(ExtMemberRelation5, ExtendedMemberRelation5);

    }

    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation6(String ExtendedMemberRelation6) {
        WebElement ExtMemberRelation6 = $(By.xpath(ExtendedMemberRelationXpath6));
        selectFromDropdown(ExtMemberRelation6, ExtendedMemberRelation6);

    }

    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation7(String ExtendedMemberRelation7) {
        WebElement ExtMemberRelation7 = $(By.xpath(ExtendedMemberRelationXpath7));
        selectFromDropdown(ExtMemberRelation7, ExtendedMemberRelation7);

    }


    @Step("Select extended member relation")
    public void SelectExtendedMemberRelation8(String ExtendedMemberRelation8) {
        WebElement ExtMemberRelation8 = $(By.xpath(ExtendedMemberRelationXpath8));
        selectFromDropdown(ExtMemberRelation8, ExtendedMemberRelation8);

    }

    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB1(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath1)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }


    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB2(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath2)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }

    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB3(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath3)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }

    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB4(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath4)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }

    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB5(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath5)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }

    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB6(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath6)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }

    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB7(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath7)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }


    @Step("Enter date of birth for extended member")
    public void EnterExtendedMmemberDOB8(String Year, String Month, String day) {

        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

        $(By.xpath(ExtendedMemberDOBpath8)).click();
        WebElement YRR = $(By.xpath(CalenderYear));
        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }


    }


    @Step("Check checkbox to add a spouse ")
    public void addSpouse() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AdSpouseCHKBOX)));
        element.click();

        // $(By.xpath(ADDSpouseXpath)).click();

    }

    @Step("select spouse Title")
    public void selectTitle(String title) {
        WebElement STitle = $(By.xpath(TitleXpath));
        selectFromDropdown(STitle, title);


    }

    @Step("Enter spouse name")
    public void enterSpouseName(String spouse_Name) {
        $(By.xpath(Spouse_NameXpath)).sendKeys(spouse_Name);
        // //*[@id="onTtlSp"]/option[2]

    }

    @Step("Enter spouse surname")
    public void enterSpouseSurname(String surname) {
        $(By.xpath(Spouse_SurnameNameXpath)).sendKeys(surname);

    }

    @Step("Select spouse gender")
    public void selectSpouseGender(String Gender) {
        WebElement seleGend = $(By.xpath(Spouse_GenderXpath));
        selectFromDropdown(seleGend, Gender);



    }

    @Step(" Enter spouse ID number")

    public void EnterSpouseIDNo(String IdNum) {
        $(By.xpath(Spouse_IDXpath)).sendKeys(IdNum);
    }

    @Step("enter spouse date of birth")
    public void enterSpouseDateOfBirth(String Year, String Month, String day) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));


        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table";

//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Spouse_DoBXpathh)));
//        element.click();

        $(By.xpath(Spouse_DoBXpathh)).click();

//        WebElement YRR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CalenderYear)));


        WebElement YRR = $(By.xpath(CalenderYear));

//        WebElement months = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CalenderMonth)));

        WebElement months = $(By.xpath(CalenderMonth));


        //  enter the year eg 1990,1991,1992. etc
        selectFromDropdown(YRR, Year);
        // enter the month eg Jan,Feb,Mar,April,etc
        selectFromDropdown(months, Month);
        WebElement S = $(By.xpath(activedatesXpath));

        List<WebElement> activedates = S.findElements(By.tagName("td"));

        for (WebElement dates : activedates) {

            String date = dates.getText();
            if (date.equals(day)) {
                dates.click();
                break;
            }
        }

    }

    @Step("Save spouse details ")
    public void saveSpousedtls() {
        $(By.xpath(SaveBtnXpath)).click();

    }

    @Step("Delete created spouse details")
    public void DeleteSpouse() {
        Assert.assertTrue($(By.xpath(DeleteBtnXpath)).isDisplayed());
        $(By.xpath(DeleteBtnXpath)).click();

    }

    @Step(" Edit spouse details ")
    public void EditSpouseDetails() {
        $(By.xpath(EditBtnXpath)).click();


    }

    @Step("click on Continue to proceed to beneficiaries Details page")
    public void clickContinue() {

        boolean continuebtnClickable = $(By.xpath(ContinueBtnXpath)).isClickable();

        if (continuebtnClickable) {
            System.out.println("continue button is clickable and user can continue");
            $(By.xpath(ContinueBtnXpath)).click();

        } else {

            System.out.println("User cannot continue due to a error in one of the fields");

        }

    }

    @Step("Click back button to see member details page")

    public void clickBackBtn() {
        Assert.assertTrue($(By.xpath(ContinueBtnXpath)).isClickable());
        $(By.xpath(BackBtnXpath)).click();

    }

    @Step("Add a child name")
    public void EnterChild2Name(String Childname) {
        $(By.xpath(Child2Xpath)).sendKeys(Childname);
    }

    @Step("Add a child surname")
    public void EnterChild2Surname(String childSurname) {
        $(By.xpath(Child2SurnameNameXpath)).sendKeys(childSurname);

    }

    @Step("Select child gender")
    public void selectChild2Gender(String gender) {
        WebElement g = $(By.xpath(Child2GenderXpath));
        selectFromDropdown(g, gender);
    }

    @Step("Select if  the child  is a student or not ")
    public void IsChild2StudentOrNot(String isStudent_or_Not) {
        WebElement isStudent = $(By.xpath(Child2IsStudenteXpath));
        selectFromDropdown(isStudent, isStudent_or_Not);

    }

    @Step("Enter the child ID number")
    public void child2IDNUM(String childIDNo) {
        $(By.xpath(ChildID2numXpath)).sendKeys(childIDNo);

    }
    @Step("Add a child name")
    public void EnterChild3Name(String Childname) {
        $(By.xpath(Child3Xpath)).sendKeys(Childname);
    }

    @Step("Add a child surname")
    public void EnterChild3Surname(String childSurname) {
        $(By.xpath(Child3SurnameNameXpath)).sendKeys(childSurname);

    }

    @Step("Select child gender")
    public void selectChild3Gender(String gender) {
        WebElement g = $(By.xpath(Child3GenderXpath));
        selectFromDropdown(g, gender);
    }

    @Step("Select if  the child  is a student or not ")
    public void IsChild3StudentOrNot(String isStudent_or_Not) {
        WebElement isStudent = $(By.xpath(Child3IsStudenteXpath));
        selectFromDropdown(isStudent, isStudent_or_Not);

    }

    @Step("Enter the child ID number")
    public void child3IDNUM(String childIDNo) {

        $(By.xpath(ChildID3numXpath)).sendKeys(childIDNo);

    }


    @Step("Enter the child date of birth")
    public void childDateOfBirth(String year, String month, String day) {

        String calenderMonthXpath = "//select[@class=\"ui-datepicker-month\"]";
        String calenderYear = "//select[@class=\"ui-datepicker-year\"]";
        String dates = "//*[@id=\"ui-datepicker-div\"]/table";

        WebElement calenderMn = $(By.xpath(calenderMonthXpath));
        WebElement calendeYr = $(By.xpath(calenderYear));

        $(By.xpath(ChildDOBXpath)).click();
        selectFromDropdown(calendeYr, year);
        selectFromDropdown(calenderMn, month);

        WebElement dats = $(By.xpath(dates));
        List<WebElement> activedates = dats.findElements(By.tagName("td"));

        for (WebElement datess : activedates) {
            String date = datess.getText();
            if (date.equals(day)) {
                datess.click();
                break;
            }
        }
    }


    @Step("Add a child name")
    public void EnterChildName(String Childname) {
        $(By.xpath(ChildNameXpath)).sendKeys(Childname);
    }

    @Step("Add a child surname")
    public void EnterChildSurname(String childSurname) {
        $(By.xpath(ChildSurnameNameXpath)).sendKeys(childSurname);

    }

    @Step("Select child gender")
    public void selectChildGender(String gender) {
        WebElement g = $(By.xpath(ChildGenderXpath));
        selectFromDropdown(g, gender);
    }

    @Step("Select if  the child  is a student or not ")
    public void IsChildStudentOrNot(String isStudent_or_Not) {
        WebElement isStudent = $(By.xpath(ChildIsStudenteXpath));
        selectFromDropdown(isStudent, isStudent_or_Not);

    }

    @Step("Enter the child ID number")
    public void childIDNUM(String childIDNo) {

        $(By.xpath(ChildIDnumXpath)).sendKeys(childIDNo);

    }


    @Step("Enter the child date of birth")
    public void child3DateOfBirth(String year, String month, String day) {

        String calenderMonthXpath = "//select[@class=\"ui-datepicker-month\"]";
        String calenderYear = "//select[@class=\"ui-datepicker-year\"]";
        String dates = "//*[@id=\"ui-datepicker-div\"]/table";

        WebElement calenderMn = $(By.xpath(calenderMonthXpath));
        WebElement calendeYr = $(By.xpath(calenderYear));

        $(By.xpath(Child3DOBXpath)).click();
        selectFromDropdown(calendeYr, year);
        selectFromDropdown(calenderMn, month);

        WebElement dats = $(By.xpath(dates));
        List<WebElement> activedates = dats.findElements(By.tagName("td"));

        for (WebElement datess : activedates) {
            String date = datess.getText();
            if (date.equals(day)) {
                datess.click();
                break;
            }
        }

    }


    @Step("Enter the child date of birth")
    public void child2DateOfBirth(String year, String month, String day) {

        String calenderMonthXpath = "//select[@class=\"ui-datepicker-month\"]";
        String calenderYear = "//select[@class=\"ui-datepicker-year\"]";
        String dates = "//*[@id=\"ui-datepicker-div\"]/table";

        WebElement calenderMn = $(By.xpath(calenderMonthXpath));
        WebElement calendeYr = $(By.xpath(calenderYear));

        $(By.xpath(Child2DOBXpath)).click();
        selectFromDropdown(calendeYr, year);
        selectFromDropdown(calenderMn, month);

        WebElement dats = $(By.xpath(dates));
        List<WebElement> activedates = dats.findElements(By.tagName("td"));

        for (WebElement datess : activedates) {
            String date = datess.getText();
            if (date.equals(day)) {
                datess.click();
                break;
            }
        }

    }


    @Step("Click add another child button to add multiple children")
    public void addAnotherCh() {
        $(By.xpath(AddAnotherChild)).click();

    }

    @Step("Click save details button to save captured child details")
    public void SaveChildDetails() {
        $(By.xpath(ChildSaveDetails)).click();
    }

    @Step("Check the add child(ren) checkbox")
    public void addChildrencheckBox() {
        $(By.xpath(AddChildrenCheckBoxXpath)).click();
    }

    @Step("select add optional clientele blue rewards")
    public void SelectBlueRewards() {
        $(By.xpath(AddOptionalClienteleBlueRewardsXpath)).click();

    }

    @Step("select add optional silver rewards")
    public void SelectSilverRewards() {
        $(By.xpath(AddOptionalClienteleSilverRewardXpath)).click();
    }


    @Step(" verify that Main member can see the total premium amount")
    public String GetTotalPremium() {
        String TotalPremium = "";

        Assert.assertTrue($(By.xpath(TotalPremiumXpath)).isDisplayed());

        TotalPremium = $(By.xpath(TotalPremiumXpath)).getText();

        return TotalPremium;

    }

    @Step("Verify that page is additional members page")
    public void VerifyadditionalMembersPage() {
        String pageTitle = getTitle();
        String ExpectedTitle = "Online Sales";

        Assert.assertEquals(ExpectedTitle, pageTitle);
    }


    @Step("Click Save extended member details ")
    public void SaveExtendedMemberDetails() throws InterruptedException {

        Assert.assertTrue($(By.xpath(SaveExtendedMemberBtnXpath)).isClickable());
        $(By.xpath(SaveExtendedMemberBtnXpath)).click();
        Thread.sleep(4000);

    }

    @Step("Add another member ")
    public void AddAnotherExtendedMember() {

        Assert.assertTrue($(By.xpath(AddAnotherExtendedMmeberBtnXpath)).isClickable());
        $(By.xpath(AddAnotherExtendedMmeberBtnXpath)).click();

    }

    @Step("Remove created Extended member ")
    public void removeExtendedMember() {

        boolean RemoveExtendedMember = $(By.xpath(RemoveExtendedMmemberXpath)).isClickable();
        if (RemoveExtendedMember) {
            System.out.println("Button is available for selection and clickable ");
        }
        $(By.xpath(RemoveExtendedMmemberXpath)).click();

    }

    @Step("Select beneficiary Title")


    public void SelectBeneficiaryTite(String Title) {
        WebElement benefiTitle = $(By.xpath(TitleXpath));
        selectFromDropdown(benefiTitle, Title);
    }

    @Step(" Enter the name of the beneficiary")

    public void EnterBeneficiaryName(String name) throws InterruptedException {

        Thread.sleep(1000);
        $(By.xpath(BeneficiaryName1Xpath)).sendKeys(name);
    }

    @Step("Enter the surname of the beneficiary")
    public void EnterBeneficiarySurname(String Bsurname) {
        $(By.xpath(BeneficiarySurnameXpath)).sendKeys(Bsurname);
    }

    @Step("Enter the beneficiary ID number")
    public void EnterBenefiaryIDnum(String IDnum) {
        $(By.xpath(BeneficiaryIDnumberXpath)).sendKeys(IDnum);
    }

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




//    @Step(" Enter beneficiary date of birth")
//
//    public void EnterDateOfBirth(String day, String month, String year) {
//
//        String activedatesXpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody";
//
//        $(By.xpath(BeneficiaryDOBXpath)).click();
//        WebElement Year = $(By.xpath(YearXPATH2));
//        WebElement months = $(By.xpath(MonthXPATH2));
//
//
//        selectFromDropdown(Year, year);
//
//
//        // enter the month eg Jan,Feb,Mar,April,etc
//        selectFromDropdown(months, month);
//
//        WebElement dts = $(By.xpath(activedatesXpath));
//        List<WebElement> activedates = dts.findElements(By.tagName("td"));
//
//        for (WebElement dates : activedates) {
//            String date = dates.getText();
//            if (date.equals(day)) {
//                dates.click();
//                break;
//            }
//        }
//    }



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

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
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






