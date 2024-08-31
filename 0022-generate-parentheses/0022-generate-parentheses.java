class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        solve(res, 0, 0, "", n);  
        return res;
    }
    public void solve(List<String> res, int l, int r, String s, int n){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(l<n){
            solve(res, l+1, r, s+"(", n);
        }
        if(r<l){
            solve(res, l, r+1, s+")", n);
        }
    }
}


/*
The idea is to add ')' only after valid '('
We use two integer variables l & r to see how many '(' & ')' are in the current string
If l < n then we can add '(' to the current string
If r < l then we can add ')' to the current string


For n = 2, the recursion tree will be something like this,

								   	(0, 0, '')
								 	    |	
									(1, 0, '(')  
								   /           \
							(2, 0, '((')      (1, 1, '()')
							   /                 \
						(2, 1, '(()')           (2, 1, '()(')
						   /                       \
					(2, 2, '(())')                (2, 2, '()()')
						      |	                             |
					res.append('(())')             res.append('()()')
*/