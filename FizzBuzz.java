
public class FizzBuzz {
//	1. 1から順番に数を表示する
//	2. その数が3で割り切れるなら"Fizz"、5で割り切れるなら"Buzz"、
//	両方で割り切れるなら"FizzBuzz" と表示する
	public static void main(String[] args){
		for(int i = 1; i <= 100; ++i){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
	}
}
