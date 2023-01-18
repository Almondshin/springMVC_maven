package com.springmvc_maven.vo.user;

import lombok.Getter;
import lombok.Setter;

/* 사용자 정보 VO (user_info 테이블) */
@Getter
@Setter
public class UserInfoVO {
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userInitTime;


	@Override
	public String toString() {
		return "UserInfoVO{" +
				"userId='" + userId + '\'' +
				", userPw='" + userPw + '\'' +
				", userName='" + userName + '\'' +
				", userPhone='" + userPhone + '\'' +
				", userInitTime='" + userInitTime + '\'' +
				'}';
	}
}
