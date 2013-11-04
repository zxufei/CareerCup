package BrainTeaser;

public class FireCracker {

	/**
	 * @param args
	 * 过年了，小孩们放炮，现在有三个小孩：呆呆，龙飞，小雪，每一个人一支香，每人一百个炮（散），呆呆每隔一秒燃放一个，龙飞每隔两秒燃放一个，
	 * 小雪每隔三秒燃放一个，在不考虑燃烧时间跟安全的情况下，即随点随炸，当龙飞喊开始的时候大家一起点，问当大家都放完时，一共可以听到多少响？
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count = 100; //first person sound 0-99
//		for (int i=100; i<200; i++){
//			if (i%2==0 || i%3==0){//第二个人和第三人在第二个100秒内的响声重复响声只算一次
//				count ++;
//			}
//		}
//		for (int i=200; i<300; i++){//第三个100s只有第三个人的响声了
//			if(i%3 ==0) count++;
//		}
//		
//		System.out.println(count);
		
		
		 //三个人分别剩余100个炮
        int daiDai=100,longFei=100,xiaoXue=100;
        
        //听到声音次数
        int count=0;
        
        //开始                
        daiDai--;
        longFei--;
        xiaoXue--;
        count++;
        
        
        for(int i=1;;i++)
        {
                //标记
                boolean flag=false;
           
                //判断呆呆是否该放炮
                if(daiDai>0){
                        flag=true;
                        daiDai--;                                
                }
                //判断龙飞是否该放炮
                if(i%2==0&&longFei>0){
                        flag=true;
                        longFei--;                                
                }
                //判断小雪是否该放炮
                if(i%3==0&&xiaoXue>0){
                        flag=true;
                        xiaoXue--;                                
                }
                //判断是否听到了声音
                if(flag)
                {
                        count++;
                }
                //是否都已经放完了
                if(daiDai==0&&longFei==0&&xiaoXue==0)
                {
                        break;
                }
        }
        
        System.out.println("一共听到"+count+"声");
		
		
		
		
	}
	

}
