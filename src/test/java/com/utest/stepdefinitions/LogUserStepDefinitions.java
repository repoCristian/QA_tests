package com.utest.stepdefinitions;


import com.utest.tasks.GoTo;
import com.utest.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogUserStepDefinitions {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("that {} has opened website")
    public void  givenThatUserHasOpenedWebsite(String actorName){

        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }

    @When("he want login")
    public void whenHeWantLogin(DataTable data){
        theActorInTheSpotlight().attemptsTo(Login.Form(data));
    }

}
