package db;

import java.util.Collection;
import java.util.Map;
// comment 1

import com.google.common.collect.Maps;

import model.User;

public class DataBase {
    private static Map<String, User> users = Maps.newHashMap();

    public static void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public static User findUserById(String userId) {
        return users.get(userId);
    }

    public static Collection<User> findAll() {
        return users.values();
    }
    
    public void add() {
    	System.out.println("kkkk");
    }
    
    public void add3() {
    	
    }
    	
    public void add2(){
     
    }
    
    public void add5() {}

    public void add4(){}
    
    public String geta() {
    	return "ABC";
    }
    
    public String a11() { return "aaa"; }
}
