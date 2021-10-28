package by.tms.service;

import by.tms.entity.User;

import java.util.List;

public class DbService {
    private static DbService dbService;

    public static DbService getInstance(){
        DbService localInstance = dbService;
        if (localInstance == null) {
            localInstance=dbService;
            synchronized (StorageService.class){
                if(localInstance == null){
                    dbService=localInstance=new DbService();
                }
            }
        }
        return localInstance;
    }

    public void save(User user){
        dbService.save(user);
    }

    public List<User> selectAll(){
        return dbService.selectAll();
    }

    public User find(String username){
        return dbService.find(username);
    }

    public boolean delete(User user){
        return dbService.delete(user);
    }

    public boolean updateUser(User user, String newName, String newPassword){
        return dbService.updateUser(user, newName, newPassword);
    }
}
