import java.util.Scanner;
public class B_LineDrawing{
	public static void LineDrawing(int x1,int y1,int x2,int y2){
		int x,y,x_end,d,dy,dx,i1,i2;
		dx = x2 - x1;
		dy = y2 - y1;
		i1 = 2*dy;
		i2 = 2*(dy-dx);
		d  = i1-dx;
		
		if(x1>x2){
			x = x2;
			y = y2;
			x_end = x1;
		}else{
			x = x1;
			y = y1;
			x_end = x2;
		}
		
		System.out.println("pixel : ("+x+","+y+")");
		
		for(int i = (x+1);i<=x_end;i++){
			
			if(d<0){
				d = d+i1;
			}else{
				y = y+1;
				d = d+i2;
			}
			x++;
			System.out.println("pixel : ("+x+","+y+")");
		}
		
	}
	public static void main(String[] args){
		int x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1 : ");
		x1 = sc.nextInt();
		
		System.out.println("Enter the value of y1 : ");
		y1 = sc.nextInt();
		
		System.out.println("Enter the value of x2 : ");
		x2 = sc.nextInt();
		
		System.out.println("Enter the value of y2 : ");
		y2 = sc.nextInt();
		
		LineDrawing(x1,y1,x2,y2);
	}
}