package mx.com.bbva.services.facade;

import mx.com.bbva.commons.to.UserTO;
import mx.com.bbva.services.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class hostFacadeTest extends BaseTest {

    @Test
    public void ShouldReturnAllUsers() {

        List<UserTO> users = this.hostFacade.getAllUsers();

        Assert.assertEquals(1, users.size());
    }
}