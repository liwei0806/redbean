package com.readbean.im.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class ChatLog extends BaseDomain implements Serializable {

  private static final long serialVersionUID = 7696107341437751296L;

  private Long fromUserId;//发送者用户ID
  private Long toUserId;//消息接收者用户ID
  private String content;//消息内容


}
