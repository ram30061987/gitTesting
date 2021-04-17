/*
 * package digitalsign;
 * 
 * import java.io.File; import java.security.PrivateKey; import
 * java.security.PublicKey;
 * 
 * import javax.crypto.KeyGenerator;
 * 
 * import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
 *//**
	 * The Class TestDigitalSignature is used to test the concept of digital
	 * signature for a plain string.
	 * 
	 * @author <a href="mailto:debadatta.mishra@gmail.com">Debadatta Mishra</a>
	 * @since 2013
	 */
/*
 * public class DigitalDummy {
 *//**
	 * Creates the keys.
	 */
/*
 * public static void createKeys() { if (!new File("keys" + File.separator +
 * "privatekey.key").exists() && !new File("keys" + File.separator +
 * "publickey.key") .exists()) { KeyGenerator keyGen = new KeyGenerator();
 * keyGen.storeKeyPairs("keys"); System.out
 * .println("Private key and Public Keys generated successfully..."); } }
 *//**
	 * Generate digital signature.
	 * 
	 * @param secretInfoStr  the secret info str
	 * @param privateKeyPath the private key path
	 * @return the byte[]
	 */
/*
 * public static byte[] generateDigitalSignature(String secretInfoStr, String
 * privateKeyPath) { PrivateKey privateKey =
 * KeyUtil.getStoredPrivateKey(privateKeyPath); byte[] signedDataBytes =
 * DigitalSignatureUtil.getDigitalSignature( secretInfoStr, privateKey); return
 * signedDataBytes; }
 *//**
	 * Verify digital signature.
	 * 
	 * @param secretInfoStr   the secret info str
	 * @param signedDataBytes the signed data bytes
	 * @return true, if successful
	 */
/*
 * public static boolean verifyDigitalSignature(String secretInfoStr, byte[]
 * signedDataBytes) { PublicKey publicKey = KeyUtil.getStoredPublicKey("keys" +
 * File.separator + "publickey.key"); boolean flag =
 * DigitalSignatureUtil.isTextAndSignatureValid( secretInfoStr, signedDataBytes,
 * publicKey); return flag; }
 *//**
	 * The main method.
	 * 
	 * @param args the arguments
	 * @throws Exception the exception
	 *//*
		 * public static void main(String[] args) throws Exception { // Create Keys if
		 * the keys do not exist createKeys(); String mySecretMsg =
		 * "This is my secret and authentic message ."; String privateKeyPath = "keys" +
		 * File.separator + "privatekey.key"; // Use Private key and Secret message to
		 * generate digital signature byte[] signedBytes =
		 * generateDigitalSignature(mySecretMsg, privateKeyPath); String
		 * digitalSignatureStr = new String(signedBytes);
		 * System.out.println("Digital Signature : \n" + digitalSignatureStr); // Verify
		 * Digital Signature boolean flag = verifyDigitalSignature(mySecretMsg,
		 * signedBytes); System.out.println("Digital Signature Verification Status : " +
		 * flag); } }
		 */