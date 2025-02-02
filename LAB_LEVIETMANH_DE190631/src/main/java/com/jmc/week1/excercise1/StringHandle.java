package com.jmc.week1.excercise1;

import java.util.ArrayList;
import java.util.HashMap;

public class StringHandle {
  private String data;

    public StringHandle(String data) {
        this.data = data;
    }

    public HashMap<String,Integer> HandleWord() {
        HashMap<String,Integer> result= new HashMap<String,Integer> ();
        int first = 0;
        int last = 0;

        while (first < data.length()) {

            if (data.charAt(first) == ' ') {
                first++;
                last = first;
            } else {

                while (last < data.length() && data.charAt(last) != ' ') {
                    last++;
                }


                String word = data.substring(first, last);
                if(!result.containsKey(word)){
                    result.put(word,1);
                }
                else{
                    int value=result.get(word);
                    result.put(word,++value);
                }


                first = ++last;
            }
        }

        return result;
    }
  public HashMap<Character,Integer> HandleChar() {
      HashMap<Character, Integer> result = new HashMap<>();
      int[] a = new int[data.length()];
      int index = 0;
      char key;

      while (index < data.length())
      {int value=0;
          if(a[index]==1||data.charAt(index)==' '){index++;}
          else{
              key= data.charAt(index);
              for(int i=index;i<data.length();i++)
              {
                  if( data.charAt(i)==key)
                  {
                      value++;
                      a[i]=1;
                  }
              }
              result.put(key,value);
          }
      }
      return result;
  }

}
