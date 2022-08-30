public class maxnumofwordfoundinsentence {

	public static void main(String[] args) {
        String sentences[]={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int res=0;
        int l=sentences.length;
       for(int i=0;i<l;i++){
           res=Math.max(res,(sentences[i].split(" ").length));
       } 
        System.out.print(res);
    }
}
