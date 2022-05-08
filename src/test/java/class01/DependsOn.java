package class01;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void lgoin(){

    }

    @Test(dependsOnMethods = "login")
    public void verificationOfDashboard(){

    }

}
