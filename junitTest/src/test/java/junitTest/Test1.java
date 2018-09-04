/**
 * 
 */
package junitTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author sam
 */
public class Test1 {
    
    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link junitTest.App1#logic1(int, int)}.
     */
    @Test
    public void testLogic1() {
	App1 app = new App1();
	assertArrayEquals("logic1 is incorrect", new int[]{3}, new int[]{app.logic1(1, 2)});
    }

    /**
     * Test method for {@link junitTest.App1#logic2(int[])}.
     */
    @Test
    @DisplayName("Dynamic int test")
    public void testLogic2() {
	App1 app = new App1();
	assertArrayEquals("logic2 is incorrect", new int[]{6}, new int[]{app.logic2(1, 2, 3)});
    }

    /**
     * Test method for {@link junitTest.App1#logic3(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testLogic3() {
	App1 app = new App1();
	assertArrayEquals("logic3 is incorrect", new int[]{3}, new int[]{app.logic3("1", "2")});
    }

    /**
     * Test method for {@link junitTest.App1#logic4(int, int)}.
     */
    @Test
    @DisplayName("testLogic4, intended error")
    public void testLogic4() {
	App1 app = new App1();
	// failure
	assertArrayEquals("logic4 is incorrect", new int[]{2}, new int[]{app.logic4(1, 3)});
    }
    
    @Test
    public void testExceptionIsThrown() {
	App1 app = new App1();
	app.logic3("a", "b");
    }
    
    @Test
    public void myFirstTest() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void assertAllTest(){
    }
}
