import java.util.Scanner;
public class DDA{
	public static int round(float n) {
		if (n - (int) n < 0.5){
		  return (int) n;
		}else{
			return (int) (n + 1);
		}
	}
	public static void Find_DDA(int x1,int y1,int x2,int y2){
		int dy,dx,step;
		dx = x2 - x1;
		dy = y2 - y1;
		
		if(Math.abs(dx) > Math.abs(dy)){
			step = Math.abs(dx);
		}else{
			step = Math.abs(dy);
		}
		
		float x_inc = (float) dx/step;
		float y_inc = (float) dy/step;
		
		float x = x1;
		float y = y1;
		
		for(int i = 0; i < step; i++) {
			System.out.println("("+round(x) + " , " + round(y)+")");
			x += x_inc;
			y += y_inc;
		}
	}
	public static void main(String[] args){
		int x1,y1,x2,y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 value : " );
		x1 = sc.nextInt();
		System.out.println("Enter y1 value : ");
		y1 = sc.nextInt();
		System.out.println("Enter x2 value : ");
		x2 = sc.nextInt();
		System.out.println("Enter y2 value : ");
		y2 = sc.nextInt();
		
		Find_DDA(x1,y1,x2,y2);
	}
}