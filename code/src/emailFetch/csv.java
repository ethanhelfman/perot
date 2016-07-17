package emailFetch;

public class csv {
	
	String date;
	String floor;
	String machine;
	String issue;

	public csv() {
		floor = "floor";
		machine = "machine";
		issue = "issue";
		date = "date";
	}
	
	public csv(String fl, String ma, String is, String dt) {
		floor = fl;
		machine = ma;
		issue = is;
		date = dt;
	}
	
	public String toString() {
		return date + "," + floor + "," + machine + "," + issue;
	}
}
