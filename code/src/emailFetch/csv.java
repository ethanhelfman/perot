package emailFetch;

public class csv {
	
	String date;
	String floor;
	String area;
	String issue;
	String location;

	public csv() {
		floor = "floor";
		area = "area";
		issue = "issue";
		date = "date";
		location = "location";
	}
	
	public csv(String fl, String ma, String is, String dt, String loc) {
		floor = fl;
		area = ma;
		issue = is;
		date = dt;
		location = loc;
	}
	
	public String toString() {
		return date + "," + floor + "," + area + "," + issue + "," + location;
	}
}
