package ua.com.foxminded.secondpart;

public interface Serviceable {
	
	public default boolean checkDistance() {return true;};
	
	public void addDistance(int additionalDistance);
	
	public void addDistance(float additionalDistance)  ;
	

}
