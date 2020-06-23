package com.wangzzleo.dingding.msg;

import java.util.List;

public class TextMsg extends AbstractAtMsg {

    private Text text;

    public TextMsg() {
        super();
        this.msgtype = "text";
    }

    public void setContent(String content) {
        if (text == null) {
            text = new Text();
        }
        text.setContent(content);
    }

    public static class Text {
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

}
