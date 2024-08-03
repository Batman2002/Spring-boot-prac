package com.example.prac.user;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// @RequestMapping("/api")
// @RestController
// public class UserController {
    
//     private final UserRepository repository;

//     public UserController(UserRepository repository){
//         this.repository=repository;
//     }


//     @GetMapping("/all")
//     List<User> getAll(){
//         return repository.getAll();
//     }


//     @GetMapping("/{id}")
//     User getById(Integer Id){
//         return repository.getById(Id);
//     }


//     @PostMapping("/add")
//     void addUser(@RequestBody User user){
//         User newUser=new User(user.Id(),user.firstName(),user.lastName(),user.email(),user.password() ,user.phoneNo());
//         repository.addData(newUser);
//     }




    

// }
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository){
        this.repository=repository;
    }

    @GetMapping("/all")
    public Iterable<User> getAll(){
        return repository.findAll();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        User temp=new User();

        temp.setId(user.Id);
        temp.setFirstName(user.firstName);
        temp.setLastName(user.lastName);
        temp.setEmail(user.email);
        temp.setPassword(user.password);
        temp.setPhoneNo(user.phoneNo);
        temp.setLogState(false);
        repository.save(temp);
        System.out.println("Sucess");
    }

    @PutMapping("/login")
    public void login(@RequestBody String email,@RequestBody String password){
       User req_users=repository.findByEmailAndPassword(email,password);
       req_users.setLogState(true);
       repository.save(req_users);
    }

    @PutMapping("/logout")
    public void logout(@RequestBody User user){
        user.setLogState(false);
        repository.save(user);
    }
}