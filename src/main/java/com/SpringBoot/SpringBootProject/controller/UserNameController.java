package com.SpringBoot.SpringBootProject.controller;

import com.SpringBoot.SpringBootProject.entity.User;
import com.SpringBoot.SpringBootProject.entity.UserVersion1;
import com.SpringBoot.SpringBootProject.entity.UserVersion2;
import com.SpringBoot.SpringBootProject.service.UserNameService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.hateoas.Link;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/user")
@Tag(name = "User Details Table", description = "User Id, User Name and User Age are available in the table!")
public class UserNameController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserNameService userNameService;

    @GetMapping("/greeting")
    @Operation(summary = "Good Morning Message", description = "Good Morning in local language!")
    public String sayHello(@RequestParam  String username, Locale locale) {
        return messageSource.getMessage("greeting.message", new String[]{username}, locale);
    }

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    @Operation(summary = "Add User", description = "Add a new user in the table!")
    public void setUser(@RequestBody User user) {
        userNameService.setUser(user);
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    @Operation(summary = "Get User Details ", description = "List of all the users!")
    public List<User> getUser() {
        return userNameService.getUser();
    }

    @DeleteMapping("/deleteUser/{id}")
    @Operation(summary = "Delete User", description = "Delete the user by Id!")
    public String deleteUser(@RequestBody Long id) {
        userNameService.deleteUser(id);
        return "User Deleted Successfully!";
    }

    /*@PostMapping("/static")
    public User getfilteredUser(@RequestBody  User user) {
        return userNameService.getfilteredUser(user);
    }*/

    @PostMapping("/dynamic")
    public MappingJacksonValue getfilteredUser(@RequestBody  User user) {
        SimpleBeanPropertyFilter simpleBeanPropertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name","age");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("CustomFilter", simpleBeanPropertyFilter);
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(user);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }

    //MIME
//    @GetMapping(produces="application/version1+json")
//    public UserVersion1 getUserVersion1(@RequestParam String name, @RequestParam int age) {
//        return new UserVersion1(name,age);
//    }
//
//    @GetMapping(produces="application/version2+json")
//    public UserVersion2 getUserVersion2(@RequestParam String name, @RequestParam int age, @RequestParam String gender) {
//        return new UserVersion2(name,age,gender);
//    }


    //Request Param
//    @GetMapping()
//    public ResponseEntity<?> getUserVersion2(@RequestParam String name, @RequestParam int age, @RequestParam(required=false) String gender, @RequestParam int version) {
//        if(version==1) return ResponseEntity.ok(new UserVersion1(name,age));
//        else return ResponseEntity.ok(new UserVersion2(name,age,gender));
//    }

    //URI
//    @GetMapping("version1")
//    public UserVersion1 getUserVersion1(@RequestParam String name, @RequestParam int age) {
//        return new UserVersion1(name,age);
//    }
//
//    @GetMapping("version2")
//    public UserVersion2 getUserVersion2(@RequestParam String name, @RequestParam int age, @RequestParam String gender) {
//        return new UserVersion2(name,age,gender);
//    }

    //custom
//    @GetMapping(headers="X-API-VERSION=1")
//    public UserVersion1 getUserVersion1(@RequestParam String name, @RequestParam int age) {
//        return new UserVersion1(name,age);
//    }
//
//    @GetMapping(headers="X-API-VERSION=2")
//    public UserVersion2 getUserVersion2(@RequestParam String name, @RequestParam int age, @RequestParam String gender) {
//        return new UserVersion2(name,age,gender);
//    }

    
    @GetMapping("/hateoas")
    public EntityModel<UserVersion1> getUserVersion1(@RequestParam String name, @RequestParam int age) {
        UserVersion1 userVersion1 = new UserVersion1(name,age);
        Link urls =  WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(UserNameController.class).getUser()).withRel("URLs");
        return EntityModel.of(userVersion1, urls);
    }

}
