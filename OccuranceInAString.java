class OccuranceInAString{
    public static int str(String haystack,String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";
        int result=str(haystack, needle);
        System.out.println(result);
    }
}