import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Main {

    private By typeMyOzon = By.xpath(".//*[@data-test-id=\"header-my-ozon-user\"]");
    private By typeLogin = By.xpath(".//*[@data-test-id=\"header-my-ozon-login\"]");
    private By typeMail = By.xpath(".//*[@data-test-id=\"goToEmailLink\"]");
    private By typeMailName = By.xpath(".//*[@data-test-id=\"emailField\"]");
    private By typeMailPassword = By.xpath(".//*[@data-test-id=\"passwordField\"]");
    private By typeMailButton = By.xpath(".//*[@data-test-id=\"loginFormSubmitButton\"]");


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
}
