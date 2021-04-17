/*
 * package mypack;
 * 
 * import java.io.BufferedInputStream; import java.io.BufferedOutputStream;
 * import java.io.ByteArrayInputStream; import java.io.Closeable; import
 * java.io.FileNotFoundException; import java.io.FileOutputStream; import
 * java.io.IOException; import java.io.InputStream; import java.util.Base64;
 * import java.util.concurrent.TimeUnit;
 * 
 * import javax.faces.context.ExternalContext; import
 * javax.faces.context.FacesContext; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import com.squareup.okhttp.OkHttpClient; import com.squareup.okhttp.Request;
 * import com.squareup.okhttp.Response;
 * 
 * public class PdfGenerator2 extends HttpServlet { static HttpServletResponse
 * response = null;
 * 
 * public PdfGenerator2() { response.setContentType("application/pdf");
 * 
 * }
 * 
 * public static void main(String[] args) {
 * 
 * // TODO Auto-generated method stub
 * 
 * OkHttpClient httpClient = new OkHttpClient.Builder() .connectTimeout(5,
 * TimeUnit.MINUTES) // connect timeout .writeTimeout(5, TimeUnit.MINUTES) //
 * write timeout .readTimeout(5, TimeUnit.MINUTES) // read timeout .build();
 * 
 * 
 * OkHttpClient httpClient = new OkHttpClient();
 * 
 * Response response = null; Request request = null; String diaryNo =
 * "PR320000734";
 * 
 * try { String url =
 * "http://10.246.75.205/GenerateCPAOPDF/cpao/generateCPAOPPOPDF/diaryNo/" +
 * diaryNo; // send get request request = new
 * Request.Builder().url(url).header("Authorization",
 * "NDM0Y2I0NmNkNzRiMDQyZGQxMWRkYTZhNTRhNDE2OTYwM2U4NDgyODFiNTg2NzkxNjJiYzc2OWY4Nz"
 * +
 * "Q3OGFkNzhhOGYxNjAxZWY5ZTk3NWI3MDJlYWJmYzczOTVjYWJkMzU1NzE4MmEyYTRkOTVkNzQ5ZWFiYTJjNGMxMTRmYmY=")
 * .build();
 * 
 * response = httpClient.newCall(request).execute(); if
 * (!response.isSuccessful()) {
 * 
 * throw new IOException("Unexpected code " + response); }
 * 
 * // Get response body if (response.body() != null) { String responseStr =
 * response.body().string(); String base64Encoded =
 * responseStr.substring(responseStr.indexOf("<GetpdfFileResult>") + 18,
 * responseStr.indexOf("</GetpdfFileResult>"));
 * System.out.println("base64Encoded " + base64Encoded); byte[] decoder =
 * Base64.getDecoder().decode(base64Encoded); // new
 * Validator().showMessageForSuccess("File Downloaded Successfully");
 * System.out.println("decoder " + decoder);
 * 
 * showPDF(decoder); } } catch (Exception e) { throw new RuntimeException(e); }
 * 
 * }
 * 
 * @SuppressWarnings("null") public static void showPDF(byte[] pdfBytes) {
 * System.out.println("pdfBytes " + pdfBytes);
 * 
 * // FacesContext facesContext = FacesContext.getCurrentInstance(); //
 * ExternalContext externalContext = facesContext.getExternalContext();
 * 
 * BufferedInputStream input = null; BufferedOutputStream output = null; int
 * DEFAULT_BUFFER_SIZE = 10240; String fileOutput="D://rama.pdf"; try
 * (FileOutputStream fos = new FileOutputStream(fileOutput)) {
 * fos.write(pdfBytes); } catch (FileNotFoundException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } catch (IOException e) { //
 * TODO Auto-generated catch block e.printStackTrace(); } } }
 */