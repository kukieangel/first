import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J��إιq1:�u�~2:�a�x");
		int kind = scanner.nextInt();
		System.out.print("�п�J�ιq�׼�rang:");
		int rang = scanner.nextInt();
		scanner.close();
		
        if ( kind <= 1 && kind>0 ) {
				System.out.println("����u�~�q�O:"+ rang*.45);
		}
        else { if( kind > 1  &&  kind<=2 ) {
        	if(rang<=240) {
        		System.out.println("����a�x�q�O:"+ rang*.15);}
        		else { if(rang>240 && rang<540) { 
        			System.out.println("����a�x�q�O:"+ (240*.15+(rang-240)*0.25));}
        		else {
        			System.out.println("����a�x�q�O:"+ (240*.15+(300*0.25)+(rang-540)*0.45));
        		}
        		}
        }else { System.out.println("��J���~");
        }
        
        }
		
		System.out.println("�A�����"+ kind);
		System.out.println(rang+"��");
	}
}
