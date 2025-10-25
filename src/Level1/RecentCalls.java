package Level1;
//933. Number of Recent Calls(Easy)(L75)

import java.util.LinkedList;

public class RecentCalls {
    public static void main(String[] args){

    }

}

 class RecentCounter{
    LinkedList<Integer> calls;
    public RecentCounter(){
        calls = new LinkedList<>();
    }
    public int ping(int t){
        calls.add(t);
        while(calls.getFirst()<t-3000){
            calls.removeFirst();
        }
        return calls.size();
    }

}