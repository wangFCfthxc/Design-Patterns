import Singleton.Singleton;

//單例模式測試
public class SingletonTest extends Thread{
	String myId;
	public SingletonTest(String myId){
		this.myId = myId;
	}
	
	// 執行緒執行的時候就去呼叫Singleton.getsingleton()
	public void run(){
		Singleton singleton = Singleton.getinstance();
		if(singleton != null){
			// 用hashCode判斷前後兩次的singleton物件是否為同一個
			System.out.println(myId + "產生Singleton:" + singleton.hashCode());
		}
	}
	
	public static void main(String[] args) {

		// 單執行緒的時候,s1與s2確實為同一個物件
//		Singleton s1 = Singleton.getinstance();
//		Singleton s2 = Singleton.getinstance();
//		System.out.println("s1:" + s1.hashCode());
//		System.out.println("s2:" + s2.hashCode());
//		System.out.println();

		
		// 兩個執行緒同時執行有機會得到不同的Singleton物件
		Thread t1 = new SingletonTest("執行緒T1");
		Thread t2 = new SingletonTest("執行緒T2");
		t1.start();
		t2.start();
	}

}
