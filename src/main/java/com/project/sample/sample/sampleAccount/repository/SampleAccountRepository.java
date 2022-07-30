package com.project.sample.sample.sampleAccount.repository;

import com.project.sample.sample.sampleAccount.SampleAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleAccountRepository extends JpaRepository<SampleAccount, Integer> {
    /**
     * SampleAccount 데이터 전체 조회 (SELECT)
     * @return
     */
    List<SampleAccount> findAll();
}
