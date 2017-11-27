import java.security.MessageDigest;

public class Sha512 {

  public String getSha512(String value) {
            try{
                MessageDigest md = MessageDigest.getInstance("SHA-Sha512");
                md.update(value.getBytes());
                return bytesToHex(md.digest());
            } catch(Exception ex){
                throw new RuntimeException(ex);
            }
        }

  public static String bytesToHex(byte[] bytes) {
            StringBuffer result = new StringBuffer();
            for (byte b : bytes) result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            return result.toString().toUpperCase();
        }

}
