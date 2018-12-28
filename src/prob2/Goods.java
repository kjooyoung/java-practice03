package prob2;

public class Goods {
	private String name;
	private int price;
	private int addNum;
	
	public Goods() {}
	
	public Goods(String name, int price, int addNum) {
		super();
		this.name = name;
		this.price = price;
		this.addNum = addNum;
	}

	public void showInfo() {
		System.out.println(name+"(가격:"+price
				+"원)이 "+addNum+"개 입고 되었습니다.");
	}
}
