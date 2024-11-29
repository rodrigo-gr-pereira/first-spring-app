package com.pereira.first_spring_app.controller;

import com.pereira.first_spring_app.domain.User;
import com.pereira.first_spring_app.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {
    @Autowired
    private HelloWordService helloWordService;
   // private HelloWordController(HelloWordService helloWordService){
     //   this.helloWordService = helloWordService;
    //}
    // post, get, delete, put, patch, oprions, head
    @GetMapping //("/get")
    public String helloWord(){
        return helloWordService.helloWord("Rodrigo");
    }
    @PostMapping("/{id}")
    public String helloWordPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter,@RequestBody User body){
        return "Hello Word " +  filter;
        //body.getNome() + id
    }
}
