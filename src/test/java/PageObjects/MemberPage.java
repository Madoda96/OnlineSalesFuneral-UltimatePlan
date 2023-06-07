package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MemberPage extends PageObject {


    //member page webElements

    WebElement EnterEmail = $(By.xpath("//input[@id=\"introEmail\"]")); // element will be used when intro email is required

//     WebElement selectTitle = $(By.xpath("//select[@id=\"onTtl\"]"));

    WebElement Name = $(By.xpath("//input[@name=\"onName\"]"));

    WebElement Surname = $(By.xpath("//input[@name=\"onSurname\"]"));

    WebElement IDnum = $(By.xpath("//input[@name=\"onID\"]"));

    WebElement MobileNu = $(By.xpath("//input[@name=\"onMobile\"]"));


    WebElement PostalAddress = $(By.xpath("//input[@name=\"onAddress1\"]"));
    WebElement MonthlIncome = $(By.xpath("//select[@name=\"onIncome\" ]"));
    WebElement Occupation = $(By.xpath("//select[@name=\"onOccupation\" ]"));
    WebElement education  = $(By.xpath("//select[@name=\"onEducation\"]"));
    WebElement FicDecl01 = $(By.xpath("//select[@name=\"fica01\" ]"));
    WebElement FicDecl02 = $(By.xpath("//select[@name=\"fica02\" ]"));

@Step("Select Title")
public void SelectTitle (String Title){
    Select select = $(By.xpath("//select[@id=\"onTtl\"]"));
    select.selectByVisibleText(Title);

}




}
