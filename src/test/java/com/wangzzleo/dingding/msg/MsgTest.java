package com.wangzzleo.dingding.msg;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.Collections;

public class MsgTest {

    @Test
    public void testTextMsg() {
        TextMsg textMsg = new TextMsg();
        textMsg.setContent("test wangzz");
        textMsg.setAt(Collections.singletonList("1231231231"), false);
        Gson gson = new Gson();
        String s = gson.toJson(textMsg);
        System.out.println(s);
    }

}
