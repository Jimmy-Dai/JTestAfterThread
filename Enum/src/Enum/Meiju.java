package Enum;

public enum Meiju {

	China("中国")/* {@Override public void show(){} */, USA("美国"), Japan("日本");
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
