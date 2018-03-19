import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jsonString =
		"{\"id\":2,\"name\":\"Effective Java\",\"author\":\"Joshua Bloch\"}";
				
//				"{\"id\":73241232,\"name\":{\"first\":Aamir\"middle\":Hussain\"last\":Khan\"}location\":{\"name\":Mumbai\"cords\":{\"long\": 72.872075\"lat\": 19.075606}}\"imageId\"73241" +
//				"232.jpg \"followers\" :[{\"id\": 54543342\"imageid\":54543342.jpg \"name\":{\"first\":Anil\"middle\": \"last\":Kapoor}\"location\":{ \"name\":Delhi\"cords\":{ \"long\":23.23\"lat\":12.07}}}{\"id\":54543342\"imageid\":54543342."+
//				"jpg@@|\"name\":{\"first\":Amit\"middle\":\"last\":Bansal}\"location\":{\"name\":Bangalore\"cords\":{\"long\":<>\"lat\":<>}}}]}";
		Gson gson = new Gson();
        JsonElement element = gson.fromJson(jsonString, JsonElement.class);
        JsonObject jsonObject = element.getAsJsonObject();
        
        System.out.println(jsonObject.toString());

	}

}