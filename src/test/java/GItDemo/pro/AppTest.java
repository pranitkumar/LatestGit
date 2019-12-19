package GItDemo.pro;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
    
{
	
	public static void main(String[] args) {
		
		System.out.println("by x ");
		
		System.out.println("App 1");
		
		System.out.println("App 2");
		
	}
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    	System.out.println("App 3");
    	
    	System.out.println("App 4");
    	
       //s super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
