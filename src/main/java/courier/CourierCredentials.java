package courier;

import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

@Data
public class CourierCredentials {
    private String login;
    private String password;

    public CourierCredentials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static CourierCredentials from(Courier courier) {
        return new CourierCredentials(courier.getLogin(), courier.getPassword());
    }

    public static CourierCredentials emptyPassword(Courier courier) {
        return new CourierCredentials(courier.getLogin(), "");
    }

    public static CourierCredentials credsNotFound(Courier courier) {
        return new CourierCredentials(RandomStringUtils.randomAlphanumeric(10) + "@example.com", RandomStringUtils.randomAlphanumeric(10));
    }
}
