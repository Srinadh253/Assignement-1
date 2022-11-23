
public class pattern_3 {
public static void main(String[] args) {
	int n=14;
	for(int i=0;i<14;i++) {
		for(int j=0;j<14;j++) {
			if(i==(n-1)||i-j>=(n-1)/2||j+i>=(n-1)+(n-1)/2) {
				System.out.print("* ");
			}else { System.out.print("  ");}
		}System.out.println();
}
}}
