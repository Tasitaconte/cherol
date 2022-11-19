package Dao;

import Conexion.conexionSQL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Env.env;
import Modelos.UserModel;

public class DaoUsuario extends conexionSQL implements IDaoUsuario {

    public boolean createUser(UserModel usuario) {
        String sql = "INSERT INTO " + env.T_USER + "("
                + env.NAME_USER + "," + env.EMAIL_USER + "," + env.PASS_USER + "," + env.ID_ROL + ") VALUES (?, ?, ?,?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getName_user());
            ps.setString(2, usuario.getEmail_user());
            ps.setString(3, usuario.getPass_user());
            ps.setInt(4, 2);
            ps.executeUpdate();
            System.out.println("Creado con exito");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al crear " + e.getMessage());
        } finally {
            try {
                getConnection().close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion " + e.getMessage());
            }
        }
        return false;
    }

}
