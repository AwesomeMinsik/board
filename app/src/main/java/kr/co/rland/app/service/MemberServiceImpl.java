package kr.co.rland.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.app.entity.Member;
import kr.co.rland.app.repository.MemberRepository;
@Service
public class MemberServiceImpl implements MemberService {
    
    @Autowired
    private MemberRepository repository;

    @Override
    public boolean validate(String username, String password) {

    Member member = repository.findByMemberId(username,password);
        if(member==null)
            return false;
        // if(!member.getPwd().equals(password))
        //     return false;

    return true;
    }
    
}
