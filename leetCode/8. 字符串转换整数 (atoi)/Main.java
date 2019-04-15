class Solution {
    public int myAtoi(String str) {
        long sum = 0;//数字部分
        int addFlag = 0;//是否是加减号
        char c;//获取到的字符
        int i = 0;//遍历位置
        for(; i < str.length() ; i ++){
            c = str.charAt(i);
            if(addFlag == 0 && c == ' ')continue;//检查空格，前面的addFlag == 0防止读取完加减号还有空格在里面
            if(addFlag == 0 && (c == '-' || c == '+')){//检查加减号，前面的addflag == 0防止读取完加减号还有加减号在里面
                if(c == '-')addFlag = -1;
                else addFlag = 1;
                continue;
            }
            if(c >= '0' && c <= '9')break;//到达获取数字部分
            return 0;//不是以上情况，直接原地爆炸
        }
        for( ; i < str.length() ; i ++){//数字获取部分
            c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                sum *= 10;
                sum += (int)c - (int)'0';
                if(sum > Integer.MAX_VALUE){//数字超出
                    sum = Long.MAX_VALUE - 1;
                    break;
                }
            }else{
                break;
            }
        }
        if(addFlag == 0)addFlag = 1;
        if(addFlag * sum > Integer.MAX_VALUE)return Integer.MAX_VALUE;
        if(addFlag * sum < Integer.MIN_VALUE)return Integer.MIN_VALUE;
        return (int)(addFlag * sum);
    }
}
