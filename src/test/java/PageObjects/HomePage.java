package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    //Funeral Plan WebElements
    WebElement FuneralBuyNow = $(By.xpath("\"//a[@class=\"btn funeral\"]"));
    WebElement GetQuoteFuneral = $(By.xpath("//a[@class=\"btn funeral call-me-quote cboxElement\"]"));

    // Legal Plan WebElements

    WebElement LegalBuyNow = $(By.xpath("//a[@class=\"btn legal\"]"));
    WebElement LegalGetQuote = $(By.xpath("//a[@class=\"btn legal call-me-quote cboxElement\"]"));

    // Hospital Plans WebElements
    WebElement HospitalPlanBuyNow = $(By.xpath("//a[@class=\"btn hospital\"]"));
    WebElement HospitalPlanGetQuote = $(By.xpath("//a[@class=\"btn hospital call-me-quote cboxElement\"]"));


    @Step("Click Buy Now on Funeral Plan")
    public void ClickBuyNowFuneralPlans(){

        FuneralBuyNow.click();


    }


    @Step("Click Get a Quote on Funeral Plan")
    public void GetAQuoteFuneralPlans(){
    GetQuoteFuneral.click();

    }
    @Step("Click Buy Now on legal Plan")
    public void ClickBuyNowLegalPlans(){
        LegalBuyNow.click();

    }

    @Step("Click Get Quote on legal Plan")
    public void ClickGetQuoteLegalPlans(){
        LegalGetQuote.click();

    }

    @Step("Click Buy Now on Hospital Plan")
    public void ClickBuyNowHospitalPlans(){
    HospitalPlanBuyNow.click();

    }
    @Step("Click Get quote on Hospital Plan")
    public void ClickGetAQuoteFuneralPlans(){
        HospitalPlanGetQuote.click();

    }

    @Step("Click Buy Now on Clientele Perks")
    public void ClickBuyNowClientele(){


    }


}
