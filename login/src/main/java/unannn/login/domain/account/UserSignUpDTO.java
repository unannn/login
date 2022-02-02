package unannn.login.domain.account;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserSignUpDTO {
    private String userId;
    private String userPassword;
    private String userPasswordCheck;
    private String userName;
    private String userEmail;
    private String userPhoneNumber;
}
