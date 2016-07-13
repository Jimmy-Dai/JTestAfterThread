package Enum;

public class EnumDemo {

	public static void main(String[] args) {
		Meiju mj = Meiju.China;
		System.out.println(mj);
		System.out.println(mj.getName());
		System.out.println("-----------------------------");

		Meiju m1 = Meiju.China;
		Meiju m2 = Meiju.USA;
		Meiju m3 = Meiju.Japan;
		System.out.println(m1.compareTo(m1));
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.compareTo(m3));
		System.out.println(m2.compareTo(m3));

		System.out.println("-----------------------------");
		System.out.println(m1.name());
		System.out.println(m2.name());
		System.out.println(m3.name());

		System.out.println("-----------------------------");
		System.out.println(m1.ordinal());
		System.out.println(m2.ordinal());
		System.out.println(m3.ordinal());

		System.out.println("-----------------------------");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());

		System.out.println("-----------------------------");
		Meiju m = Enum.valueOf(Meiju.class, "China");
		System.out.println(m.getName());

		System.out.println("-----------------------------");
		Meiju[] marr = Meiju.values();
		for (Meiju arr : marr) {
			System.out.println(arr);
			System.out.println(arr.getName());
		}
	}
}
