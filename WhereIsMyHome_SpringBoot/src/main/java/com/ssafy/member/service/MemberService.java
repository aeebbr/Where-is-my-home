package com.ssafy.member.service;

import java.sql.SQLException;

import com.ssafy.member.dto.MemberDto;

public interface MemberService {

	int idCheck(String userId) throws Exception; // 아이디 중복검사
	void joinMember(MemberDto memberDto) throws Exception; // 회원가입
	MemberDto loginMember(String userId, String userPwd) throws Exception; // 로그인
	void deleteMember(String userId) throws SQLException; // 회원 탈퇴 
	MemberDto infoMember(String userId) throws SQLException;
	void modifyMember(MemberDto memberDto) throws SQLException;
	
}