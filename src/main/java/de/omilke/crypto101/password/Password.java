package de.omilke.crypto101.password;

import org.mindrot.jbcrypt.BCrypt;

public class Password {

    private final String hashedPassword;

    public Password(String plainPassword) {

        this.hashedPassword = hashPassword(plainPassword);
    }

    public boolean matches(String plainPassword) {

        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

    private String hashPassword(String plain) {

        return BCrypt.hashpw(plain, BCrypt.gensalt(12));
    }
}
