package com.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.utest.ui.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ResultQuestions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor){
        if(actor.recall("validation").equals("correct")){
            actor.attemptsTo(
                    WaitUntil.the(CORRECT,isVisible()).forNoMoreThan(30).seconds()
            );
        } else if (actor.recall("validation").equals("badname")) {
            actor.attemptsTo(
                    WaitUntil.the(BADNAME,isVisible()).forNoMoreThan(30).seconds()
            );
        }
        else if (actor.recall("validation").equals("badpass")){
            actor.attemptsTo(
                    WaitUntil.the(BADPASS,isVisible()).forNoMoreThan(30).seconds()
            );
        }
        return true;
    }
    public static ResultQuestions succesRegister(){
        return new ResultQuestions();
    }
}
