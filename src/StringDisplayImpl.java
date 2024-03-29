public class StringDisplayImpl extends DisplayImpl{
	private String string; // 表示するべき文字列
	private int width; // バイト単位で計算した文字列の幅

	public StringDisplayImpl(String string) { // コンストラクタで渡された文字列stringを
		this.string = string; // フィールドに記憶しておく。
		this.width = string.getBytes().length; // さらにバイト単位の幅のフィールドに記憶
	} // しておいて、後で使う

	public void rawOpen() {
		printLine();
	}

	public void rawPrint() {
		System.out.println("|" + string + "|"); // 前後に"|"をつけて表示

	}

	public void rawClose() {
		printLine();
	}

	private void printLine() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
