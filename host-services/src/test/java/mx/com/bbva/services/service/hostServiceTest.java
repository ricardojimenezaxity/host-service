package mx.com.bbva.services.service;

import mx.com.bbva.commons.to.UserTO;
import mx.com.bbva.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class hostServiceTest extends BaseTest {

    @Test
    public void exampleTest() {

        List<UserTO> users = this.hostService.getUsers();

        Assert.assertEquals(1, users.size());
    }
}
