import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Agent {
	

	private String name = "";
	private String email = "";
	private String phoneNo = "";
	
	public Agent(String name, String email, String phoneNo) {
		this.name = name;
		
		this.phoneNo = phoneNo;
		if (phoneNo.equals(null)) {
			this.phoneNo = "";
			
		this.email = email;
		if (email.equals(null)){
			this.email = "";
		
		}
		}
	}
	
	public Agent() {
	}	
	
	public void addAgent() {
		String query = "INSERT INTO tbl_agent(AgentID,Name,PhoneNo,Email)\r\n" + 
				"VALUES(DEFAULT,'" + this.name + "','" + this.phoneNo + "','" + this.email + "');";
	}
	
	static ArrayList<String> getAgentsList() {
		String query = "SELECT Name FROM 'tbl_agent;";
		ArrayList<String> agentsList = new ArrayList<String>();
		try {
            ResultSet results = Connect.selectStm(query);
            while (results.next()) {
                String agent = results.getString("Username");
                agentsList.add(agent);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
        return agentsList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
