
package restclient;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;




public class SimClient {
    
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/RestAPI/webresources";

    public SimClient() {
        //ClientConfig config = new ClientConfig();
        //config = config.property(ClientProperties.CONNECT_TIMEOUT, 10000);
        //config = config.property(ClientProperties.READ_TIMEOUT, 10000);
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("data");
    }

    public String getInfo(String id) throws ClientErrorException {
        WebTarget resource = webTarget;
       if (id != null) {
            resource = resource.queryParam("id", id);
        }
        return resource.request().get(String.class);
        
    }

    public void close() {
        client.close();
    }
    
}
