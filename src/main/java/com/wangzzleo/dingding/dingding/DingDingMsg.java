package com.wangzzleo.dingding.dingding;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DingDingMsg implements Comparable<DingDingMsg> {
    private transient Integer weighting;
    private String msgtype;
    private MarkDown markdown;
    private Text text;
    private String at;

    @Override
    public int compareTo(DingDingMsg o) {
        return o.weighting - this.weighting;
    }

    @Data
    @Builder
    public static class MarkDown {
        private String content;
    }

    @Data
    @Builder
    public static class Text {
        private String title;
        private String text;
    }

}
