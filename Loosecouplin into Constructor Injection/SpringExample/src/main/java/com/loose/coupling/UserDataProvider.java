package com.loose.coupling;

public class UserDataProvider {

    private String WebServiceDataProvider;
    private String UserDatabaseProvider;
    private String NewDatabaseProvider;

    public String getWebServiceDataProvider() {
        return WebServiceDataProvider;
    }

    public void setWebServiceDataProvider(String webServiceDataProvider) {
        WebServiceDataProvider = webServiceDataProvider;
    }

    public String getUserDatabaseProvider() {
        return UserDatabaseProvider;
    }

    public void setUserDatabaseProvider(String userDatabaseProvider) {
        UserDatabaseProvider = userDatabaseProvider;
    }

    public String getNewDatabaseProvider() {
        return NewDatabaseProvider;
    }

    public void setNewDatabaseProvider(String newDatabaseProvider) {
        NewDatabaseProvider = newDatabaseProvider;
    }

    @Override
    public String toString() {
        return "UserDataProvider{" +
                "WebServiceDataProvider='" + WebServiceDataProvider + '\'' +
                ", UserDatabaseProvider='" + UserDatabaseProvider + '\'' +
                ", NewDatabaseProvider='" + NewDatabaseProvider + '\'' +
                '}';
    }
}
