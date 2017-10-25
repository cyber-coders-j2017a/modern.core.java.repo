package InheritanceInJava.AutomationScenario;

/**
 * Created by beatriceotugo on 18/08/2017.
 */
public class LoginPage extends BasePage {


    public LoginPage(String driver) {
        super(driver);
    }

    public void displayDriver() {
        System.out.println(driver);
    }
}
