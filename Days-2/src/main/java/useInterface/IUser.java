package useInterface;

public interface IUser {

    int age = 33;

    boolean userLogin(String email, String password);
    boolean userSMSLogin( String gsm );
    String userName( Long uid );
    String userNewPassword( String email );

    default int call( String data ) {
        return data.length();
    }

}
