package com.i3tv.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestBody User user) {
        try {
            service.create(user);
        }catch (Exception ex) {
            return "Error al crear el usuario: " + ex.toString();
        }
        return "El usuario creado de forma satisfactoria!";
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public User read(@PathVariable Integer id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public String update(@RequestBody User user) {
        try {
            service.update(user);
        }catch (UserNotFounException ex) {
            return "Error al actualizar el usuario: " + ex.toString();
        }
        return "El usuario ha sido actualizado de forma satisfactoria!";
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id){
        try {
            service.delete(id);
        }catch (UserNotFounException ex) {
            return "Error al eliminar el usuario: " + ex.toString();
        }
        return "El usuario ha sido eliminado de forma satisfactoria!";
    }

}
