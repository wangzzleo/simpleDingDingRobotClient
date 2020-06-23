package com.wangzzleo.dingding.msg;


/**
 * @author wangzezhou
 */
public abstract class BaseDingDingMsg implements Comparable<BaseDingDingMsg> {

    private transient int weighting;
    String msgtype;

    @Override
    public int compareTo(BaseDingDingMsg o) {
        return o.weighting - this.weighting;
    }

    public int getWeighting() {
        return weighting;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }
}
