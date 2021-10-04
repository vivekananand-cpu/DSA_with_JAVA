package Searching;

public class SearchInString {
    public static void main(String[] args) {

        String name ="vivek";
        char target ='e';
        if(searchInString(name, target)){
            System.out.println("char "+target+" is found");
        }
        else{
            System.out.println("char does not exist");
        }
    }

    static boolean searchInString(String str,char target) {
        if(str.length()==0){
            return false;
        }
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==target){
        //         return true;
        //     }

        // }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

}

