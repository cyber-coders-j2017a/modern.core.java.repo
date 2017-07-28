package fullcodes.session.inheritanceInJava.v03;

/**
 * Created by dotcom on 7/28/17.
 */
public class LoginPage extends BasePage {


    private String driver;

    public LoginPage(String driver) {
        super(driver);
        this.driver = driver;
    }

    public void showDriver(){
        System.out.println(driver);
    }
}
