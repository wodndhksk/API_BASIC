package com.project.sample.sample.sampleAccount.service.impl;

import com.project.sample.sample.sampleAccount.SampleAccount;
import com.project.sample.sample.sampleAccount.repository.SampleAccountRepository;
import com.project.sample.sample.sampleAccount.service.SampleAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class SampleAccountServiceImpl implements SampleAccountService {

    @Autowired
    private SampleAccountRepository accountRepository;

    /**
     * 회원 정보 저장
     * @param name
     * @param password
     */
    @Override
    public void crateAccount(String name, String password) {
        SampleAccount account = SampleAccount.builder()
                .name(name)
                .password(password)
                .friendId(randomCode())
                .build();
        accountRepository.save(account);
    }

    /**
     * 회원 전체 조회
     * @return
     */
    @Override
    public List<SampleAccount> getAllAcount() {
        return accountRepository.findAll();
    }

    /**
     * 회원 코드 랜덤 생성 (테스트용)
     * @return
     */
    public String randomCode(){
        Random random = new Random();
        int code = random.nextInt(10000);
        return String.format("%04d", code); //빈자리 0으로 채워서 4자리수 리턴
    }
}
