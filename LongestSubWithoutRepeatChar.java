class LongestSubWithoutRepeatChar {
    public int lengthOfLongestSubstring(String s) {
        if (s.equals(""))
            return 0;
        int len = s.length();
        int[] repeat = new int[257];
        for (int idx = 0; idx < 257; idx++) {
            repeat[idx] = -1;
        }
        int start = 0;
        int ans = 0;
        for (int idx = 0; idx < len; idx++) {
            int temp = s.charAt(idx) - ' ';
            if (repeat[temp] > -1)
                if (repeat[temp] + 1 > start)
                    start = repeat[temp] + 1;
            repeat[temp] = idx;
            if (idx - start + 1 > ans)
                ans = idx - start + 1;
            repeat[temp] = idx;
            if (idx - start + 1 > ans)
                ans = idx - start + 1;
        }
        return ans;
    }
        
}