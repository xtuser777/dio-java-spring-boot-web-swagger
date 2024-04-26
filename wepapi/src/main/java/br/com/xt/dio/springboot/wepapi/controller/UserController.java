package br.com.xt.dio.springboot.wepapi.controller;

import br.com.xt.dio.springboot.wepapi.entity.User;
import br.com.xt.dio.springboot.wepapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping()
    public void post(@RequestBody User user){
        repository.save(user);
    }

    @PutMapping()
    public void put(@RequestBody User user){
        repository.update(user);
    }

    @GetMapping()
    public List<User> getAll(){
        return repository.listAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}
