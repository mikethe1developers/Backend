package placer.backend;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class SearchObject {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private String id = "";  //ID of the device who sent
	@Persistent
	private Double latitude;
	@Persistent
	private Double longitude;
	@Persistent
	private Float bearing;
	@Persistent
	private Float axisX;
	@Persistent
	private Float axisY;
	@Persistent
	private Float axisZ;
	
	SearchObject(String id, Double lat, Double lon, Float bearing, Float x, Float y, Float z) {
		this.id = id;
		this.latitude = lat;
		this.longitude = lon;
		this.bearing = bearing;
		this.axisX = x;
		this.axisY = y;
		this.axisZ = z;
	}
	
	String getId() {
		return this.id;
	}
	
	Double getLatitude() {
		return this.latitude;
	}
	
	Double getLongitude() {
		return this.longitude;
	}
	
	Float getBearing() {
		return this.bearing;
	}
	
	Float getX() {
		return this.axisX;
	}
	
	Float getY() {
		return this.axisY;
	}
	
	Float getZ() {
		return this.axisZ;
	}
	
	void setId(String id) {
		this.id = id;
	}
	
	void setLatitude(Double lat) {
		this.latitude = lat;
	}
	
	void setLongitude(Double lon) {
		this.longitude = lon;
	}
	
	void setBearing(Float bearing) {
		this.bearing = bearing;
	}
	
	void setAxisX(Float x) {
		this.axisX = x;
	}
	
	void setAxisY(Float y) {
		this.axisY = y;
	}
	
	void setAxisZ(Float z) {
		this.axisZ = z;
	}
	
}