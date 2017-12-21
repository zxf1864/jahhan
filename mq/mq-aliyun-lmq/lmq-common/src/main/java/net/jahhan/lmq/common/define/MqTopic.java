package net.jahhan.lmq.common.define;

/**
 * MQ的topic,传输质量默认：QoS1
 * tokenExpireTime、tokenType和tokenPermission使用token方式鉴权访问的时候，这两个字段才有效
 * Created by linwb on 2017/12/15 0015.
 */
public class MqTopic {
	private String topicName;
	private QoS qos = QoS.QoS1;
	/** token过期时间，默认两小时 */
	private long tokenExpireTime = 2 * 60 * 60 * 1000;
	/** token类型，默认是MQTT */
	private MqToken tokenType = MqToken.MQTT;

	/** token权限，默认是只读 */
	private MqTokenPermission tokenPermission = MqTokenPermission.R;

	public MqTopic(String topicName, QoS qos) {
		this.topicName = topicName;
		this.qos = qos;
	}

	public MqTopic(String topicName, QoS qos, MqToken tokenType, MqTokenPermission tokenPermission,
			long tokenExpireTime) {
		this(topicName, qos);
		this.tokenType = tokenType;
		this.tokenPermission = tokenPermission;
		this.tokenExpireTime = tokenExpireTime;

	}

	public QoS getQos() {
		return qos;
	}

	public void setQos(QoS qos) {
		this.qos = qos;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public long getTokenExpireTime() {
		return tokenExpireTime;
	}

	public void setTokenExpireTime(long tokenExpireTime) {
		this.tokenExpireTime = tokenExpireTime;
	}

	public MqToken getTokenType() {
		return tokenType;
	}

	public void setTokenType(MqToken tokenType) {
		this.tokenType = tokenType;
	}

	public MqTokenPermission getTokenPermission() {
		return tokenPermission;
	}

	public void setTokenPermission(MqTokenPermission tokenPermission) {
		this.tokenPermission = tokenPermission;
	}
}
