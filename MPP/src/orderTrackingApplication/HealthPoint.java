/**
 * 
 */
package orderTrackingApplication;

/**
 * @author haftomtesfay
 *
 */
public class HealthPoint extends Acomponent{

	private double points;

	public HealthPoint(double point) {

		this.points = point;
	}

	@Override
	public double getPoints() {
		// TODO Auto-generated method stub
		return points;
	}
}