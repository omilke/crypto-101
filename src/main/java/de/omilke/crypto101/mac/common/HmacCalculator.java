package de.omilke.crypto101.mac.common;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class HmacCalculator {

    public static byte[] calculateHmac(String plainMessage, String secret) throws NoSuchAlgorithmException, InvalidKeyException {

        // Create a Mac instance using Bouncy Castle as the provider
        // and the specified algorithm
        Mac mac = Mac.getInstance(Constants.HASH_FUNCTION, new BouncyCastleProvider());

        // Initialize using the key and update with the data to
        // generate the mac from
        SecretKeySpec key = new SecretKeySpec(secret.getBytes(), Constants.HASH_FUNCTION);
        mac.init(key);

        mac.update(plainMessage.getBytes());

        // Perform the mac operation
        return mac.doFinal();
    }

}
