package org.automation.utilities;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class SignatureGenerator {

    public static String generateSignature(String publicKey, String jsonString, String secretKey) {
        String text = publicKey + jsonString + publicKey;
        byte[] hashedBytes = Hashing.hmacSha512(secretKey.getBytes())
                .hashString(text, StandardCharsets.UTF_8).toString().getBytes();
        return Base64.getEncoder().encodeToString(hashedBytes);
    }

    // remove
    public static void main(String[] args) {
        String publicKey = "";
        String jsonString = "{\"order_id\":\"ebdc1622-abee-43a3-aaa8-1d1ac64cbf6d\"}";
        String secretKey = "";
        String signature = generateSignature(publicKey, jsonString, secretKey);
        System.out.println(signature);
    }
}
