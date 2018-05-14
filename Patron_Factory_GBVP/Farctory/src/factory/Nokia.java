
package factory;

public class Nokia implements Mobile{
    private int ramSize;
    private String processor;

    public Nokia(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
    
}
