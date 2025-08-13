package com.company;

public class cwh_14_strings_method {
    public static void main(String[] args){

       String name = "Harry";
       String A="harry";
        System.out.println(name);
        // some of commonly used string methods are:
        // 1.> name.length--> letters count karke bata dega
        int value = name.length();
        System.out.println(value);
        //2.> name.toLowerCase()--> capital letter ko small kr dega
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        //3.> name.toUpperCase()--> small letter ko capital kr dega
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        //4.> name.trim() --> spaces ko hata dega
        String nontrimstring="    Harry    ";
        System.out.println(nontrimstring);
        String trimstring=nontrimstring.trim();
        System.out.println(trimstring);
        //5.> name.Substring(int Start)--> jo index enter karoge us index se end tk puri string ko print kar degi
        System.out.println(name.substring(1));
        //6.>name.Substring(int start , int end)-->start from start index and exclude from end index
        System.out.println(name.substring(2,4));
        //7.>name.replace(r,p)-->replace character r with p
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));
        // r ki jagah par p aa gya
        //8.> name.startsWith()-->agar usi string se start ho rhi hai string to true return karegi warna false
     System.out.println(name.startsWith("H"));
     // yaha par name string H se start ho rhi hai to ans true aayega
     //9.>name.endsWith()--> agr usi string par khatam hoga to true return karega warna false
     System.out.println(name.endsWith("ry"));
     // yaha par name naam ki string ry par end ho rhi hai to ans true aayega
     //10.>name.charAt()--> jo index daaloge whi index ki char value print ho jaayegi
     System.out.println(name.charAt(1));
     // iska mtlb hai what is char at given index
     //11.>name.indexOf()--> what is index of given sub string
     System.out.println(name.indexOf("arr"));//first char ka index print karega
     //12.>name.indexOf("s",3)-->mtlb substring index no 3 se khojna suru karo
String modifiedName="Harryrry";
     System.out.println(modifiedName.indexOf("rry",4));
     //last index me right to left read karta hai sabse last wale r ka idx return karega
     //13.>name.lastindexOf("r")-->return last index of given string
     System.out.println(name.lastIndexOf("y"));
     System.out.println(modifiedName.lastIndexOf("rry"));
     // sabse last wali sub string rry ke first r ka  index print hoga
     //14.>name.lastIndexOf("s",2)-->returns last index of the given string before index 2}
     System.out.println(modifiedName.lastIndexOf("rry",5));
     //15.>name.equals("Harry")-->jo string enter ki hai wo string name string ke equal hai ya nhi ye batayega or answer
     //true or false me dega
     System.out.println(name.equals("harry"));
     //16.>name.equalsIgnoreCase("Harry")-->jo string enter ki hai wo string name string ke equal hai ya nhi ye batayega or answer
     //true or false me dega isme ye capital letter or small letter ko ignore karega for ex ye Harry or harry ko same batayega
     System.out.println(name.equalsIgnoreCase("HARRY"));
     //17.>A.substring(0,1).toUpperCase()+A.substring(1); for captilaize first letter
        String s=A.substring(0,1).toUpperCase()+A.substring(1);
        System.out.println(s);
     //18.>Returns 0 → if both strings are equal
        //Returns positive number → if a > b (i.e., a is lexicographically after b)
        //Returns negative number → if a < b (i.e., a comes before b)
     // escape sequence
     System.out.println("  i am a girl \\ double qoute");

    }
}
