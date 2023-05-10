import props.Product;
import useInterface.IProfile;
import useInterface.IUser;
import useInterface.UserImpl;


public class AppMain {
    public static void main(String[] args) {

        UserImpl u1 = new UserImpl();
        IProfile u2 = new UserImpl();
        IUser u3 = new UserImpl();

        IUser u4 = new IUser() {
            @Override
            public boolean userLogin(String email, String password) {
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
        };

        //IUser.age = 40;
        System.out.println( IUser.age );

        Product p1 = new Product();
        p1.setPid(100);
        p1.setTitle("TV");
        p1.setDetail("TV Detay");
        p1.setPrice(20000);
        System.out.println( p1 );

        p1.setPid(101);
        p1.setTitle("TV-1");
        p1.setDetail("TV Detay-1");
        p1.setPrice(20001);
        System.out.println( p1 );

    }

    public void call( IUser iUser ) {

    }
}
