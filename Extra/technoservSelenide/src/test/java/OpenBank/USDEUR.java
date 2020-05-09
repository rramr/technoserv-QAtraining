package OpenBank;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.*;

public class USDEUR {

    @Test
    public void USDEURmeth() throws ParseException {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        baseUrl = "https://www.google.com/";
        startMaximized = true;
        open("/");
        $(By.name("q")).val("Открытие").pressEnter();
        $$(By.tagName("cite")).findBy(exactText("www.open.ru")).click();

        Object[] usd_eur = $$(By.className("main-page-exchange__rate")).texts().toArray();

        Float usd_bid = format.parse(usd_eur[0].toString()).floatValue();
        Float usd_ask = format.parse(usd_eur[1].toString()).floatValue();
        Float eur_bid = format.parse(usd_eur[2].toString()).floatValue();
        Float eur_ask = format.parse(usd_eur[3].toString()).floatValue();

        if (usd_ask > usd_bid && eur_ask > eur_bid){
            System.out.println("Курс продажи USD больше, чем курс покупки (" + usd_ask + " > " + usd_bid + ")");
            System.out.println("Курс продажи EUR больше, чем курс покупки (" + eur_ask + " > " + eur_bid + ")");
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }
    }
}