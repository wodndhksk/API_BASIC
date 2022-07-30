package com.project.sample.sample.sampleAccount.service;

import com.project.sample.sample.sampleAccount.SampleAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleAccountService {

    /**
     * 계정 생성
     * @param name
     * @param password
     */
    public void crateAccount(String name ,String password);

    /**
     * 회원 전체 조회
     * @return
     */
    List<SampleAccount> getAllAcount();
}
