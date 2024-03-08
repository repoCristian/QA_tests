package com.utest.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {
    public static final Target ENTER_USER_VALUE = Target.the("enter username").locatedBy("[id=\"username\"]");

    public static final Target ENTER_PASSWORD = Target.the("enter entervalue").locatedBy("[id=\"password\"]");

    public static final Target btn_submit = Target.the("boton submit").locatedBy("[id=\"submit\"]");

    public static final Target CORRECT = Target.the("text").locatedBy("//h1[text()='Logged In Successfully']");

    public static final Target BADNAME = Target.the("badName").locatedBy("//div[@id=\"error\"]");

    public static final Target BADPASS = Target.the("badPassword").locatedBy("[id=\"error\"]");

}
