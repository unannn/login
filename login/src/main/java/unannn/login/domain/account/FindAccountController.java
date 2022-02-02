package unannn.login.domain.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users/find")
public class FindAccountController {
    //아이디찾기 뷰
    @GetMapping("/users/find/id")
    public String findIdForm(){
        return "template/findIdForm";
    }

    //아이디찾기 처리
    @PostMapping("/users/find/id")
    public String findId(){
        return "redirect:/users/find/id";
    }

    //비밀번호 찾기 뷰
    @GetMapping("/users/find/password")
    public String findPasswordForm(){
        return "template/findIdForm";
    }

    //비밀번호 찾기 처리
    @PostMapping("/users/find/password")
    public String findPassword(){
        return "";
    }
}
