

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class OrganiserTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class OrganiserTest
{
    private Organiser organise1;

    /**
     * Default constructor for test class OrganiserTest
     */
    public OrganiserTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        organise1 = new Organiser();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSubmitBids()
    {
        assertEquals(true, organise1.submitBids());
    }
}

