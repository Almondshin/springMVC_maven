package com.springmvc_maven.dao.user;

import com.springmvc_maven.vo.user.UserInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
/* 회원정보 테이블 작업 (user_info) */
public interface UserDao {

    // 회원 존재 여부 확인
    public Integer selectUserInfoCount(String userId);

    // 회원정보 1명 검색
    public UserInfoVO selectUserInfoOne(String userId);

    // 회원정보 전체 검색
    public List<UserInfoVO> selectUserInfoList();

    // 디폴트 권한 입력(가입)
    public void insertUserInfo(UserInfoVO vo);

    // 회원정보 삭제(탈퇴)
    public void deleteUserInfo(String userId);

    // 회원정보 수정
    public void updateUserInfo(UserInfoVO vo);

    // 특정 유저 조회
    public List<UserInfoVO> uniqueUserInfo(String unique);

}
