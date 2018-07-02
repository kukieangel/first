import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入何種用電1:工業2:家庭");
		int kind = scanner.nextInt();
		System.out.print("請輸入用電度數rang:");
		int rang = scanner.nextInt();
		scanner.close();
		
        if ( kind <= 1 && kind>0 ) {
				System.out.println("本月工業電費:"+ rang*.45);
		}
        else { if( kind > 1  &&  kind<=2 ) {
        	if(rang<=240) {
        		System.out.println("本月家庭電費:"+ rang*.15);}
        		else { if(rang>240 && rang<540) { 
        			System.out.println("本月家庭電費:"+ (240*.15+(rang-240)*0.25));}
        		else {
        			System.out.println("本月家庭電費:"+ (240*.15+(300*0.25)+(rang-540)*0.45));
        		}
        		}
        }else { System.out.println("輸入錯誤");
        }
        
        }
		
		System.out.println("你的選擇"+ kind);
		System.out.println(rang+"度");
	}
}
