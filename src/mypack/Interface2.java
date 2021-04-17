package mypack;

@FunctionalInterface
public interface Interface2 {

	void method2();
	//void metho3();
	default void log(String str){
		System.out.println("I2 logging::"+str);
	}

}