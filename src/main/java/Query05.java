import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        //database baglan
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbc",
                "postgres",
                "1234");

        //statement

        Statement st = con.createStatement();

        //veri ekleme
        String [] veri ={"insert into ogrenciler values  (400,'Bahar Sonmez',12,'K')",
                          "insert into ogrenciler values (401,'Bahar Sonmez',12,'K')",
                           "insert into ogrenciler values (402,'Bahar Sonmez,12,'K')"};
         int count = 0;
          for(String each:veri){
           count = count +   st.executeUpdate(each);
          }
        System.out.println(count+ " satir eklendi");
           //2.yol



    }

}
