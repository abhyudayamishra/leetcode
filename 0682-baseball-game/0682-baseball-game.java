class Solution {
    public int calPoints(String[] operations) {
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i=0;i<operations.length;i++){
        if(operations[i].equals("C")&& ans.size()!=0){
            ans.remove(ans.size()-1);
        }else if(operations[i].equals("D")){
            int a = 2*ans.get(ans.size()-1);
            ans.add(a);
        }else if(operations[i].equals("+")){
            int sum = ans.get(ans.size()-1) + ans.get(ans.size()-2);
            ans.add(sum);
        }else{
            ans.add(Integer.parseInt(operations[i]));
        }
       } 
       int sum =0;
       for(int i =0;i<ans.size();i++){
           sum = sum + ans.get(i);
       }
       return sum;
    }
}