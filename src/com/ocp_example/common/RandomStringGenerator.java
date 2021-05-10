package com.ocp_example.common;

import sun.security.provider.SecureRandom;

import java.util.Base64;

public class RandomStringGenerator {
    private static final SecureRandom random = new SecureRandom();
    private static final Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
    public static String generate() {
        byte[] buffer = new byte[20];
        random.engineNextBytes(buffer);
        return encoder.encodeToString(buffer);
    }
}
