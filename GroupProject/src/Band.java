import java.sql.SQLException;

public class Band {
	
	private String name = "";
	private String genre = "";
	private String link = "";
	private int agent;
	
	public Band(String name, String genre, String link, int ID) {
		if (this.link == null)
				this.link = "";
		this.name = name;
		this.genre = genre;
		this.agent = ID;
		
		String query = "INSERT INTO tbl_band VALUES(DEFAULT,'"+ this.name + "','" + this.genre + "'," + null + ", '" + this.link +"', '" + this.agent + "');";
		try {
            Connect.updateData(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
	}
}


