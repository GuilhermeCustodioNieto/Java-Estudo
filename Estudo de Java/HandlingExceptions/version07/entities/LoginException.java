package com.version07.entities;

public class LoginException extends Exception{
    public LoginException(){
      super("Login Exception");
    }
    
    public LoginException(String message){
      super(message);
    }
}
