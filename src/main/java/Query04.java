import java.sql.*;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        //database baglan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1234");

        //statement

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from students");
        ResultSetMetaData rmsd =rs.getMetaData();
        System.out.println(  rmsd.getColumnTypeName(1));

    }
}
