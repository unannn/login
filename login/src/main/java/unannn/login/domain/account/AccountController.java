package unannn.login.domain.account;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class AccountController {

    final AccountService accountService;

    //로그인 뷰
    @GetMapping("/login")
    public String loginForm(){
        return "template/loginForm";
    }

    //로그인 처리
    @PostMapping("/login")
    public String login(@ModelAttribute LoginUser loginUser, RedirectAttributes redirectAttributes){
        return "redirect:/";
    }


    //회원가입 뷰
    @GetMapping("/users/signup")
    public String signUpForm(){
        return "template/signUpForm";
    }

    //회원가입 처리
    @PostMapping("/users/signup")
    public String signUp(@ModelAttribute UserSignUpDTO user){
        return "";
    }
}
