package kr.co.rland.app.repository;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.app.entity.Member;

@Mapper
public interface MemberRepository {


    Member findByMemberId(String username, String password);
}
