package com.springmvc_maven.dao.user;

import com.springmvc_maven.vo.user.UserRememberMeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
/* Remember-me 인증 Token 작업 (user_remember_me 테이블) */
public interface UserRememberMeDao {

	// 토큰 정보 검색
	public UserDao selectUserToken(String series);

	// 특정 series 토큰 한 개 삭제
	public void deleteOneToken(String series);

	// 사용자 토큰 전체체 삭제
	public void deleteAllUserToken(String username);

	// 사용자 토큰 업데이트
	public void updateUserToken(UserRememberMeVO rememberMeVO);

	// 메일 인증 정보 업데이트
	public void updateUserCertifying(String series);

	// 사용자 토큰 첫 등록
	public void insertUserToken(UserRememberMeVO rememberMeVO);
}
