public class StringDisplayImpl extends DisplayImpl{
	private String string; // �\������ׂ�������
	private int width; // �o�C�g�P�ʂŌv�Z����������̕�

	public StringDisplayImpl(String string) { // �R���X�g���N�^�œn���ꂽ������string��
		this.string = string; // �t�B�[���h�ɋL�����Ă����B
		this.width = string.getBytes().length; // ����Ƀo�C�g�P�ʂ̕��̃t�B�[���h�ɋL��
	} // ���Ă����āA��Ŏg��

	public void rawOpen() {
		printLine();
	}

	public void rawPrint() {
		System.out.println("|" + string + "|"); // �O���"|"�����ĕ\��

	}

	public void rawClose() {
		printLine();
	}

	private void printLine() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
