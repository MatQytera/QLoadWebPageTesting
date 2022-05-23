package de.qytera.webpage;

import de.qytera.qtaf.testng.QtafTestNGRunner;
import de.qytera.qtaf.testng.event_listener.TestNGEventListener;
import de.qytera.qtaf.testng.test_factory.TestNGFactory;
import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.Collections;

/**
 * Main runner class that runs the test classes.
 * This class inherits from QtafTestNGRunner which provides a main function that can be executed.
 */



public class TestRunner extends QtafTestNGRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRunner.class);

}
