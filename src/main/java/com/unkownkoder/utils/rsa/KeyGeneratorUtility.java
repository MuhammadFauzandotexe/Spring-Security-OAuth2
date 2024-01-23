package com.unkownkoder.utils;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class KeyGeneratorUtility {

    public static KeyPair generateRsaKey(){

        KeyPair keyPair;

        try{
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch(Exception e){
            throw new IllegalStateException();
        }

        return keyPair;
    }
}
