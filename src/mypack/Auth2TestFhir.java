package mypack;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.json.simple.JSONObject;

public class Auth2TestFhir {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		String url = "https://api.ors.gov.in/openAPI/fhir/read/oauth2/token";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("client_id", "nic_testuser");
		jsonObject.put("client_secret", "4xCFANtGCD0HBY4Zi4EJavUpmB8eFjQC");
		jsonObject.put("grant_type", "client_credentials");
		System.out.println(jsonObject.toString());
		HttpEntity<Object> entity = new HttpEntity<Object>(jsonObject, headers);
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
			System.out.println(responseEntity.getStatusCode());
			System.out.println(responseEntity.getBody());		
			System.out.println(""+HttpStatus.CREATED);
			if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
				try {
                       //if created you can do anything 
				} catch (Exception e) {
					throw new RuntimeException("JSONException occurred");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
