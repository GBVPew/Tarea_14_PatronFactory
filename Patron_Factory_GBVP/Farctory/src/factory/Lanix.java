
package factory;

public class Lanix implements Mobile{
    private int ramSize;
    private String processor;

    public Lanix(int ramSize, String processor){
		this.ramSize = ramSize;
		this.processor = processor;
	}
    
}