package useRetrofit.props;

import lombok.Data;

@Data
public class UserRequest {
    private Long id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String image;
    private String token;
}
