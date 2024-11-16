/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8.Ex5;

import java.util.HashMap;

/**
 *
 * @author ADMIN
 */
public class Dictionary {
    
    public static boolean isExists(HashMap<String, String> dict, String word) {
        return dict.containsKey(word);
    }

    public static String findMeaning(HashMap<String, String> dict, String word) {
        return isExists(dict, word) ? word + " : " + dict.get(word) : word + " doesn't exist in dictionary";
    }
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        
        dictionary.put("hello","Xin chào");
        dictionary.put("goodbye","Tạm biệt");
        dictionary.put("thank you","Cảm ơn");
        dictionary.put("please","Xin vui lòng");
        dictionary.put("sorry","Xin lỗi");
        dictionary.put("yes","Có");
        dictionary.put("no","Không");
        dictionary.put("help","Giúp đỡ");
        dictionary.put("eat","Ăn");
        dictionary.put("drink","Uống");
        
        System.out.println("Enter a word:");
        String word = "hello";
        System.out.println(findMeaning(dictionary,word));
        System.out.println("Enter a word:");
        word = "goodbye";
        System.out.println(findMeaning(dictionary,word));
        System.out.println("Enter a word:");
        word = "morning";
        System.out.println(findMeaning(dictionary, word));
    }
   
}
