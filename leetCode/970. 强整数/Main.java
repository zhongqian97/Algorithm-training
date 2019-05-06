class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0 ; ; i ++){
            int valuex = (int) Math.pow(x, i);
            if(valuex >= bound)break;
            for(int k = 0 ; ; k ++){
                int valuek = (int) Math.pow(y, k);
                int sum = valuex + valuek;
                if(sum > bound){
                    break;
                }else if(a.contains(sum) == false){
                    a.add(sum);
                }
                if(y < 2)break;
            }
            if(x < 2)break;
        }
        return a;
    }
}
