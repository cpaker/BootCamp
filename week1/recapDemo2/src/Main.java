
public class Main {

	public static void main(String[] args) {

double[] myList = {1.2,1.3,4.2,4.3};
		
double total = 0;
double max = myList[0];

for(double list : myList) {
	total+= list;
	if(max<list) {max = list;}
			
	}
	System.out.println(total);
	System.out.println(max);

}


	}


