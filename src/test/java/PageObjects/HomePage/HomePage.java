package PageObjects.HomePage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

public class HomePage extends PageObject {

    //Funeral Plan WebElements
    String FuneralBuyNowXpath = "//a[@class=\"btn funeral\"]";
    String GetQuoteFuneralXpath = "//a[@class=\"btn funeral call-me-quote cboxElement\"]";

    // Legal Plan WebElements

    String LegalBuyNowXpath = "//a[@class=\"btn legal\"]";
    String LegalGetQuoteXpath = "//a[@class=\"btn legal call-me-quote cboxElement\"]";

    // Hospital Plans WebElements
    String HospitalPlanBuyNowXpath = "//a[@class=\"btn hospital\"]";
    String HospitalPlanGetQuoteXpath = "//a[@class=\"btn hospital call-me-quote cboxElement\"]";

    String ContinueBtnXpath = "//*[@id=\"onlinego\"]";



    String URL ="https://portals.freshive.co.za/clienteleonlinesales/";


    public String OpenWebsite(){

        getDriver().get(URL);

        return getDriver().getWindowHandle();


    }

    @Step("Click Buy Now on Funeral Plan")
    public void ClickBuyNowFuneralPlans(){

        $(By.xpath(FuneralBuyNowXpath)).click();


    }

    @Step("Click the continue button")
    public void clickContinueBtn(){
        $(By.xpath(ContinueBtnXpath)).click();

    }
    @Step("Click Get a Quote on Funeral Plan")
    public void GetAQuoteFuneralPlans(){
        $(By.xpath(GetQuoteFuneralXpath)).click();

    }
    @Step("Click Buy Now on legal Plan")
    public void ClickBuyNowLegalPlans(){
        $(By.xpath(LegalBuyNowXpath)).click();

    }

    @Step("Click Get Quote on legal Plan")
    public void ClickGetQuoteLegalPlans(){
        $(By.xpath(LegalGetQuoteXpath)).click();

    }

    @Step("Click Buy Now on Hospital Plan")
    public void ClickBuyNowHospitalPlans(){
    $(By.xpath(HospitalPlanBuyNowXpath)).click();

    }
    @Step("Click Get quote on Hospital Plan")
    public void ClickGetAQuoteFuneralPlans(){
        $(By.xpath(HospitalPlanGetQuoteXpath)).click();

    }

    @Step("Click Buy Now on Clientele Perks")
    public void ClickBuyNowClientele(){


    }


}
