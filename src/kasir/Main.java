package kasir;

import com.layout.Login;

public class Main {

    public static void main(String[] args) {
        com.database.Koneksi.setConn();
        Login login = new Login();
        
        // 2 center JFrame Form
        login.pack();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
}
