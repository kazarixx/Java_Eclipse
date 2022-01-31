class oddSum_evenSum {
	public static void main(String[] args) {            
		// 変数numbersに、与えられた数字の配列を代入         
         int numbers[] = {1, 4, 6, 9, 13, 16};           
             int oddSum = 0;            
             int evenSum = 0;            
                                                 
        // for文を用いて、配列numbersの偶数の和と奇数の和を求める          
          for(int i =0; i<numbers.length; i++){            
              if(numbers[i] % 2 == 1){            
                 oddSum = oddSum+numbers[i];            
                 }else{            
                 evenSum = evenSum+numbers[i];            
                }
          }
	}
}
