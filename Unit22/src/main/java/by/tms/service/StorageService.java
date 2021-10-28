package by.tms.service;

import by.tms.entity.User;
import by.tms.storage.InMemoryStorage;

public class StorageService {

    private static volatile StorageService instance;

    private InMemoryStorage storage=new InMemoryStorage();


    public static StorageService getInstance(){
        StorageService localInstance = instance;
        if (localInstance == null) {
            localInstance=instance;
            synchronized (StorageService.class){
                if(localInstance == null){
                    instance=localInstance=new StorageService();
                }
            }
        }
        return localInstance;
    }


    public User findByUsername(String username){
        return storage.findByUsername(username);
    }

    public void save(User user){
        storage.save(user);
    }

    public void updateUser(User user, String newName, String newPassword){
        storage.updateUser(user, newName, newPassword);
    }

    public void deleteUser(User user) {
        storage.deleteUser(user);
    }
}
