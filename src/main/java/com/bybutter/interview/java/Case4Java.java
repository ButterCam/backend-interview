package com.bybutter.interview.java;

import com.bybutter.interview.Case4;
import com.bybutter.interview.Easy;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Case4Java implements Case4 {
    /**
     * 实现一个路由机制，table 是路由表，是由路由记录构成的 map，
     * key 的格式是 192.168.0.0/16，value 是对应的主机名，
     * ip 是需要进行路由的 ip，格式是标准的 ip，例如 192.168.31.1，
     * 需要返回 ip 路由之后对应的主机名，如果找不到匹配的路由记录，返回 null
     */
    @Easy
    @Override
    public String routing(@NotNull Map<String, String> table, @NotNull String ip) {
        Map<String,String> tableCopy=new HashMap<>();
        for(String key:table.keySet()){
            String[] arrays=key.split("/");
            tableCopy.put(arrays[0],table.get(key));
        }
        String hostName=tableCopy.get(ip);
        if(hostName==null){
            return null;
        }
        return hostName;
    }
}
