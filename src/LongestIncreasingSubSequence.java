import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class LongestIncreasingSubSequence {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,29,9,30,21,22,49,42,50);
		int length = list.size();
		List<Integer> countList = Arrays.asList(0,0,0,0,0,0,0,0,0);
		
		for(int i=0;i<length;i++){
			for(int j=i;j<length;j++){
				if(list.get(j) > list.get(i)){
					countList.set(j, Math.max(countList.get(j),countList.get(i)+1));
				}
			}
		}
	
		System.out.print("[ ");
		countList.forEach( indexCount ->{
			System.out.print(indexCount+" ");
		});
		System.out.println("]");
		
		OptionalInt max = countList.stream().mapToInt(Integer::intValue).max();
		System.out.println("MAX  VALUE : "+max.getAsInt());
		
	}

}
