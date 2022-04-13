package com.messiyang.leetcode.type;


import com.alibaba.fastjson.JSONObject;

/**
 * <p>write your description here
 *
 * @author 【水彧】（【崔杨】  shuiyu.cui@tuya.com）
 * @since 2022/3/29 3:18 下午
 */
public class test {
    public static void main(String[] args) {
        String str = "{\"data\":{\"rawsql\":\"SELECT * FROM \\\"/av/moto/moto_63/d/2f2c944cd7be22a13azukb\\\"\",\"on_action_failed\":\"continue\",\"metrics\":[{\"speed_max\":0,\"speed_last5m\":0.0,\"speed\":0.0,\"node\":\"9a7cf457e182@172.19.0.2\",\"matched\":0}],\"id\":\"rule:6ff59328\",\"for\":[\"/av/moto/moto_63/d/2f2c944cd7be22a13azukb\"],\"enabled\":true,\"description\":\"\",\"actions\":[{\"params\":{\"target_topic\":\"/av/moto/moto_63\",\"target_qos\":0,\"payload_tmpl\":\" DEV${topic}|${payload}\"},\"name\":\"republish\",\"metrics\":[{\"taken\":0,\"success\":0,\"node\":\"9a7cf457e182@172.19.0.2\",\"failed\":0}],\"id\":\"republish_1648198412221852778\",\"fallbacks\":[]}]},\"code\":0}";
        JSONObject jsonObject = JSONObject.parseObject(str);
        String r = jsonObject.getString("data");
        System.out.println(r);
    }
}
