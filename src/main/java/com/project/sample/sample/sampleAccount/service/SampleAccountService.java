package com.project.sample.sample.sampleAccount.service;

import com.project.sample.sample.sampleAccount.SampleAccount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleAccountService {

    public void crateAccount(String name ,String password);

    List<SampleAccount> getAllAcount();
}
