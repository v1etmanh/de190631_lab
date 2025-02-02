package com.jmc.week1.excercise3;

public class ConvertBaseSystem {


    public String ConvertDecimalToBinary(long input){
        String result= new String();
        long m_result=input;
       long t=0;
        while(m_result>0){
            t=m_result%2;
            m_result/=2;
            result+=t;

        }
        StringBuilder result1= new StringBuilder(result);
        result=result1.reverse().toString();
        return  result;

    }
    public long ConvertBinaryToDecimal(String input){

      int mu=input.length()-1;
      long result=0;
      for(int i=0;i<input.length();i++)
      {
          result+= (long) (Integer.parseInt(input.substring(i,i+1))*Math.pow((int)(2),(int)(mu--)));

      }

        return  result;

    }
  public String ConvertDecimalToHexadcimal(long input){
      String result= new String();
      long m_result=input;
      long t=0;
      int A=(int)'A';
      long identity;
      while(m_result>0){
          t=m_result%16;
          m_result/=16;
        identity=t-9;
        if(identity<=0){result+=t;}
        else{char add=(char)(A+identity-1);
            result+=add;
        }

      }
      StringBuilder result1= new StringBuilder(result);
      result=result1.reverse().toString();
      return  result;
  }
    public long ConvertHexadecimalToDecimal(String input){
       long result=0;
          int mu=input.length()-1;
          int A='A';
          int temp;
          for(int i=0;i<input.length();i++){
              if((int)input.charAt(i)<A){
                  temp=Integer.parseInt(input.substring(i,i+1));

              }
              else{
                  temp=(int)input.charAt(i)-A+10;

              }
              result+= (long) (temp*Math.pow((int)(16),(int)(mu--)));
          }
          return  result;
    }
    public String ConvertBinaryToHexadicimal(String input){
        long temp= ConvertBinaryToDecimal(input);
        String result=ConvertDecimalToHexadcimal(temp);
        return result;
    }
    public String ConvertHexadicimalToBinary(String input){
        long temp= ConvertHexadecimalToDecimal(input);
        String result=ConvertDecimalToBinary(temp);
        return result;
    }
}
