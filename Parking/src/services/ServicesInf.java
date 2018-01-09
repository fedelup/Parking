package services;

import java.io.Serializable;
import java.util.List;
import basic.Pojo.Parking;
import basic.Pojo.Users;
/**
 * 
 * @author user
 *
 */
public interface ServicesInf {

	/**
	 * 
	 * @return
	 */
	public List<Parking> getParkings();
	/**
	 * 
	 * @param u1
	 * @return
	 */
	public int insertUser(Users u1);
	/**
	 * 
	 * @param p1
	 * @return
	 */
	public Parking inserPark(Parking p1);
	/**
	 * 
	 * @param uid
	 * @param path
	 * @return
	 */
	public int insertImage(int uid, String path);
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Users getUser(String username, String password);
	/**
	 * 
	 * @return
	 */
	public List<Users> spaceOwners();
	/**
	 * 
	 * @param uid
	 * @return
	 */
	public List<Parking> showParkings(int uid);
	/**
	 * 
	 * @param u
	 * @return
	 */
	public boolean saveUser(Users u);
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public Users validateUser(String username, String password);
	/**
	 * 
	 * @param p
	 * @return
	 */
	public Serializable saveParking(Parking p);
	/**
	 * 
	 * @param id
	 * @param path
	 * @return
	 */
	public boolean uploadImg(int id, String path);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Parking getParking(int id);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Users getUser(int id);
	/**
	 * 
	 * @param lat
	 * @param lng
	 * @return
	 */
	public List<Parking> getFilteredParkings(float lat, float lng);


}
