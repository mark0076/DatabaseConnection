import java.sql.*;


public class DataBaseTesting {
    public static void main(String[] args) throws Exception {
        String host="localhost";
        int port=3306;
        String  url ="jdbc:mysql://" + host + ":" + port + "/qadbt";
        Connection con= DriverManager.getConnection(url,"root","5561419");
        Statement s=con.createStatement();
       ResultSet rs  =s.executeQuery("select * from credentials where scenario='zerobalancecard';");
        while(rs.next()){
        System.out.println(rs.getString("username"));
        System.out.println(rs.getString("password"));
    }}
}
