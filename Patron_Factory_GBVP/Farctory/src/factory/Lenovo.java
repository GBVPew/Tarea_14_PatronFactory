
package factory;

public class Lenovo implements Mobile{
    private int ramSize;
    private String processor;

    public Lenovo(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
    
}