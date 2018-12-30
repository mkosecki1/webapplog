package appLayer;

import dataLayer.DBUser;

public class User {
    public boolean isValidUserCredential(String sUserName, String sUserPassword){
        DBUser dbUserObject = new DBUser();
        return dbUserObject.isValidUserLogin(sUserName,sUserPassword);
    }
}