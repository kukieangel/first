
public class Refund {

	public static void main(String[] args) {
		int pay=12000;
		int change=13000;
		
		if(pay-change>=0) {
			System.out.println("找回金額"+ (pay-change)/1000 +"張1000元"+
                    (pay-change)%1000/500+"張500元"+
                    (pay-change)%1000%500/100 +"張100元"+
                    (pay-change)%1000%500%100/50 +"個50元"+
                    (pay-change)%1000%500%100%50/10 +"個10元"+
                    (pay-change)%1000%500%100%50%10/5 +"個5元"+
                    (pay-change)%1000%500%100%50%10%5 +"個1元");
			
			if((pay-change==0)) {
				System.out.println("不必找錢");
			
			
		
			
		}
			
		
		
			
		}else 
			System.out.println("金額不足");
			
	
	}
		

	}



