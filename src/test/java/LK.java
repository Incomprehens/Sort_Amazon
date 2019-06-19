import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LK {


    Main main= new Main();


    
   /* @BeforeAll
            public static void typeStartTest()
    {
        System.out.println("Start Test");
    }

    @AfterAll
            public static void typeFinishTest()
    {
        System.out.println("Finish Test");
    }*/

    @Test
            public void start()
    {
       main.open()
             .getTypeLogin();
       main.getNameInLK().shouldBe(visible);




       Configuration.holdBrowserOpen = true;

    }

}
