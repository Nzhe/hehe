package day01;


@SampleAnnoWons
public class Service { //클래스는 곧 타입이다.
	
	private int aaa;
	
	
//	@SampleAnnoWons //ElementType.CONSTRUCTOR 있어야함
	public Service() { //생성자

	}
	
	@SampleAnnoWons()
	public void mth01() { //메소드
		
	}
	
	@SampleAnnoWons("wons")
	public void mth02() { //메소드
		
	}
	
	@SampleAnnoWons(number=20)
	public void mth03() { //메소드
		
	}
	@SampleAnnoWons(value="y", number=20)
	public void mth04() { //메소드
		
	}

	public void mth05() { //메소드
		
	}

}
