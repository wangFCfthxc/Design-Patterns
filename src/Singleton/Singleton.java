package Singleton;

/*
 * 參考博碩.7天學會設計模式.Yan
 * 由Panda複製,僅供學習使用
 */
//單例模式 Singletion
public class Singleton {
	// 因為建立物件要花很多資源,因此一開始就不先建立物件
	private static Singleton instance;

	// 私有建構式
	private Singleton() {
		// 假設好多code
		// 建立物件需要花費很多資源
	}

	// 另外提供方法讓其他程式呼叫
	// 多執行緒時使用synchronized保證Singleton一定是單一的
	public static Singleton getinstance() {
		// synchronized只有要鎖住new Singleton()這段程式碼
		// 效能,比鎖住整個getinstance方法好
		synchronized (Singleton.class) {
			// 第一次被呼叫的時候,singleton為null,要建立物件
			if (instance == null) {
				instance = new Singleton();
			}
		}
		// 已經有物件存在,直接回傳這個物件
		return instance;
	}
}
