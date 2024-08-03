package com.example.prac.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;


// @Repository
// public class UserRepository {
    
//     List<User> user_data=new ArrayList<>();


//     List<User> getAll(){
//         return user_data;
//     }

//     User getById(Integer Id){
//         return user_data.get(Id);
//     }


//     String addData(User user){
//         try {
//             user_data.add(user);
//             return "Sucess";
//         } catch (Exception e) {
//             System.out.println(e);
//             return "Failed";
//         }
//     }


//     @PostConstruct
//     private void init(){
//         user_data.add(new User(1,"C","J","feaafea","feafea","fgeaefae"));
//     }

// }

public interface UserRepository extends CrudRepository<User,Integer>{

    public User findByEmailAndPassword(String email, String pass);
    
}