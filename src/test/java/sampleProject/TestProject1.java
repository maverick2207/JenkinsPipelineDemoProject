package sampleProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProject1 {

    @Test(priority=1)
    public void test_login() {

        System.out.println("Login Test Passed ...");
        Assert.assertTrue(true);
    }

    @Test(priority=2)
    public void test_something() {

        System.out.println("Testing Passed ...");
        Assert.assertTrue(true);
    }
    @Test(priority=3)
    public void test_logout() {

        System.out.println("Logout Test Passed ...");
        Assert.assertTrue(true);
    }
}
