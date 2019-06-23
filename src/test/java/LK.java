import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import sun.text.normalizer.Replaceable;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Screenshots.takeScreenShot;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LK {


    Main main = new Main();


    
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
    public void LK() {
        main.open()
                .getTypeLogin();
        main.getNameInLK().shouldBe(visible);



        Configuration.holdBrowserOpen = true;

    }

    @Test
    public void SortDown1() {
        open("https://www.ozon.ru/category/telefony-i-smart-chasy-15501/");

        main.clickSort();
       // main.setSortDown().shouldBe(visible).click();


        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void SortUP()    {
        open("https://www.ozon.ru/category/telefony-i-smart-chasy-15501/?sorting=price");

        /*for (int i=0; i<20; i++)
        {
            int q1 = toString().substring(0, toString().indexOf(''));

            System.out.println(q1);
        }*/
        for (int i=1; i<=20; i++) {

            System.out.println(main.getSortUP(i));
            String str = main.getSortUP(i);
            str = str.substring(0, str.length() - 2);
            int per1 = Integer.parseInt(str);
            System.out.println("perl" + "=" + per1);

            String str1 = main.getSortUP(i+1);
            str1 = str1.substring(0, str1.length() - 2);
            int per11 = Integer.parseInt(str1);

            if (per1>per11) { System.out.println("все работает-"+per1+"<="+per11);}
            else System.out.println("кароу все сломалось");
        }

    }





}
