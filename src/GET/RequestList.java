package GET;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RequestList {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {
		RequestList http = new RequestList();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
	}

	private void sendGet() throws Exception {

		String url = "http://mobile.ecifm.net/requestcentral/services/download/requestList?name=Acharya&pass=password";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		/*System.out.println(response.toString());*/

		JSONParser parser = new JSONParser();
		Object obj1 = parser.parse(response.toString());
		JSONObject jsonObject = (JSONObject) obj1;

		@SuppressWarnings("unchecked")
		Set<String> set = jsonObject.keySet();

		Iterator iterator = set.iterator();

		String finalMerge = "";
		// check values
		int counter = 0;
		while (iterator.hasNext()) {
			
			String key = (String) iterator.next();
			
			//*******************Enter Key*****************
			/*System.out.println(key);*/
			
			JSONObject jsonObject2 = (JSONObject) jsonObject.get(key);
			Set<String> set2 = jsonObject2.keySet();
			Iterator<String> iterator2 = set2.iterator();
			
			String merge = "";
			while(iterator2.hasNext()){
				String key2 = (String) iterator2.next();
				merge = merge+"\t"+jsonObject2.get(key2);
			}
			
			try (PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter("D:/requestlist.txt", true)))) {
				out.println(key + merge);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
