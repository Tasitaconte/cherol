package Dao;

import Conexion.conexionSQL;
import Env.env;
import Modelos.tareaModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoTarea extends conexionSQL implements IDaoTarea {

    @Override
    public boolean createTarea(tareaModel tarea) {
        String sql = "INSERT INTO " + env.T_TAREA + "("
                + env.ID_USER+ "," + env.NAME_TAREA + "," + env.TAREA + ") VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setString(2, tarea.getName_tarea());
            ps.setString(3, tarea.getTarea());
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
