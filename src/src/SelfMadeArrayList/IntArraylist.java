package SelfMadeArrayList;

import java.util.Arrays;

public class IntArraylist implements myArraylist{
    private int[] intlist= new int[0];
    @Override
    public int[] add(int newNumber){
       int count = intlist.length;
       int[] newList = new int[count+1];
       for(int i=0;i<intlist.length;i++){
           newList[i] = intlist[i];//adds all values to the new list
       }
       newList[newList.length-1] = newNumber;
       intlist = newList;
       return intlist;
    }
    @Override
    public int[] remove(int item){
        intlist = Arrays.stream(intlist)
                .filter(number->number!=item).toArray();
        return intlist;
    }
    @Override
    public int[] clear(){
        intlist= new int[0];
        return intlist;
    }
    @Override
    public int get(int index)throws IndexOutOfBoundsException{
            for(int i=0;i<intlist.length;i++){
                if(i==index){
                    return intlist[i];
                }
            }
            throw new IndexOutOfBoundsException();
    }
}
