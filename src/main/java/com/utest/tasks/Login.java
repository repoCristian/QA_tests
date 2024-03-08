package com.utest.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static com.utest.ui.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    private DataTable data;


    public Login(DataTable data){
        this.data=data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String,String>> values = data.asMaps(String.class,String.class);


        actor.attemptsTo(
                WaitUntil.the(ENTER_USER_VALUE,isVisible()).forNoMoreThan(50).seconds(),
               Enter.theValue(values.get(0).get("Username")).into(ENTER_USER_VALUE),
               Enter.theValue(values.get(0).get("Password")).into(ENTER_PASSWORD),
                Click.on(btn_submit)

        /*Click.on(Go_Home),
                Click.on(btn_a_product.of(String.valueOf(values.get(0).get("namesecondproduct")))),
                Enter.theValue(values.get(0).get("numberofsecondproduct")).into(number_of_product),
                Click.on(btn_submit),
                Click.on(Go_Home)
                */
        );
        actor.remember("name",values.get(0).get("Username"));
        actor.remember("validation",values.get(0).get("Validation"));

    }

    public static Login Form(DataTable data){
        return Tasks.instrumented(Login.class,data);
    }
}
