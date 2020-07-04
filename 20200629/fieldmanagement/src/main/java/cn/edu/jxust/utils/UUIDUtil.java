package cn.edu.jxust.utils;

import java.util.UUID;

public class UUIDUtil{

    public static String getNext(int allrecords, String prefix) {

        String a =String.valueOf(allrecords+1);


            if(a.length()==1){
                return  prefix+"0"+"0"+a;
            }
            if (a.length()==2){
                return prefix+"0"+a;
            }

        return  prefix+a;
    }
    public  static  String getUUID(){
       String uuid = UUID.randomUUID().toString();

        uuid = uuid.replace("-", "");
return  uuid;
    }
}
