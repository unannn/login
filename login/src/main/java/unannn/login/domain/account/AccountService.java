package unannn.login.domain.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    final AccountRepository accountRepository;

    public void login(LoginUser loginUser){
        
    }

}
