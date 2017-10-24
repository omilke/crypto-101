package de.omilke.crypto101.password;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordTest {

    @Test
    public void matches() throws Exception {

        final String examplePassword = "notAGoodPassword";

        Password password = new Password(examplePassword);


        assertThat(password.matches(examplePassword)).isTrue();
        assertThat(password.matches("some-other-pw")).isFalse();
    }

}