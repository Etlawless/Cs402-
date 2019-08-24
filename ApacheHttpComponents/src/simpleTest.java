
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.methods.HttpGet;
public class simpleTest {
public static void main (String args[]) throws IOException {
CloseableHttpClient client = HttpClients.createDefault();
HttpGet request = new HttpGet("http://www.cs.nuim.ie");
CloseableHttpResponse response = client.execute(request);
// Get the response
BufferedReader rd = new BufferedReader
 (new InputStreamReader(response.getEntity().getContent()));

String line = "";
while ((line = rd.readLine()) != null) {
 System.out.println(line);
}
response.close();
client.close();
}
}
