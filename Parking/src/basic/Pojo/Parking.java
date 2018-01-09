package basic.Pojo;

import java.io.Serializable;
/**
 * 
 * @author user
 *
 */
public class Parking implements Cloneable {

	private int id;
	private int userId;
	private int pincode;
	private float latitude;
	private float longitude;
	private String area;
	private String city;
	private String state;
	private String country;
	private String image;
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @return
	 */
	public int getPincode() {
		return pincode;
	}
	/**
	 * 
	 * @param pincode
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	/**
	 * 
	 * @return
	 */
	public float getLatitude() {
		return latitude;
	}
	/**
	 * 
	 * @param latitude
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	/**
	 * 
	 * @return
	 */
	public float getLongitude() {
		return longitude;
	}
	/**
	 * 
	 * @param longitude
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	/**
	 * 
	 * @return
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * 
	 * @param userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * 
	 * @return
	 */
	public String getArea() {
		return area;
	}
	/**
	 * 
	 * @param area
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * 
	 * @return
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 
	 * @return
	 */
	public String getState() {
		return state;
	}
	/**
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 
	 * @return
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 
	 * @return
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 
	 * @param image
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * 
	 */
	public Parking() {
		super();
		this.id = 0;
		this.userId = 0;
		this.area = null;
		this.city = null;
		this.state = null;
		this.country = null;
		this.pincode = 0;
		this.latitude = 0.0f;
		this.longitude = 0.0f;
		this.image = null;
		this.unique = id;
		this.usernq = userId;
	}
	/**
	 * 
	 * @param id
	 * @param userId
	 * @param pincode
	 * @param latitude
	 * @param longitude
	 * @param area
	 * @param city
	 * @param state
	 * @param country
	 * @param image
	 */
	public Parking(int id, int userId, int pincode, float latitude, float longitude, String area, String city,
			String state, String country, String image) {
		super();
		this.id = id;
		this.userId = userId;
		this.pincode = pincode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.image = image;
		this.unique =id;
		this.usernq = userId;
	}
	@Override
	public String toString() {
		return "Parking [id=" + id + ", userId=" + userId + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", pincode=" + pincode + ", latitude=" + latitude + ", longitude="
				+ longitude + ", image=" + image  + "]";
	}

	/**
	 * 
	 */
	public final Parking clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + getId();
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + Float.floatToIntBits(latitude);
		result = prime * result + Float.floatToIntBits(longitude);
		result = prime * result + pincode;
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj){
			return true;}
		if (obj == null){
			return false;}
		if (getClass() != obj.getClass()){
			return false;}
		Parking other = (Parking) obj;
		if (area == null) {
			if (other.area != null){
				return false;}
			}
		
		if (unique != other.unique){
			return false;}
		if (usernq != other.usernq){
			return false;}
		return true;
	}
	
	
	
}