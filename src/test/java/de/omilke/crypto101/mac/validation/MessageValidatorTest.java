package de.omilke.crypto101.mac.validation;

import de.omilke.crypto101.mac.common.Constants;
import de.omilke.crypto101.mac.common.HmacCalculator;
import de.omilke.crypto101.mac.common.Message;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MessageValidatorTest {

    @Test
    public void testAcceptProperMessage() throws Exception {

        String exampleMessage = "test-message";

        Message message = new Message(exampleMessage, HmacCalculator.calculateHmac(exampleMessage, Constants.SHARED_SECRET));

        Assertions.assertThat(MessageValidator.accept(message)).isTrue();

    }

    @Test
    public void testAcceptWrongMessage() throws Exception {

        String exampleMessage = "test-message";

        Message message = new Message(exampleMessage, HmacCalculator.calculateHmac(exampleMessage, "wrong-key"));

        Assertions.assertThat(MessageValidator.accept(message)).isFalse();

    }
}