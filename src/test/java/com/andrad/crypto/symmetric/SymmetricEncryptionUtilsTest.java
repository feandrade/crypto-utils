package com.andrad.crypto.symmetric;



import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import javax.xml.bind.DatatypeConverter;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SymmetricEncryptionUtilsTest {

    @Test
    void generateSymmetricKey() throws Exception {
        SecretKey key = SymmetricEncryptionUtils.createAESKey();
        assertNotNull(key);
        System.out.println(DatatypeConverter.printHexBinary(key.getEncoded()));
    }


}