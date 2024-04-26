package br.com.xt.dio.springboot.wepapi.repository;

import br.com.xt.dio.springboot.wepapi.entity.User;
import br.com.xt.dio.springboot.wepapi.handler.ObrigatoryFieldException;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Hidden
@Repository
public class UserRepository {

    public void save(User user){
        if (user.getUsername() == null) throw new ObrigatoryFieldException("username");
        if (user.getPassword() == null) throw new ObrigatoryFieldException("password");
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }

    public void update(User user){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(user);
    }

    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> listAll(){
        List<User> users = new ArrayList<>();
        users.add(new User(0, "gleyson","password"));
        users.add(new User(0, "frank","masterpass"));
        return users;
    }

    public User finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new User(0, "gleyson","password");
    }
}
