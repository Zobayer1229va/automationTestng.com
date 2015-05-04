package amazon.com;

import commonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Zarif on 4/25/2015.
 */
public class SignUp extends Base{
    @Test
    public void signIn()throws InterruptedException{
        sleepFor(3);
        clickByCss("#nav-tools #nav-link-yourAccount .nav-line-1");
        clickByCss(".nav-action-inner");
        sleepFor(4);
        //type email address
        typeByCss("#ap_email"," zobayer.fakir");
        sleepFor(2);
        //click radio button
        clickByCss("#ap_signin_existing_radio");
        sleepFor(2);
        //type password
        typeByCss("#ap_password","zob721966");
        //click sumition button
        clickByCss("#signInSubmit-input");
        sleepFor(3);

    }
}
