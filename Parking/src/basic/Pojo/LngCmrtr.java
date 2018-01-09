package basic.Pojo;

import java.util.Comparator;
/**
 * 
 * @author user
 *
 */
public class LngCmrtr implements Comparator<Parking> {

	@Override
	/**
	 * 
	 * @param p1
	 * @param p2
	 * @return
	 */
	public int compare(Parking p1, Parking p2) {
		int i=0;
		if(p1.getLongitude()>p2.getLongitude()){
			i=1;			
		} else if (p1.getLongitude()<p2.getLongitude()) {
			i=-1;			
		} else {
			i=0;			
		}
		return i;
	}

}
