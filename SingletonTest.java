
public class SingletonTest {

	public static void main(String[] args) {
		Renban renbanA = Renban.getInstance();
		Renban renbanB = Renban.getInstance();

		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanB.getNumber());
		System.out.println(renbanA.getNumber());
		System.out.println(renbanB.getNumber());
	}
}

class Renban {
	private static Renban jittai = new Renban();
	private int code;

	private Renban() {
		this.code = 0;
	}

	public static Renban getInstance() {
		return jittai;
	}

	public String getNumber() {
		code++;
		String renban;
		if (code <= 9999) {
			renban = String.format("%04d", code);
		} else {
			renban = "番号切れです";
		}
		return renban;

	}

}