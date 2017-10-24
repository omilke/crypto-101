package de.omilke.crypto101.mac.common;

public class Constants {

    //the "secret" to be used in HMAC calculation
    //NOTE: this is an example. The fact that the "secret" is plainly available with the sources beats the purpose of a secret.
    public static final String SHARED_SECRET = "the-sceret";

    //Algorithm to use in HMAC calculation
    public static final String HASH_FUNCTION = "Hmac-SHA384";

}
