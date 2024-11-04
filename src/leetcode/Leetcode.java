/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leetcode;

import java.util.Stack;

/**
 *
 * @author jayia
 */
public class Leetcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = -121;
        
        boolean isPal = isPalindrome(x);
        
        System.out.println(isPal);
        
        
    }
    
    static boolean isPalindrome(int x){
        String strx = Integer.toString(x);
        
        char[] arrx = strx.toCharArray();
        
        Stack<Character> stack = new Stack<>();

        for ( char num : arrx){
            stack.push(num);
        }
        
        while(!stack.isEmpty()){
            for (char num: arrx){
                if(stack.peek()==num){
                    stack.pop();
                }else{
                    return false;
                }
            } 
        }
        
        return true;
        
    }
    
}
