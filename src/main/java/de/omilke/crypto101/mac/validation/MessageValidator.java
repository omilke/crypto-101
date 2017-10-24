package de.omilke.crypto101.mac.validation;

import de.omilke.crypto101.mac.common.Constants;
import de.omilke.crypto101.mac.common.HmacCalculator;
import de.omilke.crypto101.mac.common.Message;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MessageValidator {


    public static boolean accept(Message message) throws NoSuchAlgorithmException, InvalidKeyException {

        //calculate HMAC of the plain message...
        byte[] bytes = HmacCalculator.calculateHmac(message.getPlain(), Constants.SHARED_SECRET);

        //... in order to compare with given HMAC, thus proving the sender's knowledge of the secret
        return Arrays.equals(message.getMac(), bytes);
    }

}
