package com.ocp_example.common;

import sun.security.provider.SecureRandom;

import java.util.Base64;

//RandomStringGenerator a class to get a realistic random string for the link
//use it if you want simply - RandomStringGenerator.generate()
public class RandomStringGenerator {
    private static final SecureRandom random = new SecureRandom();
    private static final Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
    public static String generate() {
        byte[] buffer = new byte[20];
        random.engineNextBytes(buffer);
        return encoder.encodeToString(buffer);
    }
}
