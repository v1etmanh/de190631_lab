package com.jmc.week1.excercise5;

public class Calculater {
    private double number_a=0;

    public void setNumber_a(double number_a) {
        this.number_a = number_a;
    }

    private static  final double[]data={0,19,25,30,40,Double.MAX_VALUE};


    public Calculater() {

    }

    private void Adding(double in ){
        this.number_a+=in;
    }
    private  void Subtract(double in){
        this.number_a-=in;
    }
    private void Multiple(double in){this.number_a*=in;}
    private  void Divide(double in) throws Exception {
    try{

        this.number_a/=in;}catch (Exception e){e.printStackTrace();}
    }
    private  void exponent(double in){
        number_a=Math.pow(number_a,in);
    }
    public void Operation(char type,double in) throws Exception {
        switch (type){
            case'+'->{
                this.Adding(in);
                break;
            }
            case'-'->{
                this.Subtract(in);
                break;
            }
            case'*'->{
                this.Multiple(in);
                break;
            }
            case'/'->{
                this.Divide(in);
                break;
            }
            case'^'->{
                this.exponent(in);
                break;
            }
            default -> throw new IllegalArgumentException("Invalid operator");
        }

    }

    public double getNumber_a() {
        return number_a;
    }

  public String IdentityStandard(double a, double b){
     double level= a/(b*b);int index=0;
     for(int i=0;i<data.length-1;i++){
         if(data[i]<level&&data[i+1]>level){
          index=i; break;
         }

     }
        StandardBMI[]x=StandardBMI.values();
        return x[index].toString();
    }

}
