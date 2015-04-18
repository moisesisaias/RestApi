package restclient;

public class RestClient {

  
    public static void main(String[] args) {
       
        SimClient client = new SimClient();
        String id = "1";
        
        String result = client.getInfo(id);
        
        System.out.println(result);
        
        
    }
    
}
