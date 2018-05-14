package factory;

public class MobileFactory {
	public static Mobile createMobile(String type){
		if(type.equals(Mobile.IPHONE)){
			return new IPhone(2, "A9", "A9 GPu");
		}else if(type.equals(Mobile.SONY)){
			return new Sony(2,"ARM");
		}else if(type.equals(Mobile.SAMSUNG)){
			return new Samsung("Intel");
                                //Más anexados xD
                                }else if(type.equals(Mobile.LG)){
                                                return new LG(16, "DualCore");
		
                                }else if(type.equals(Mobile.Huawei)){
                                                return new Huawei(6, "Kirin750");
                                }else if(type.equals(Mobile.Lenovo)){
                                                return new Lenovo(4, "CualComm SnapDragon");
                                }else if(type.equals(Mobile.Nokia)){
                                                return new Nokia(8, "CualComm SnapDragon");
                                }else if(type.equals(Mobile.Polaroid)){
                                                return new Polaroid(6,"CuadCore");
                                }else if(type.equals(Mobile.Lanix)){
                                                return new Lanix(8,"CuadCore");
                               //Acaban los anexados     
                                }else{
			return null;
		}
	}
}
