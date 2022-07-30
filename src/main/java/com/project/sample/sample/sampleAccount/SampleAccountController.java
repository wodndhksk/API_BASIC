package com.project.sample.sample.sampleAccount;

import com.project.sample.sample.sampleAccount.service.SampleAccountService;
import com.project.sample.sample.sampleAccount.service.impl.SampleAccountServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Date : 2022. 7. 30.
 * @author : jaewoo
 * @RestController 설명 : select, insert 간단 테스트
 */
@RestController
@RequestMapping("/sample/account")
public class SampleAccountController {

    private final SampleAccountService accountService;

    /**
     * 의존성 주입은 필드 주입보다는 생성자 주입을 권장. (생성자의 매개변수가 하나라면 @Autowired 어노테이션 생략가능)
     * @param accountServiceImpl
     */
    public SampleAccountController(SampleAccountServiceImpl accountServiceImpl) {
        this.accountService = accountServiceImpl;
    }

    /**
     * @Method Name : sampleSignUp
     * @Date : 2022. 7. 30.
     * @author : jaewoo
     * @Method 설명 : url 에서 name 을 받아 데이터베이스 'tbl_sample_account' 에 저장 (INSERT)
     * @return
     */
    @GetMapping("/sign-up")
    public void sampleSignUp(@RequestParam String name){
        String password = "1234";
        accountService.crateAccount(name, password);
    }

    /**
     * @Method Name : sampleSelectAllAccount
     * @Date : 2022. 7. 30.
     * @author : jaewoo
     * @Method 설명 : 전체회원 조회 API (SELECT)
     * @return
     */
    @GetMapping("/all")
    public ResponseEntity<List<SampleAccount>> sampleSelectAllAccount(){
        return ResponseEntity.ok().body(accountService.getAllAcount());
    }


}
