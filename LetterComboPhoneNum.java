class LetterComboPhoneNum {
    public List<String> letterCombinations(String digits) {
		List res = new ArrayList();	
		Map<Character, String> m = new HashMap<>();

		m.put('2', "abc");
		m.put('3', "def");
		m.put('4', "ghi");
		m.put('5', "jkl");
		m.put('6', "mno");
		m.put('7', "pqrs");
		m.put('8', "tuv");
		m.put('9', "wxyz");
		if(digits.length() == 0) return new ArrayList<>();
		String s1 = m.get(digits.charAt(0));
			for(int j=0;j<s1.length();j++) {
				res.add(Character.toString(s1.charAt(j)));
			}
		for(int i=1; i<digits.length(); i++) {
			List<String> temp = new ArrayList<>();
			String s = m.get(digits.charAt(i));
			for(int k=0; k< res.size(); k++) {
				for(int j=0;j<s.length();j++) {
					temp.add(res.get(k) + Character.toString(s.charAt(j)));
				}
			}
			res = temp;
		}
		return res;
        
	}
}