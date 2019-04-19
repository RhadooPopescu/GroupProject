import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Event {
	
	private String name = "";
	private Date date ;
	private int duration;
	private int price;
	
	public Event() {
	}	
	
	static ArrayList<String> getEventsList() {
		String query = "SELECT Name FROM `tbl_event`;";
		ArrayList<String> eventsList = new ArrayList<String>();
		try {
            ResultSet results = Connect.selectStm(query);
            while (results.next()) {
                String event = results.getString("Name");
                eventsList.add(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
        return eventsList;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public Date getDate() {
		return date;
	}
	
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	public int getDuration() {
		return duration;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getPrice(int price) {
		return price;
	}
	
	static int getEventId(String name) {
		String query = "SELECT EventID FROM tbl_event WHERE Name ='" + name + "';";
		int ID = 0;
		try {
            ResultSet rs = Connect.selectStm(query);
            rs.next();
            ID = Integer.parseInt(rs.getString("EventID"));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException f) {
            System.out.println(f.getMessage());
        }
        return ID;
	}

}
