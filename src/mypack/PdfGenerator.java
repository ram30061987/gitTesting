package mypack;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class PdfGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getXml();

}
	
	public static String getXml() {
        System.out.println("get Xml method..");
        //Code to make a webservice HTTP request
        String responseString = "";
        String outputString = "";
        String diaryNo="PR320000734";
    	String wsURL = "http://10.246.75.205/GenerateCPAOPDF/cpao/generateCPAOPPOPDF/diaryNo/" + diaryNo;

        try {
           // String auth_prm = UserName + ":" + Password;
            //byte[] encoded = Base64.getEncoder().encode(auth_prm.getBytes());
            URL url = new URL(wsURL);
            URLConnection connection = url.openConnection();
            
            System.out.println("connection"+connection.getURL());
            HttpURLConnection httpConn = (HttpURLConnection) connection;
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            String xmlInput = "";

            byte[] buffer = new byte[xmlInput.length()];
            buffer = xmlInput.getBytes();
            bout.write(buffer);
            byte[] b = bout.toByteArray();
           // httpConn.setRequestProperty("Content-Length", String.valueOf(b.length));
            //httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            httpConn.setRequestMethod("GET");
            httpConn.setRequestProperty("Authorization", "NDM0Y2I0NmNkNzRiMDQyZGQxMWRkYTZhNTRhNDE2OTYwM2U4NDgyODFiNTg2NzkxNjJiYzc2OWY4NzQ3OGFkNzhhOGYxNjAxZWY5ZTk3NWI3MDJlYWJmYzczOTVjYWJkMzU1NzE4MmEyYTRkOTVkNzQ5ZWFiYTJjNGMxMTRmYmY=");
            httpConn.setDoOutput(true);
            httpConn.setDoInput(true);
            OutputStream out = httpConn.getOutputStream();
            out.write(b);
            out.close();
            InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
            BufferedReader in = new BufferedReader(isr);
            while ((responseString = in.readLine()) != null) {
                outputString = outputString + responseString;
            }
            System.out.println("outputString "+outputString);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("output string===" + outputString);
        return outputString;
    }

}