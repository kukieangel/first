
public class Refund {

	public static void main(String[] args) {
		int pay=12000;
		int change=13000;
		
		if(pay-change>=0) {
			System.out.println("��^���B"+ (pay-change)/1000 +"�i1000��"+
                    (pay-change)%1000/500+"�i500��"+
                    (pay-change)%1000%500/100 +"�i100��"+
                    (pay-change)%1000%500%100/50 +"��50��"+
                    (pay-change)%1000%500%100%50/10 +"��10��"+
                    (pay-change)%1000%500%100%50%10/5 +"��5��"+
                    (pay-change)%1000%500%100%50%10%5 +"��1��");
			
			if((pay-change==0)) {
				System.out.println("�������");
			
			
		
			
		}
			
		
		
			
		}else 
			System.out.println("���B����");
			
	
	}
		

	}



