import java.sql.*;

public class Query02 {
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

        //



     ResultSet veri = st.executeQuery("select country_name from countries where region_id=1;");
     while(veri.next()){
         System.out.println(veri.getString(1));

     }

     String sq2 = "select country_id,country_name from countries where region_id>2;";
      ResultSet veri1 =st.executeQuery(sq2);
      while (veri1.next()){
          System.out.println(veri1.getString(1)+veri1.getString(2));
      }


    }
}
