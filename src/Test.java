//演習①
public class Test {
	
	public static void main(String[] args){
		Person taro = new Person();
		//演習③
		//コンストラクタ①
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		//コンストラクタ②
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		//演習⑤
		//コンストラクタ③
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		//演習⑤
		//コンストラクタ④
		Person nanashi = new Person(25);
		System.out.println(nanashi.name);
		System.out.println(nanashi.age);
		
		//演習⑤
		//コンストラクタ⑤
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}

}
