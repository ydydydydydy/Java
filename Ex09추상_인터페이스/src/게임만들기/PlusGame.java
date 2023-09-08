package 게임만들기;

public class PlusGame implements GameRule{
	   
	   int answer;
	   int num1;
	   int num2;

	   @Override
	   public int random() {
	      Random random = new Random();
	      int num = random.nextInt(10);
	      return num;
	   }

	   @Override
	   public String getQuizMsg() {
	      num1 = random();
	      num2 = random();
	      String quiz = num1 + "+" + num2 + "=";
	      return quiz;
	   }

	   @Override
	   public boolean checkAnswer(int ans) {
	      answer = num1 + num2;
	      boolean isCheck = false;
	      if(ans == answer) {
	         isCheck = true;
	      }
	      return isCheck;
	   }

	}