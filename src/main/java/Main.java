import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import javax.xml.bind.Element;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.String.format;
import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class Main {

    private By typeMyOzon = xpath(".//*[@data-test-id=\"header-my-ozon-user\"]");
    private By typeLogin = xpath(".//*[@data-test-id=\"header-my-ozon-login\"]");
    private By typeMail = xpath(".//*[@data-test-id=\"goToEmailLink\"]");
    private By typeMailName = xpath(".//*[@data-test-id=\"emailField\"]");
    private By typeMailPassword = xpath(".//*[@data-test-id=\"passwordField\"]");
    private By typeMailButton = xpath(".//*[@data-test-id=\"loginFormSubmitButton\"]");
    private By selectSortDown = xpath(".//*[@data-test-id=\"select-item-value-SORT_TYPE_PRICE_ASC\"]");

    private By typeSortUp = xpath(".//*[@data-test-id=\"select-item-value-SORT_TYPE_PRICE_ASC\"]");
    private By selectSort = By.xpath(".//*[@data-test-id=\"search-sortings\"]");



    public Main open() {
        Selenide.open("https://ozon.ru");
        return this;
    }

    public void getTypeLogin() {
        $(typeMyOzon).click();
        $(typeLogin).click();
        $(typeMail).click();
        $(typeMailName).val("test1storiqa@gmail.com");
        $(typeMailPassword).val("q1w2e3r4t5");
        $(typeMailButton).click();

    }

    public SelenideElement getNameInLK(){

        return $(xpath(format(".//*[contains(text(),'Денис')]")));
    }

    public SelenideElement setSortDown(){

        return $(xpath(format(".//*[contains(text(),'Сначала дешевые')]")));
    }

    public void  clickSort(){
        /*$(selectSort).click();
        $(selectSortDown).click();*/
        $(By.xpath(".//*[@id='__layout']/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/div/select")).selectOption("Сначала дешевые");

    }



      private By price =  By.xpath(".//span[@data-test-id=\"tile-price\" and string-length(text())>0]");
    public ElementsCollection getSort() {
        return $$(price);
    }

    public String getSortUP(int number){
        return getSort().get(number-1).text();
    }

}
