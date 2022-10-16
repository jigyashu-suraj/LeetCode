class Solution {
    public int maximum69Number (int num) {
        int max = num;
        StringBuilder sb = new StringBuilder(Integer.toString(max));
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			s.setLength(0);
			s.append(sb);
			if (s.charAt(i) == '9')
				s.setCharAt(i, '6');
			else
				s.setCharAt(i, '9');
			int temp = Integer.parseInt(s.toString());
			if (temp > max) {
				max = temp;
			}

		}
        return max;
    }
}