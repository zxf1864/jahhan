package com.cwgj.lmq.client;

import net.jahhan.lmq.client.intf.ILmqToken;
import net.jahhan.lmq.common.define.MqTopic;

import java.util.List;

/**
 * Created by linwb on 2017/12/18 0018.
 */
public class CwgjLmqToken implements ILmqToken{
    /**
     * 申请token
     */
    @Override
    public String applyToken(List<MqTopic> topicsList) {
        return "LzMT+XLFl5uQ6bDU0o4vUiD1tyZUuRMsRtiCs0jC/89YfYNDKkKbsD8SHE+oBvCx+rR6voF7GWM55H57d740BvTQ69MbuN0V3UPs/qdT5CVCvKP80Xo0WTyueZHxmSH3RFhfnieKruPKbKeh+/kYqXEJ2FHc7ldOM536K4f+b6h0zQbn/x8h7uBOALgUzpoVsGBb81BRxGSfBfMN2oDZc/Wl/2390vCnZpZTFyqqueze3810hZnBRp6k8thfY/w9GYV2gBJugDi0FLJU0VC/YGTq0wBOf3y7+Ct6Bp11Tmg=";
    }

    /**
     * 获取本地储存的token
     */
    @Override
    public String getLocalToken() {
        return "LzMT+XLFl5uQ6bDU0o4vUiD1tyZUuRMsRtiCs0jC/89YfYNDKkKbsD8SHE+oBvCx+rR6voF7GWM55H57d740BvTQ69MbuN0V3UPs/qdT5CVCvKP80Xo0WTyueZHxmSH3RFhfnieKruPKbKeh+/kYqXEJ2FHc7ldOM536K4f+b6h0zQbn/x8h7uBOALgUzpoVsGBb81BRxGSfBfMN2oDZc/Wl/2390vCnZpZTFyqqueze3810hZnBRp6k8thfY/w9GYV2gBJugDi0FLJU0VC/YGTq0wBOf3y7+Ct6Bp11Tmg=";
    }
}