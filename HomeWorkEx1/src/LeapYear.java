
public class LeapYear {

	public static void main(String[] args) {
		int years=2001;
		int ans = years%4 ; 
		int bns = years%100; 
		int cns = years%400;
		int dns = years%4000;
		if(ans==0) {
			if(bns==0) {
				if(cns==0) {
					if(dns!=0) {
						System.out.println("¶|¦~");
					}else {System.out.println("¤£¬O¶|¦~");
						}
				}else {System.out.println("¤£¬O¶|¦~");
					}
			}else {System.out.println("¶|¦~");
				}
		}else {System.out.println("¤£¬O¶|¦~");
		    }  
	}
}

		
		//if(((cns==0&&dns!=0))||ans==0&&bns== 0 ) {
			//System.out.println("¶|¦~");
			  //}else
			  	//System.out.println("¤£¬O¶|¦~");
//		}
//}