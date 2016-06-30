package at.fhj.itm;

/**
 * Interface for an simple integer calcuator which supports the four basic operations
 * @author Marina Laibacher
 *
 */
public interface iPoint2d {
	public void setX(double px);
	public void setY(double py);
	public double distanceFrom(Point2d pt);
}