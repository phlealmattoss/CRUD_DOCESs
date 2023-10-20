
package conexao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static final String user = "root";
    public static final String pass = "";
    public static final String url = "jdbc:mysql://localhost:3306/loja_de_doce";

    public static Connection createConnection(){
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = createConnection();

        if (con!=null){
            JOptionPane.showMessageDialog(null,"Conexão bem sucedida.");
            con.close();
        }
    }
}
