package appLayer;

public class User {
    public boolean isValidUserCredential(String sUserName, String sUserPassword){
        if (sUserName.equals("maciek") && sUserPassword.equals("maciek123")){
            return true;
        }
        return false;
    }
}