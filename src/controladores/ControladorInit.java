package controladores;

import javax.swing.JOptionPane;
import vistas.VistaLogin;

public class ControladorInit {

    static VistaLogin v = new VistaLogin();

    public static void visible() {
        v.setVisible(true);
    }

    public static void hidden() {
        v.setVisible(false);
    }

    public static void btnRegister() {
        hidden();
        ControladorRegister.visible();
    }

    public static void inicioSesion() {

        if (v.getGetEmail().getText().equals("") || v.getGetPassword().getText().equals("")) {
            JOptionPane.showMessageDialog(v, "rellene los campos");
        } else {
            String email = v.getGetEmail().getText();
            String pass = v.getGetPassword().getText();
            System.out.println(email + " " + pass);
        }

    }

}
