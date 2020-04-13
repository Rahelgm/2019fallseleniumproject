package com.cybertek.tests.Day17_ddt_dataprovider_pom2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserInfoDataDrivenTest {
    @Test(dataProvider = "users")
    public void test(String username,String password, int number){
        System.out.println("opening application");
        System.out.println("login as: " + username);
        System.out.println("number is: " + number);
        System.out.println("verify info");
    }
    @DataProvider(name = "users")
    public Object[][] getUsers(){
        return new Object[][]
                {
                        {"user1", "UserUsers123",25,},
                        {"salesmanager355", "userUser123", 26},
                        {"storemanager123", "useruser123", 27},
                        {"salesmanager4000", "UserUser123", 262},
                };
    }
}
