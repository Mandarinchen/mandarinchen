package at.fhj.itm;

/**
 * 
 * @author Marina
 *
 */

class Point2d {
	private double x, y;
	private boolean debug;

	/**
	 * 
	 * @param px
	 * @param py
	 */
	
	public Point2d (double px, double py)
	{
		x=px;
		y=py;
	}

	
	public Point2d () 
	{		
		x=0;
		y=0;
	}

	/**
	 * 
	 * @param pt
	 */
	public Point2d (Point2d pt) 
	{	
	x=pt.getX();
	y=pt.getY();
	}

	/**
	 * 
	 * @param s
	 */
	
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	public void setDebug (boolean b) {
		debug=b;
	}

	public void setX(double px) {
		this.x = px;
	}

	public double getX() {
		return x;
	}

	public void setY(double py)  {
		this.y = py;
	}

	public double getY() {
		return y;
	}

	public void setXY(double px, double py) {
	}

	
	/**
	 * 
	 * @param pt
	 * @return distance from point 2 to point 1
	 */
	
	public double distanceFrom (Point2d pt) {
		return Math.sqrt((Math.pow(pt.getX()-x, 2))+ (Math.pow(pt.getY()-y, 2)));
	}

	
	/**
	 * 
	 * @return distance from point 1 to startpoint 0/0
	 */
	
	public double distanceFromOrigin () {
		return Math.sqrt((Math.pow(x, 2))+ (Math.pow(y, 2)));
	}
	
	public String toString() {
		return "(" + x + "/" + y + ")";
	}


	public double distCommandLine(String[] args) throws NumberFormatException, IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}
}