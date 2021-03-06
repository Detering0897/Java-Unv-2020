package Ex15;

public class MyArrayList<T> {
    private int default_size = 16;
    private int cut_rate = 4;
    private Object[] array = new Object[default_size];
    private int pointer = 0;


    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }


    public T get(int index) {
        return (T) array[index];
    }


    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if ((array.length > default_size) && (pointer < array.length / cut_rate))
            resize(array.length/2);
    }

    public int size() {
        return pointer;
    }


    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
