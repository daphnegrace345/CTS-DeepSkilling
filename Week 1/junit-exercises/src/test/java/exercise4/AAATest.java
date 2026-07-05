package exercise4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AAATest {

    private int num1;
    private int num2;

    @BeforeEach
    public void setUp() {
        System.out.println("Setup Method Executed");
        num1 = 10;
        num2 = 20;
    }

    @Test
    public void testAddition() {

        // Arrange
        int expected = 30;

        // Act
        int result = num1 + num2;

        // Assert
        assertEquals(expected, result);

        System.out.println("AAA Test Passed Successfully");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Teardown Method Executed");
    }
}