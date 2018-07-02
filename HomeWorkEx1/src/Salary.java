
public class Salary {

	public static void main(String[] args) {
		int hours=10;
		if(hours>=60) {
			
			if(hours<80) {
				System.out.println("salary="+ ((hours-60)*144+7200));
						//System.out.println("salary ="+ ((hours-80)*180+60*120+20*120*1.2));
				
			}else { System.out.println("salary ="+ ((hours-80)*180+60*120+20*120*1.2));;
			}
			
		}else {
			System.out.println("salary="+hours*120);
		}
	}

}
