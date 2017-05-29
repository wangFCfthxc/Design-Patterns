package Singleton;

// 貪婪單例模式 SingletionGreed
public class SingletonGreed {
	// 一開始建立物件,只要一直回傳這個物件就是簡單的singleton
	// 一開始就建立物件,也稱為貪婪模式(Greed Singleton)
	private static SingletonGreed instance = new SingletonGreed();
	// 私有建構式,這樣其他程式就沒辦法用new來取得新的實體
	private SingletonGreed(){}

	// 需要另外提供方法讓其他程式呼叫這個唯一的實體物件
	public static SingletonGreed getinstance(){
		return instance;
	}
}
