package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value = "/wise/wxdj/")
public class controller {
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String get(){
        System.out.println("有请求来啦。。");
        return "hello word!";
    }
    @RequestMapping(value = "GetGroupList",method = RequestMethod.GET)
    public List<Domain> GroupList(){
       // System.out.println("有请求来啦。。");
        List<Domain> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            Domain domain=new Domain();
            domain.setID(i);
            domain.setName(i+"组");
            domain.setRadioID(i);
            list.add(domain);
        }

        return list;
    }
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Location> GroupList2(int groupId ){
         System.out.println("the groupId is "+groupId);
        List<Location> list=new ArrayList<>();
        for(int i=0;i<2;i++){
            Location location=new Location();
            location.setId(i);
           // location.setGroupID(i);
            location.setRadioID(i);
            location.setName("A100"+i);
            location.setLongitude(102.539);
            location.setLatitude(24.34);
            location.setInfoDate("2019-05-03");
            list.add(location);
        }
        return list;
    }
    @RequestMapping(value = "GetMessagelist",method = RequestMethod.GET)
    public  Map<String,Object> tableList(int startpage,int pageindex ){
        System.out.println("the startPage is "+startpage);
        System.out.println("the pageSize is "+pageindex);
        List<Message> list=new ArrayList<>();
        for(int i=0;i<pageindex;i++){
            Message message=new Message();
            message.setId(i);
            message.setDate(new Date());
            message.setText(i+"号人员在说话");
            list.add(message);
        }
        Map<String,Object> res=new HashMap<>();
        res.put("data",list);
        res.put("count",23);
        return res;
    }
    @RequestMapping(value = "api/Event",method = RequestMethod.POST)
    public  void  upload(int event_type,
                         String Version ){
        System.out.println("the event_type is "+event_type);
        System.out.println("the Version is "+Version);

    }
}
