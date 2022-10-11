class Solution {
    public String interpret(String command) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i<command.length();i++){
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')') 
                s.append('o');
            else if(command.charAt(i) == '(' || command.charAt(i) == ')')
                continue ;
            else
                s.append(command.charAt(i));
        }
        
        return s.toString();
        
        
    }
}