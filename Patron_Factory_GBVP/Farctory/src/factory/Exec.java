package factory;

public class Exec {
	 public static void main(String[] args) {
		Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
                                Mobile mobile1 = MobileFactory.createMobile(Mobile.LG);
                                Mobile mobile2 = MobileFactory.createMobile(Mobile.Huawei);
                                Mobile mobile3 = MobileFactory.createMobile(Mobile.Lenovo);
                                Mobile mobile4 = MobileFactory.createMobile(Mobile.Polaroid);
                                Mobile mobile5 = MobileFactory.createMobile(Mobile.Lanix);
                                Mobile mobile6 = MobileFactory.createMobile(Mobile.Nokia);

	}
}
