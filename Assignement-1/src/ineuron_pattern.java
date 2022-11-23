
public class ineuron_pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==(n-1)/2) {              //I
					System.out.print("*");
				}else 
				{ 
					System.out.print(" ");}
				}  System.out.print("  ");
		
			for(int j=0;j<n;j++) {
				if(j==0||j==(n-1)||i==j) {       //N
					System.out.print("*");
				}else 
				{ 
					System.out.print(" ");}         //E
			}System.out.print("  ");
			for(int j=0;j<n;j++) {
				if(j==0||i==0||i==(n-1)||i==(n-1)/2) {
					System.out.print("*");
				}else 
				{ 
					System.out.print(" ");}                  
				}  System.out.print("  ");             //U
				for(int j=0;j<n;j++) {
					if(j==0&&i<(n-1)||j==(n-1)&&i<(n-1)||i==n-1&&j>0&&j<(n-1)) {
						System.out.print("*");
					}else 
					{ 
						System.out.print(" ");}
					}  System.out.print("  ");
					
					for(int j=0;j<n;j++) {
						if(j==0||i==0                            //R
								||j==(n-1)&&i>=0&&i<=(n-1)/2
								||i==(n-1)/2&&j>=0&&j<=(n-1)/2
								||i-j==(n-1)/2
								){
								
							System.out.print("*");
						}else 
						{ 
							System.out.print(" ");}
						}  System.out.print("  ");
						for(int j=0;j<n;j++) {
							if(i==0&&j>0&&j<(n-1)
									||i==(n-1)&&j>0&&j<(n-1)||   //O
									j==0&&i>0&&i<(n-1)
									||j==(n-1)&&i>0&&i<n-1
									){
									
								System.out.print("*");
							}else 
							{ 
								System.out.print(" ");}      //N
							}  System.out.print("  ");
							for(int j=0;j<n;j++) {
								if(j==0||j==(n-1)||i==j) {
									System.out.print("*");
								}else 
								{ 
									System.out.print(" ");}
							}System.out.print("  ");
			
		
			
			System.out.println();
		}
	}}


	



	
