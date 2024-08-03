package week3.assignments.three;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}

	public void sendRequest
	
	(String endpoint, String requestbody, String requeststatus) {
		System.out.println(endpoint);
		System.out.println(requestbody);
		System.out.println(requeststatus);
	}

	public static void main(String[] arg) {
		APIClient client = new APIClient();
		client.sendRequest("https://someenpoint.ab.com/asdapi");
		client.sendRequest("https://someenpoint.ab.com/asdapi", "this is body", "init");
	}

}
