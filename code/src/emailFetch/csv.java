package emailFetch;

public class csv {
	
	String date;
	String floor;
	String area;
	String issue;

	public csv() {
		floor = "floor";
		area = "area";
		issue = "issue";
		date = "date";
	}
	
	public csv(String fl, String ma, String is, String dt) {
		floor = fl;
		area = ma;
		issue = is;
		date = dt;
	}
	
	public String toString() {
		return date + "," + floor + "," + area + "," + issue;
	}
}
