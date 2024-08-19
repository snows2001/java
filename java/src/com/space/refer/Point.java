class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}







//main()에서는 order() 외에는 호출하지 마시오.
//변수선언은 꼭 private 하지 않아도 됩니다.
//메소드 위에 주석을 달았지만,
//메소드를 수정 및 삭제하지 않는 한에서 여러분이 흐름상
//맞다고 생각하는 대로 코드 작성해도 됩니다.

//결과 : Seller는 Buyer가 산 과일 개수 만큼 
//과일 개수 줄어들고 수입이 증가되며,
//Buyer는 보유 금액이 감소하게 된다.

class MainTest {
	public static void main(String[] args) {		
		
	//Seller(보유사과개수, 보유바나나개수) 객체 2개 생성
	Seller s1 = new Seller(10, 20);	
	Seller s2 = new Seller(100, 200);		
	//Buyer(과일 살수 있는 총 보유 금액) 객체 3개 생성
	Buyer b1 = new Buyer(5000);
	Buyer b2 = new Buyer(3000);
	Buyer b3 = new Buyer(1000);
	//Buyer 형 모든 객체의 order 메소드 호출
	b1.order(s1, 2, 5);
	//위에 만든 모든 객체의 객체 변수 값 출력하기

	}
}

class Apple {
	//사과 1개당 가격 70원
}

class Banana {
	//바나나 1개당 가격 50원
}
