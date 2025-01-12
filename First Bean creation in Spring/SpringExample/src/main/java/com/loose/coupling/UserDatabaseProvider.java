package com.loose.coupling;
// A- MySQL , Post Grey SQL
//B-web Services , Mongodb

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
            //Directly acces database here
        return "User details from database";
    }
}
