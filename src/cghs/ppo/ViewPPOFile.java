/*
 * package cghs.ppo;
 * 
 * import java.io.IOException; import java.io.OutputStream; import
 * java.util.Base64; import java.util.concurrent.TimeUnit;
 * 
 * import javax.servlet.ServletException; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import okhttp3.OkHttpClient; import
 * okhttp3.Request; import okhttp3.Response; public class ViewPPOFile extends
 * HttpServlet { private static final long serialVersionUID = 1L; public
 * ViewPPOFile() {
 * 
 * }
 * 
 * @Override protected void doGet (HttpServletRequest request1,
 * HttpServletResponse response1) throws ServletException, IOException {
 * System.out.println("CPAO Servlet");
 * 
 * doPost(request1,response1); }
 * 
 * @Override protected void doPost (HttpServletRequest request1,
 * HttpServletResponse response1) throws ServletException, IOException {
 * 
 * OutputStream outputStream = null;
 * 
 * try { OkHttpClient httpClient = new OkHttpClient.Builder() .connectTimeout(5,
 * TimeUnit.MINUTES) // connect timeout .writeTimeout(5, TimeUnit.MINUTES) //
 * write timeout .readTimeout(5, TimeUnit.MINUTES) // read timeout .build();
 * 
 * Response response = null; Request request = null; String
 * diaryNo=request1.getParameter("diaryNo"); if(diaryNo!=null)
 * diaryNo=diaryNo.trim(); //String diaryNo="PR320000734";
 * 
 * String url =
 * "http://10.246.75.205/GenerateCPAOPDF/cpao/generateCPAOPPOPDF/diaryNo/" +
 * diaryNo;
 * 
 * // send get request request = new
 * Request.Builder().url(url).header("Authorization",
 * "NDM0Y2I0NmNkNzRiMDQyZGQxMWRkYTZhNTRhNDE2OTYwM2U4NDgyODFiNTg2NzkxNjJiYzc2OWY4NzQ3OGFkNzhhOGYxNjAxZWY5ZTk3NWI3MDJlYWJmYzczOTVjYWJkMzU1NzE4MmEyYTRkOTVkNzQ5ZWFiYTJjNGMxMTRmYmY="
 * ).build();
 * 
 * response = httpClient.newCall(request).execute(); if
 * (!response.isSuccessful()) {
 * 
 * throw new IOException("Unexpected code " + response); }
 * 
 * // Get response body if (response.body() != null) { String responseStr =
 * response.body().string(); String base64Encoded =
 * responseStr.substring(responseStr.indexOf("<GetpdfFileResult>") + 18,
 * responseStr.indexOf("</GetpdfFileResult>")); byte[] decoder =
 * Base64.getDecoder().decode(base64Encoded);
 * response1.setContentType("application/pdf");
 * response1.setContentLength(decoder.length);
 * response1.setHeader("Content-disposition",
 * "inline; filename=\""+diaryNo+".pdf\""); outputStream =
 * response1.getOutputStream(); outputStream.write(decoder); }
 * 
 * 
 * } catch (Exception e) {
 * System.out.println("Exception in catch of try block in DisplayPPOFile:"+e.
 * getMessage()); }finally { try { if(outputStream != null)outputStream.close();
 * 
 * } catch(Exception e) { System.out.
 * println("Exception in catch of finally block in DisplayImageServlet:"+e.
 * getMessage()); }
 * 
 * } }
 * 
 * 
 * }
 */