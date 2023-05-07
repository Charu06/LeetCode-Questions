class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int a[]={0,0}, n=students.length;
        for(int i=0;i<n;i++)
            a[students[i]]++;
        int i;
        for(i=0;i<n;i++){
            if(a[sandwiches[i]]>0)
                a[sandwiches[i]]--;
            else
                break;
        }
        return n-i;
    }
}