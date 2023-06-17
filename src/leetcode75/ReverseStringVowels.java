// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
package leetcode75;

class ReverseStringVowels {
  public String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder();
    List<Character> vowels = new ArrayList<Character>();
    List<Integer> place = new ArrayList<Integer>();

    if (s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u") || s.contains("A") || s.contains("E") || s.contains("I") || s.contains("O") || s.contains("U")) {
      char[] ch = s.toCharArray();
            
      for (int i = 0; i < ch.length; i ++) {
        if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
        vowels.add(ch[i]);
        place.add(i);
        }
      }    
      
      for (int i = 0, j = place.size() - 1; i < place.size(); i++, j--) {
        ch[place.get(i)] = vowels.get(j);
      }
      
      sb.append(ch);
      s = sb.toString();
    }
    
    return s;
  }
}
