package org.oep.ssomgt.util;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.util.encoders.Base64;

public class SecurityUtil {
	public static Key randomKey() {
		Key key = null;
		SecureRandom rand = new SecureRandom();
		KeyGenerator generator;
		try {
			generator = KeyGenerator.getInstance("AES");
			generator.init(rand);
			generator.init(128);
			key = generator.generateKey();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return key;
	}

	public static String randomKeyBase64() {
		Key key = null;
		SecureRandom rand = new SecureRandom();
		KeyGenerator generator;
		try {
			generator = KeyGenerator.getInstance("AES");
			generator.init(rand);
			generator.init(128);
			key = generator.generateKey();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new String(Base64.toBase64String(key.getEncoded()));
	}

	public static String encrypt(String input, String key) {
		byte[] crypted = null;
		try {
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, skey);
			crypted = cipher.doFinal(input.getBytes());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return new String(Base64.encode(crypted));
	}

	public static String decrypt(String input, String key) {
		byte[] output = null;
		try {
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, skey);
			output = cipher.doFinal(org.apache.commons.codec.binary.Base64.decodeBase64(input));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return new String(output);
	}

	public static String encrypt(String input, Key skey) {
		byte[] crypted = null;
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, skey);
			crypted = cipher.doFinal(input.getBytes());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return new String(org.apache.commons.codec.binary.Base64.encodeBase64(crypted));
	}

	public static String decrypt(String input, Key skey) {
		byte[] output = null;
		try {
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, skey);
			output = cipher.doFinal(Base64.decode(input));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return new String(output);
	}
	
}
