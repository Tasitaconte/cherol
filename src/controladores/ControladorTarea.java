package controladores;

import Dao.DaoTarea;
import Dao.IDaoTarea;
import Modelos.tareaModel;

public class ControladorTarea {

    public boolean crearTarea(int id_persona,String name, String text) {
        int id_usuario = id_persona+1;
        String nameTarea = name;
        String tarea = text;
        System.out.println(id_usuario + " " + nameTarea + " " + tarea);
        tareaModel tModel = new tareaModel(id_usuario, tarea, nameTarea);
        IDaoTarea iDaoTarea = new DaoTarea();
        return iDaoTarea.createTarea(tModel);
    }
}
