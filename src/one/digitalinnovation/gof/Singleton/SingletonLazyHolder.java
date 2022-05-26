package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * 
 * @author hugoayruth
 */
public class SingletonLazyHolder {
	
	
	private static class InstaHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstaHolder.instancia;
	}
}
