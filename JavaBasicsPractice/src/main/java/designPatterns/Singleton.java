package designPatterns;

public class Singleton {
	
	private static volatile Singleton singletonInstance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(singletonInstance == null) 
		{			
			synchronized (Singleton.class) 
			{
				if(singletonInstance == null) 
				{
					singletonInstance = new Singleton();
				}
			}
		}		
		return singletonInstance;
	}
}

/*
 * Why Two Checks?
 * 
 * First Check - Avoids locking after object is created, Improves performance
 * 
 * Second Check - Ensures only one thread creates object
 * 
 */