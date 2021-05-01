package ru.netology.page;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class DashBoardPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");

    public DashBoardPage() {
        heading.shouldBe(visible);
    }

    public void personalArea() {
        $(withText("Личный кабинет")).shouldBe(Condition.visible);
    }
}