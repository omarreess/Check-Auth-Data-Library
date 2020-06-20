package com.omaressam.checkauthdata;

import android.text.TextUtils;

public class CheckAuthData {
    public Boolean usernameIsEmpty(String username)
    { String username2 = username.trim();
        if (TextUtils.isEmpty(username2) || username2==null) {
            return true;}
        else {return false;}

    }


    public Boolean  PasswordIsEmpty(String password)
    {
        if (TextUtils.isEmpty(password)) {
            return true;}
        else return false;

    }


    public Boolean anyFieldIsEmpty(String input)
    {
        if (TextUtils.isEmpty(input)) {
            return true;}
        else return false;
    }


    public Boolean passwordIsLessThanDigits(String password , int TargetDigits)
    {
        if (password.length() < TargetDigits) {
            return true;
        }
        else return false;
    }
}
