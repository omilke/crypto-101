package de.omilke.crypto101.mac.common;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HmacCalculatorTest {


    @Test
    public void verifyEqualInputProvidesSameMac() throws Exception {

        byte[] first = HmacCalculator.calculateHmac("test", Constants.SHARED_SECRET);
        byte[] second = HmacCalculator.calculateHmac("test", Constants.SHARED_SECRET);

        Assertions.assertThat(first).isEqualTo(second);

    }

    @Test
    public void verifyDifferentKeyProvidesDifferentMac() throws Exception {

        byte[] first = HmacCalculator.calculateHmac("test", Constants.SHARED_SECRET);
        byte[] second = HmacCalculator.calculateHmac("test", Constants.SHARED_SECRET + "suffix");

        Assertions.assertThat(first).isNotEqualTo(second);

    }
}