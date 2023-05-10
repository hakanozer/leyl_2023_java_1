package useInterface;

import utils.Util;

public class UserImpl implements IUser, IProfile {

    @Override
    public boolean userLogin(String email, String password) {
        int size = call(email);
        System.out.println("Email Chars Size: " + size);
        //Util util = new Util();
        //System.out.println( util.name );
        Util.name = "Site Name";
        String surname = "Bilmem";
        System.out.println( Util.name );
        return false;
    }

    @Override
    public boolean userSMSLogin(String gsm) {
        return false;
    }

    @Override
    public String userName(Long uid) {
        return null;
    }

    @Override
    public String userNewPassword(String email) {
        return null;
    }

    @Override
    public String userProfilePhotoPath(Long uid) {
        return null;
    }
}
