/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.Implementation;

import dao.UserDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.User;
import service.UserInterface;

/**
 *
 * @author Mhz
 */
public class UserImpl extends UnicastRemoteObject implements UserInterface{

    public UserImpl() throws RemoteException{
        super();
    }
    
    public UserDao dao = new UserDao();
    
    @Override
    public String createUser(User user) throws RemoteException {
        return dao.createUser(user);
    }

    @Override
    public String updateUser(User user) throws RemoteException {
        return dao.updateUser(user);
    }

    @Override
    public String deleteUser(User user) throws RemoteException {
        return dao.deleteUser(user);
    }

    @Override
    public List<User> allUser() throws RemoteException {
        return dao.allUser();
    }

    @Override
    public User getUserById(User user) throws RemoteException {
        return dao.getUserById(user);
    }
    
}
