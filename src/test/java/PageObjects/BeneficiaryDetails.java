package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BeneficiaryDetails extends PageObject {

    String TitleXpath = "//select[@name=\"onTtlB\"]";
    String BeneficiaryNameXpath = "//input[@id=\"onNameB1\"]";
    String BeneficiarySurnameXpath = "//input[@id=\"onSurnameB1\"]";
    String BeneficiaryIDnumberXpath = "id=\"onIdB1\"";
    String BeneficiaryDOBXpath = "//input[@id=\"onDobB1\" ]";
    String BeneficiaryRelationshipXpath = "//select[@id=\"onRelationB1\"]";
    String AllocatedPercentageXpath = "//span[@id=\"dispAmount\"]";


    @Step("Select beneficiary Title")
    public void SelectBeneficiaryTite(String Title  ){
        WebElement benefiTitle = $(By.xpath(TitleXpath));
        selectFromDropdown(benefiTitle, Title);


 //        Select select = $(By.xpath(TitleXpath));
//        select.selectByValue(Title);


    }
    @Step(" Enter the name of the beneficiary")
    public void EnterBeneficiaryName(String name){
        $(By.xpath(BeneficiaryNameXpath)).sendKeys(name);
    }

    @Step("Enter the surname of the beneficiary")
    public void EnterBeneficiarySurname(String Bsurname){
        $(By.xpath(BeneficiarySurnameXpath)).sendKeys(Bsurname);
    }

    @Step("Enter the beneficiary ID number")
    public void EnterBenefiaryIDnum(String IDnum ){
        $(By.xpath(BeneficiaryIDnumberXpath)).sendKeys(IDnum);
    }

    @Step()
    public void (){}

    @Step("Select ")
    public void (){}

    @Step()
    public void (){}






}
