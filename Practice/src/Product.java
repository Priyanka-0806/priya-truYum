import java.util.Scanner;

public class Product {
	private long productId;
	private int qtyOnHand;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public boolean purchase(int qty) {
		qtyOnHand+=qty;
		return true;
	}
	public boolean sales(int qty) {
    	if(qtyOnHand>=qty) {
    		qtyOnHand-=qty;
    		return true;
    	}else {
    		System.out.println("Insufficient Qty");
    		 return false;
    	}
		
	}
	public static void main(String[] args) {
		Product p=new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id:");
		p.setProductId(Long.parseLong(sc.nextLine()));
		System.out.println("Enter the qty on hand:");
		p.qtyOnHand=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the qty to be purchase:");
		int qty=sc.nextInt();
		p.purchase(qty);
		System.out.println("Enter the qty to be sales:");
		int sale=sc.nextInt();
		if(p.sales(sale)) {
			System.out.println("Qty On Hand:  "+ p.qtyOnHand);
		}else {
			System.out.println("Qty On Hand:  "+ p.qtyOnHand);
		}
				
	}
	

}
