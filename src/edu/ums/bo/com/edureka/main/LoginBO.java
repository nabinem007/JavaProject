package edu.ums.bo.com.edureka.main;

public class LoginBO {

    // variable
    private boolean result;

    // validate user method
    public boolean validateUser(String userName, String password){
        // validation logic
        if (userName.equals("dani")&& password.equals("dani123")){
            // set result
            result = true;
        }


    return result;
    }
}
