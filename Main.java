import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
//		int[] citations = {6,6,6,6};
//		int[] citations = {3,3,3,3};
		
		
		System.out.println(new Solution().solution(citations));
		
	}

}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length;
        Arrays.sort(citations);
        reverseArrayInt(citations);
        for (int h = n; h >= 0; h--) {
        	for (int i = 0; i < n; i++) {
        		if (h > citations[i]) {
        			if (h <= i)
        				return h;
        			else break;
        		}
        		if (i == n-1)
        			return h;
        	}
        }
        return answer;
    }
    private void reverseArrayInt(int[] array) {
    	int temp;
    	for (int i = 0; i < array.length / 2; i++) {
    		temp = array[i];
    		array[i] = array[array.length-1-i];
    		array[array.length-1-i] = temp;
    	}
    }
}