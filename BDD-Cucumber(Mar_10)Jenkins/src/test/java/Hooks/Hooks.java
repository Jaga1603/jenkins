package Hooks;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        BaseTest.initialize();
    }

    @After
    public void tearDown() {
        BaseTest.quit();
    }
}
