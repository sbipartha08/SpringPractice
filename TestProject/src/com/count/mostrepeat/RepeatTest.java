package com.count.mostrepeat;

public class RepeatTest {

	public static void main(String[] args) throws Exception {
		/*String str = "acvabcabcfgvbcgabcabzabgahbcbgabcbnmbcaancabc";
		char[] ch = str.toCharArray();
		int cnt = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				if (ch[i + 1] == 'b') {
					if (ch[i + 2] == 'c') {
						System.out.println("abc here " +(i+1)+"th position ");
						cnt++;
						i += 2;
					}
				}
			}
		}
		System.out.println("abc repeated " + cnt + " no of times");
	}*/
	
		String s1 = "partha sarathi samal";
		String s2 = "sa";
		int count = 0;
		int l1 = s1.length();
		int l2 = s2.length();
		if(l2>l1){
			throw new Exception();
		}
		for(int i = 0;i<l1-1;i++){
				String sr = s1.substring(i, i+l2);
				if(s2.equals(sr)){
					count  = count + 1;
				}
			}
		System.out.println(count);
		}
}
