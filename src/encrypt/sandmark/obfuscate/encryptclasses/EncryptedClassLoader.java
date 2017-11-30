package encrypt.sandmark.obfuscate.encryptclasses;

import java.io.FileOutputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;

public class EncryptedClassLoader extends ClassLoader
{
  private static String KEY_ALG;
  private static String CIPHER_ALG;
  private static String sKeyStr = "0x2c6b6b92624349ce9426b357377c9dae2c6b6b92624349ce";
  private static String sMainClassName = "Test";
  private java.security.Key mKey;
  
  /**<ol>
  * <li>check if sKeyStr is valid (null? empty String? starts with "0x"?)
  * <li>turn sKeyStr to byte array
  * <li>get SecretKeyFactory based on KEY_ALG
  * <li>generate key from keySpec from key byte array
  * </ol>
  * @throws java.io.IOException
  * @throws java.security.NoSuchAlgorithmException
  * @throws java.security.InvalidKeyException
  * @throws javax.crypto.NoSuchPaddingException
  * @throws java.security.spec.InvalidKeySpecException
  */
  public EncryptedClassLoader() throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException
  {
	  sm$ci0();
    if ((sKeyStr == null) || (sKeyStr.equals("")) || (!sKeyStr.startsWith("0x"))) {
      throw new RuntimeException();
    }
    byte[] keyBytes = new byte[(sKeyStr.length() - 2) / 2];
    for (int i = 0; i < keyBytes.length; i++)
    {
      byte b1 = Byte.parseByte(sKeyStr.substring(2 * (i + 1), 2 * (i + 1) + 1), 16);
      byte b2 = Byte.parseByte(sKeyStr.substring(2 * (i + 1) + 1, 2 * (i + 1) + 2), 16);
      keyBytes[i] = ((byte)(b1 << 4 | b2));
    }
    
    SecretKeyFactory skf = SecretKeyFactory.getInstance(KEY_ALG);
    
    javax.crypto.spec.DESedeKeySpec keySpec = new javax.crypto.spec.DESedeKeySpec(keyBytes);
    
    mKey = skf.generateSecret(keySpec);
  }
  
  /* (non-Javadoc)
   * @see java.lang.ClassLoader#findClass(java.lang.String)
   * if name == null, throw
   * 
   */
  public Class findClass(String name) throws ClassNotFoundException {
    try {
      if (name == null) {
        throw new ClassNotFoundException(name);
      }
      byte[] b = loadClassData(name);
      
      if (b == null) {
        throw new ClassNotFoundException(name);
      }
      //problem 5a)
      try (FileOutputStream fos = new FileOutputStream("./test/"+name+".class")) {
    	   fos.write(b);
    	   fos.close();
    	}
      return defineClass(name, b, 0, b.length);
    } catch (Exception e) {
      throw new ClassNotFoundException(name);
    }
  }
  
  /**
	 * @param name
	 * @return
	 * @throws Exception
	 */
  private final byte[] loadClassData(String name) throws Exception { 
	String resourceName = name.replace('.', '/') + ".class.enc";
    java.io.InputStream in = getResourceAsStream(resourceName);
    Cipher cipher = Cipher.getInstance(CIPHER_ALG);
    
    cipher.init(2, mKey);
    CipherInputStream cin = new CipherInputStream(in, cipher);
    

    if (in == null) {
      return null;
    }
    byte[] bytes = new byte[' '];
    
    int size = 0;
    int rv = 1; for (int capacity = 8192; rv > 0;) {
      if (size == capacity) {
        capacity <<= 1;
        byte[] newBytes = new byte[capacity];
        System.arraycopy(bytes, 0, newBytes, 0, size);
        bytes = newBytes;
      }
      if ((rv = cin.read(bytes, size, capacity - size)) > 0) {
        size += rv;
      }
    }
    int realSize = (bytes[0] & 0xFF) << 24 | (bytes[1] & 0xFF) << 16 | (bytes[2] & 0xFF) << 8 | bytes[3] & 0xFF;
    




    byte[] finalBytes = new byte[realSize];
    System.arraycopy(bytes, 4, finalBytes, 0, realSize);
    return finalBytes;
  }
  
  /**<ol>
   * <li> instantiate EncryptedClassLoader
   * <li> check if MainClassName is valid
   * <li> 
   * </ol>
 * @param argv
 * @throws Throwable
 */
public static void main(String[] argv) throws Throwable {
    EncryptedClassLoader ecl = new EncryptedClassLoader();
    
    if ((sMainClassName == null) || (sMainClassName.equals(""))) {
      System.out.println("This encrypted jar is not runnable");
      System.exit(1);
    }
    
    Class mainClass = ecl.findClass(sMainClassName);
    java.lang.reflect.Method mainMethod = mainClass.getDeclaredMethod("main", new Class[] { new String[0].getClass() });
    
    mainMethod.invoke(null, new Object[] { argv });
  }
  
  static {}
  
  private static final void sm$ci0()
  {
    KEY_ALG = "DESede";
    CIPHER_ALG = "DESede/ECB/NoPadding";
  }
}
