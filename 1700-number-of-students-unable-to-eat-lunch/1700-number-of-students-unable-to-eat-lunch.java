class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<students.length;i++){
            list.add(Integer.toString(students[i]));
        }
        int n=sandwiches.length;
        for(int i=0;i<n;i++){
            if(list.contains(Integer.toString(sandwiches[i])))
                list.remove(Integer.toString(sandwiches[i]));
            else
                return n-i;
        }
        return 0;
    }
}