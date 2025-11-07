package SelfMadeArrayList;

public interface myArraylist {
    int[] add(int newNumber);

    int[] remove(int item);

    int[] clear();

    int get(int index)throws IndexOutOfBoundsException;
}
