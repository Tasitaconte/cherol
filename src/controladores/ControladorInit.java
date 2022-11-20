package controladores;

import Dao.DaoUsuario;
import Dao.IDaoUsuario;
import LibPersonals.encoder;
import Modelos.UserModel;
import javax.swing.JOptionPane;
import vistas.VistaLogin;

public class ControladorInit {

    static encoder mEnconder = new encoder();
    static VistaLogin v = new VistaLogin();

    public static void visible() {
        v.setVisible(true);
    }

    public static void hidden() {
        v.dispose();
    }

    public static void btnRegister() {
        hidden();
        ControladorRegister.visible();
    }

    public static void inicioSesion() {
        String email = v.getGetEmail().getText().toLowerCase();
        String pass = mEnconder.ecnode(v.getGetPassword().getText());
        int rol = v.getGetRol().getSelectedIndex();
        if (email.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(v, "rellene los campos");
        } else {
            switch (rol) {
                case 1:
                    if (validacion(email, pass, rol)) {
                        hidden();
                        ControladorEncargado.visible();
                    }
                    break;
                case 2:
                    if (validacion(email, pass, rol)) {
                        hidden();
                        ControladorUsuario.visible();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(v, "Elija el rol");
            }
        }
    }

    public static boolean validacion(String x, String y, int z) {
        UserModel u = new UserModel(null, x, y, z);
        IDaoUsuario iDaoUsuario = new DaoUsuario();
        return iDaoUsuario.Dingreso(u);
    }

}
