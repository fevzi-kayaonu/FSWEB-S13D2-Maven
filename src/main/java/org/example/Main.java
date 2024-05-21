package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-121));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(121));

    }
    public static Boolean isPalindrome(int num){
        String ters = "";
        num = Math.abs(num);
        String numst = String.valueOf(num);
        char[] nums = numst.toCharArray();
        for(int i=nums.length-1; i>=0 ;i--){
            ters += nums[i];
        }
        if(num==Integer.parseInt(ters)){
            return true;
        }

        return false;
    }
    public static Boolean isPerfectNumber(int num){
        if(num<0){
            return false;
        }
        int toplam=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                toplam += i;
            }
        }
        if(toplam==num){
            return true;
        }

        return false;
    }
    public static String numberToWords(int num){
        if(num<0){
            return "Invalid Value";
        }
        String yenist="";
        char[] nums = String.valueOf(num).toCharArray();
        for(char n : nums){
            switch (String.valueOf(n)) {
                case "1":
                    yenist += "One ";
                    break;
                case "2":
                    yenist += "Two ";
                    break;
                case "3":
                    yenist += "Three ";
                    break;
                case "4":
                    yenist += "Four ";
                    break;
                case "5":
                    yenist += "Five ";
                    break;
                case "6":
                    yenist += "Six ";
                    break;
                case "7":
                    yenist += "Seven ";
                    break;
                case "8":
                    yenist += "Eight ";
                    break;
                case "9":
                    yenist += "Nine ";
                    break;
                default: yenist += "Zero ";
            }

        }
        return (yenist.trim());
    }
}