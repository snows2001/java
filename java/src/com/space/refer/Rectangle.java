class Rectangle {
    int width;
    int height;
    Point point;

    public Rectangle() {
    	point = new Point(0, 0);
    }
    public Rectangle(Point point) {
    	this.point = point;
    }
    public Rectangle(int width, int height) {
    	this.point = new Point(0, 0);
    	this.width = width;
    	this.height = height;
    }
    public Rectangle(Point point, int width, int height) {
    	this.point = point;
    	this.width = width;
    	this.height = height;
    }
    public void move(int x, int y) {
    	point.x = x;
    	point.y = y;
    }
    public int getArea() {
        return width * height;
    }
}





class Seller {

	//사과개수 변수 선언
	//바나나개수 변수 선언
	//수입 변수 선언
	
	//주문 개수만큼 과일을 파는 메소드구현(과일 개수가 줄겠지?), 
    //과일 총 판매금액을 리턴해준다.
	public int sell(int appleCount, int bananaCount) {}

	//구매자로 부터 받은 돈을 내 수입으로 포하는 메소드
	public void takeMoney(int total) {}
}

class Buyer {
	//구매자가 보유하고 있는 금액 변수 선언
	
	//원하는 Seller 객체에게 사고 싶은 사과 개수,
    // 바나나 개수를 판매하라고 하고
	//구매액을 받아오면 바로 금액을 지급한다.
	//지급하는 행위는 giveMoney()을 호출한다.
	void order(Seller seller, 
			int appleCount, int bananaCount) {}
	
	//나의 보유 금액을 줄이고
	//Seller에게 돈을 준다.
	void giveMoney(Seller seller, int total) {}
}
