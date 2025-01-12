package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {

//initialised object of the Interface and
// Assigned to UserDatabaseProvider class
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider WebServiceProvider =new  WebServiceDataProvider();
        UserManager userManagerWithWS= new UserManager(WebServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider NewDatabaseprovider= new NewDatabaseProvider();
        UserManager userManagerwithNewDB= new UserManager(NewDatabaseprovider);
        System.out.println(userManagerwithNewDB.getUserInfo());

    }
}
