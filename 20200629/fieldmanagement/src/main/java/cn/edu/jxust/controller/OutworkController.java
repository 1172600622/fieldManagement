package cn.edu.jxust.controller;

import cn.edu.jxust.entity.LJIP;
import cn.edu.jxust.entity.LJP_VOV;
import cn.edu.jxust.service.OutWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/outwork")
public class OutworkController {

      @Autowired
     OutWorkService  outWorkService;
/*各类操作*//*
      @RequestMapping("/list")
      public  String  list(){
          System.out.println();
          return "/outwork/outwork-main";
      }*/

/*分县*/
        @RequestMapping("/subcountry")
        public  String subCountry() {
             return  "subcountry";
        }
/*  //网点
    @RequestMapping("/network")
    public  String network() {
        return  "network";
    }*/
 /*网点细节*/
    @RequestMapping("/networkdetail")
    public  String networkdetail() {
        return  "outwork/networkdetail";
    }

    @RequestMapping("/add")
             public  String insertDetail(LJP_VOV  lijp) {
        System.out.println("VOV" +lijp);
                LJIP  ljip = new LJIP();

              String []address=  lijp.getAddress();
              String a ="";
              for(String ad:address){
                  a+=ad;
              }

         ljip.setLJIP_address(a);
        outWorkService.insert(ljip);

        return  "outwork/networkdetail";
    }


}
