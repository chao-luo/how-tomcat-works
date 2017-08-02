import ex03.pyrmont.connector.http.Constants;
import org.junit.Test;

import java.util.ResourceBundle;

/**
 * Created by chaoluo on 08/02/2017.
 */
public class ResourceBundleTest {

    @Test
    public void getResourceFromTestResource() throws Exception {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("LocalStrings");
        System.out.print(resourceBundle.getString("httpConnector.alreadyStarted"));
    }

    @Test
    public void testResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(Constants.Package + ".LocalStrings");
        System.out.print(resourceBundle.getString("httpConnector.alreadyStarted"));
    }

}
