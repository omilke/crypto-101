package de.omilke.crypto101.mac.common;

public class Message {

    private final String plain;
    private final byte[] mac;

    public Message(String plain, byte[] mac) {

        this.plain = plain;
        this.mac = mac;
    }

    public String getPlain() {

        return plain;
    }

    public byte[] getMac() {

        return mac;
    }
}
