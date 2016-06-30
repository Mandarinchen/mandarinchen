
package at.fhj.itm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Point2dTest {
	Point2d  pt1;
	Point2d  pt2;
	/**
	 * Set some Point2d for testing their functionality
	 */

	@Before
	public void setup(){
		pt1= new Point2d(2.5, 5.5);
		pt2= new Point2d(2.5, 2.0);


	}
	/**
	 * Test the Setter of the x-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of x
	 * @param d 
	 * @return 
	 * @return 
	 */
	@Test
	public void testSetX(){
		pt1.setX(2.5);

		double x=pt1.getX();

		assertEquals(2.5, x, 0.0000001);
	}

	/**
	 * Test the Setter of the y-coordinate
	 * - set the coordinate
	 * - get the value from the object
	 * - try to compare your value with the return value of y
	 */
	@Test
	public void testSetY(){
		pt1.setY(5.5);

		double y=pt1.getY();

		assertEquals(5.5, y, 0.0000001);
	}


	/**
	 * Test the distanceFrom() Method
	 * - call the method distanceFrom and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFrom()
	 */
	@Test
	public void testDistanceFrom(){


		double a=pt1.distanceFrom(pt2);
		assertEquals(3.5, a, 0.00000001);
	}

	/**
	 * Test the distanceFromOrigin() Method
	 * - call the method distanceFromOrigin and calculate the distance
	 * - calculate the distance by your own implementation
	 * - try to compare your result with the return value of distanceFromOrigin()
	 */

	@Test
	public void testDistanceFromOrigin(){
		double c=pt1.distanceFromOrigin();
		assertEquals(6.041522986797286, c, 0.00000000000001);
	}
}

