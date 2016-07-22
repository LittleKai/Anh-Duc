import java.util.HashMap;


public class Main {

public static void main(String[] args) {
	HashMap<String, Double> product = new HashMap<>();
	product.put("A10", 200.6);
	product.put("A01", 100.0);
	product.put("B05", 150.5);
	product.put("D05", 250.0);
	product.put("D15", 250.0);
	String id = "";
	try
	{
		getProduct(id);
	System.out.println(product.get("A10"));
		}
	catch(NoSuchProductReception e){
		System.out.println(e.getMessage());
		}

	}

private static void getProduct(String id)throws NoSuchProductReception {
	// TODO Auto-generated method stub
	if (id.equals(""))
		throw new NoSuchProductReception("Khong co san phan nhu vay.");

	
}

}

