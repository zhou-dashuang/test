package com.example.demo;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

import static sun.rmi.transport.TransportConstants.Version;

@RestController

public class telephonecontroller {
    @RequestMapping(value = "/api/Event",method = RequestMethod.GET)
   // public  void  upload(int event_type, String Version ){
    public  void  upload(HttpServletRequest request ){
        String s=request.getParameter("event_type");


        System.out.println("the event_type is "+request.getParameter("event_type"));
        System.out.println("the Version is "+request.getParameter("Version"));
        //测试git呢
        //你看个锤子哦



    }
}
