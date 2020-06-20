package com.omaressam.checkauthdata;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertSame;

public class CheckAuthDataTest {
    CheckAuthData checkAuthData;
    @Before
    public void setUp() throws Exception {
        checkAuthData = new CheckAuthData();
        System.out.println("Beigning of testing");
    }



    @Test
    public void usernameTest() {
        //UsernameEmpty method
        Boolean emptyInput = checkAuthData.usernameIsEmpty("");
        Boolean rightInput = checkAuthData.usernameIsEmpty("omarreess");
         assertSame(emptyInput,true);

         assertSame(rightInput,false);

    }



    @Test
    public void anyFieldTest() {



         Boolean emptyInput = checkAuthData.anyFieldIsEmpty(" ");
        Boolean rightInput = checkAuthData.anyFieldIsEmpty("omarreess");


        assertSame(emptyInput,true);

        assertSame(rightInput,false);





    }
    @Test
    public void passwordTest() {
        //PasswordEmpty method
        Boolean emptyInput = checkAuthData.PasswordIsEmpty(" ");
        Boolean rightInput = checkAuthData.PasswordIsEmpty("omarreess");


        //PasswordIsLess method
        Boolean wrongMatchDigits = checkAuthData.passwordIsLessThanDigits("123",7);
        Boolean rightMatchDigits = checkAuthData.passwordIsLessThanDigits("1234567",7);



        assertSame(emptyInput,true);
        assertSame(rightInput,false);
        assertSame(wrongMatchDigits,true);

        assertSame(rightMatchDigits,false);
        }

    @After
    public void tearDown() throws Exception {
        System.out.println("End of  testing");
    }
}
