import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //driver tanimla
        Class.forName("org.postgresql.Driver");
        //database baglan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1234");

        //statement

        Statement st = con.createStatement();
       // String sql01= "Create Table workers (worker_id int , worker_name varchar(20), worker_salary int)";
       // st.execute(sql01);
       // tabloya worker_adres sutunu ekleyelim
        //String sql02 = "Alter Table workers  add worker_adress varchar(50)";
       // st.execute(sql02);
        String sql03 ="drop table workers;";
        st.execute(sql03);


    }

}
