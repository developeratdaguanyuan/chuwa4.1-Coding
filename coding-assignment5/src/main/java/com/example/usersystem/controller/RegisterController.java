package com.example.usersystem.controller;

import com.example.usersystem.error.ErrorInfo;
import com.example.usersystem.model.User;
import com.example.usersystem.service.RegisterService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping(path = "/register/user", produces = "application/json")
    public ResponseEntity<User> register(@RequestBody User user) {
        return new ResponseEntity<User>(registerService.addUser(user), HttpStatus.CREATED);
    }

    @GetMapping(path = "/register/user/{userName}", produces = "application/json")
    public ResponseEntity<User> getUser(@PathVariable String userName) {
        return new ResponseEntity<User>(registerService.getUser(userName), HttpStatus.OK);
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(ExecutionControl.NotImplementedException.class)
    @ResponseBody
    ErrorInfo unhandled() {
        ErrorInfo errorInfo = new ErrorInfo();
        errorInfo.setId("not_supported");
        errorInfo.setMessage("operation not yet implemented");
        return errorInfo;
    }
}
