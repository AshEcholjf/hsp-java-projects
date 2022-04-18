package priv.ljf.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collection_ {
    //抑制警告，添加注解
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //老韩解读：
        //1.集合主要是两组(单列集合，双列集合)
        //2.Collection接口有两个重要的子接口 List  Set，他们的实现类都是单列集合
        //3.Map接口的实现类是双列集合，存放的是K-V键值对
//        Collection
//        Map
        //举例：
        Collection arrayList = new ArrayList();
        arrayList.add("单");
        arrayList.add("列");
        Map map = new HashMap();
        map.put("双","列");
    }
}
