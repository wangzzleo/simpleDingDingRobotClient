package com.wangzzleo.dingding.client;

import com.wangzzleo.dingding.msg.BaseDingDingMsg;

public interface DingDingClient {
    String sendMsg(BaseDingDingMsg msg);
}
