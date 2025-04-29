package sampleProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class setup {

    @BeforeTest
    public void invokeTest(){
        System.out.println("Test Case Execution Begins ...");
    }


    @AfterTest
    public void tearDown(){
        System.out.println("Test Case Execution Completed ...");
    }
}
