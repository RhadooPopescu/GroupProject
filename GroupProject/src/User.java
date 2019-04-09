import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User {
    private int userID, cardCVV;
    private long cardNo;
    private String title, fName, lName, address1, address2, town, postcode, username, password;
    private String email, phoneNo, orgName, webAddress, orgEmail, paymentMethod, userType;

    public User() {
    }

    public User(long cardNo, int cardCVV, String title, String fName, String lName, String address1,
                String address2, String town, String postcode, String username, String password, String email,
                String phoneNo) {
        this.cardNo = cardNo;
        this.cardCVV = cardCVV;
        this.title = title;
        this.fName = fName;
        this.lName = lName;
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.postcode = postcode;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.userType = "customer";
    }

    public User(long cardNo, int cardCVV, String title, String fName, String lName, String address1,
                String address2, String town, String postcode, String username, String password, String email,
                String phoneNo, String orgName, String webAddress, String orgEmail, String paymentMethod) {
        this.cardNo = cardNo;
        this.cardCVV = cardCVV;
        this.title = title;
        this.fName = fName;
        this.lName = lName;
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.postcode = postcode;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.orgName = orgName;
        this.webAddress = webAddress;
        this.orgEmail = orgEmail;
        this.paymentMethod = paymentMethod;
        this.userType = "organization";
    }

    public int getID() {
        return userID;
    }

    public void setID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void insertCustomerData() {
        String query = "";
        if (this.userType == "customer") {
            query = "INSERT INTO tbl_user(UserID,Title,Fname,LNAme,Address1,Address2,Town,PostCode,Username,Pass,Email" +
                    ",PhoneNo,CardNo,CVVCode,Type) VALUES(DEFAULT,'" + this.title + "','" + this.fName + "','" + this.lName + "','"
                    + this.address1 + "','" + this.address2 + "','" + this.town + "','" + this.postcode + "','" + this.username + "','"
                    + this.password + "','" + this.email + "','" + this.phoneNo + "'," + this.cardNo + "," + this.cardCVV + ",'" + this.userType +
                    "');";
        } else {
            query = "INSERT INTO tbl_user(UserID,Title,Fname,LNAme,Address1,Address2,Town,PostCode,Username,Pass,Email" +
                    ",PhoneNo,CardNo,CVVCode,Type,OrganizationName,WebAddress,OrgEmail,PaymentMethod) VALUES(DEFAULT,'"
                    + this.title + "','" + this.fName + "','" + this.lName + "','" + this.address1 + "','" + this.address2 +
                    "','" + this.town + "','" + this.postcode + "','" + this.username + "','" + this.password + "','" + this.email + "','" +
                    this.phoneNo + "'," + this.cardNo + "," + this.cardCVV + ",'" + this.userType + "','" + this.orgName + "','" +
                    this.webAddress + "','" + this.orgEmail + "','" + this.paymentMethod + "');";
        }

        try {
            Connect.updateData(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
    }

    public boolean checkFieldInDB(String field, String attribute) {
        String query = "SELECT * FROM tbl_user WHERE " + field + "='" + attribute + "';";
        try {
            ResultSet results = Connect.selectStm(query);
            if (results.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
        return false;
    }

    public boolean loginCheck() {
        String query = "SELECT * FROM tbl_user WHERE Username='" + this.username + "' AND Pass='" + this.password + "';";
        try {
            ResultSet results = Connect.selectStm(query);
            if (results.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
        return false;
    }

    public static void deleteUser(int userID) {
        String query = "DELETE FROM tbl_user WHERE ID='" + userID + "';";
        try {
            Connect.updateData(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
    }

    public static ArrayList<String> userList() {
        String query = "SELECT Username FROM tbl_user;";
        ArrayList<String> users = new ArrayList<>();
        try {
            ResultSet results = Connect.selectStm(query);
            while (results.next()) {
                String user = results.getString("Username");
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException k) {
            System.out.println(k.getMessage());
        }
        return users;
    }

    public String getType(String username) {
        String query = "SELECT Type FROM tbl_user WHERE Username='" + username + "';";
        String type = "";
        try {
            ResultSet rs = Connect.selectStm(query);
            rs.next();
            type = rs.getString("Type");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException f) {
            System.out.println(f.getMessage());
        }
        return type;


    }

    public static void main(String[] args) {
        ArrayList<String> test = userList();
        System.out.println(test.get(0));
    }
}
