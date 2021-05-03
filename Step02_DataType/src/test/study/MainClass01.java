package test.study;

public class MainClass01 {
	//run했을때 실행순서가 시작되는 main메소드
	public static void main(String[] args) {
		System.out.println("main메소드가 시작 되었습니다.");
		
		int num1= 10;
		num1= 20;
		
		byte num2=10;
		num2=20;
		//int type변수에 byte type변수안에 있는 값을 대입하기
		num1=num2;
		//byte type변수에 int type 변수안에 있는 값을 대입?
		//byte num3=num1; //문법오류(compile에러)
		
		//(byte)는 형변환(casteing)연산자이다.
		byte num3 =(byte)num1;
		
		double num4= 10.1; //묵시적인 double type
		double num5= 10.1d; //명시적인 double type
		float num6= 10.1f; //float는 반드시 명시적으로 만들어야 함
		
		//double type변수에 float type변수에 있는 값 대입하기
		num4=num6;
		
		//doucle type 변수에 있는 값을 float type에 담을때는 casting이 필요하다.
		float num7= (float)num4;
	}

}
