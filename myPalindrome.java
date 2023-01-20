class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        char[] pal = num.toCharArray();
        int i = 0;
        int j = pal.length-1;
        char[] rev = new char[pal.length];
        while(i<pal.length){
        rev[i] = pal[j];
        i++;
        j--;
        System.out.println(rev);
        System.out.println(pal);
        }
        return Arrays.equals(rev, pal);
        
    }
}