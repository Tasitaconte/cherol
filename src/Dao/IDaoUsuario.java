package Dao;

import Modelos.UserModel;

public interface IDaoUsuario {

    public boolean createUser(UserModel usuario);

    public boolean Dingreso(UserModel usuario);
}
