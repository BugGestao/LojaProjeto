
package ClassePrincipal;

import View.ViewLogin;
import conexoes.MySQL;

public class Classeprincipal {
    public static void main(String[] args) {
        
        ViewLogin login = new ViewLogin();
        login.setVisible(true);
            
        //MySQL novacon = new MySQL();
        //novacon.conectaBanco();
        //menu.setExtendedState(menu.MAXIMIZED_BOTH); 
        
    }
    
}
