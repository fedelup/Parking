package basic.Pojo;

import java.io.Serializable;
/**
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
public class Demo implements Serializable {
	private String lat;
	private String lng;
	private String searchPlace;
	
	/**
	 * 
	 * @return
	 */
	public String getSearchPlace() {
		return searchPlace;
	}
	/**
	 * 
	 * @param searchPlace
	 */
	public void setSearchPlace(String searchPlace) {
		this.searchPlace = searchPlace;
	}
	/**
	 * 
	 * @return
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * 
	 * @param lat
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * 
	 * @return
	 */
	public String getLng() {
		return lng;
	}
	/**
	 * 
	 * @param lng
	 */
	public void setLng(String lng) {
		this.lng = lng;
	}
}
