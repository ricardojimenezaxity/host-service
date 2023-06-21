package mx.com.bbva.services.service;

import mx.com.bbva.commons.to.UserTO;
import java.util.List;

public interface IhostService {

    List<UserTO> getUsers();
}
