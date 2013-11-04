package BrainTeaser;

public class FireCracker2 {

	/**
	 * @param args
		第二年
		还是放炮这个题，具体情形参见第一季第一题。
		现在换另外一种情况，小雪喜欢龙飞，龙飞也喜欢小雪，因为龙飞放的快，小雪玩得慢，所以龙飞放完了，
		就去玩小雪的了，因为需要去小雪那里拿过来，所以龙飞由开始的每隔两秒燃放时间外，需要额外增加取炮的时间３秒，
		问大家都放完时，共可以听到多少响？
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daidai=100,longfei=100,xiaoxue=100;
		int count = 0;
		boolean flag = false;
		


		for (int i=0;;i++){
			flag = false;
			
			if (daidai>0){
				flag = true;
				daidai--;
			}
			if (i%2==0&&longfei>0){
				flag = true;
				longfei--;
			}
			
			if(longfei==0 && (i-3)%5==3 && xiaoxue>0){//198s 龙飞放完，203秒开始放小雪那里的第一个
				xiaoxue--;
			}else if (longfei==0 && (i-3)%5==0 && xiaoxue>0){
				flag = true;
			}
			
			if (i%3==0&&xiaoxue>0){
				flag = true;
				xiaoxue--;
			}
			
			if(flag){
				count++;
			}
			
			if (daidai==0&&longfei==0&&xiaoxue==0){
				break;
			}
			
		}
		System.out.println(count);
	}

}
