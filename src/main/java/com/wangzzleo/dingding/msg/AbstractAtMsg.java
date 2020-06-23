package com.wangzzleo.dingding.msg;

import java.util.Arrays;
import java.util.List;

public class AbstractAtMsg extends BaseDingDingMsg {

    At at;

    /**
     * at 设置
     * @param mobiles 手机号
     * @param atAll 是否@所有
     */
    public void setAt(List<String> mobiles, boolean atAll) {
        if (at == null) {
            at = new At();
        }
        at.setAtMobiles(mobiles);
        at.setAtAll(atAll);
    }

    /**
     * 增加一个@的手机号
     * @param mobile 手机号
     */
    public void addAt(String mobile) {
        if (at == null) {
            at = new At();
        }
        if (at.getAtMobiles() == null) {
            at.setAtMobiles(Arrays.asList(mobile));
        }
    }

    private static class At {

        /**
         * 被@人的手机号(在content里添加@人的手机号)
         */
        private List<String> atMobiles;
        /**
         * 是否@所有人
         */
        private boolean isAtAll;

        public List<String> getAtMobiles() {
            return atMobiles;
        }

        public void setAtMobiles(List<String> atMobiles) {
            this.atMobiles = atMobiles;
        }

        public boolean isAtAll() {
            return isAtAll;
        }

        public void setAtAll(boolean atAll) {
            isAtAll = atAll;
        }
    }


}
