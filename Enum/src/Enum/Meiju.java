package Enum;

public enum Meiju {

	China("�й�")/* {@Override public void show(){} */, USA("����"), Japan("�ձ�");
	// public abstract void show();
	private String Country;

	private Meiju(String Country) {
		this.Country = Country;
	}

	public String getName() {
		return Country;
	}

//	public String toString() {
//		return Country;
//	}
}
