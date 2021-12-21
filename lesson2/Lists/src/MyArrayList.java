import java.util.*;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) throws Exception {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if(initialCapacity == 0){
            this.elementData = new Object[]{};
        } else {
            throw new Exception("Something went wrong");
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(Object o){
        for (Object el: elementData) {
            if(el == null)
                return false;

            if(el.equals(o))
                return true;
        }
        return false;
    }

    private void grow() {
        int newCapacity = size * 2 + size;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public boolean add(E e) {
        if(size == elementData.length){
            grow();
        }
        elementData[size] = e;
        size++;
        return true;
    }

    public boolean remove(Object o) {
        int i = 0;
        if (o == null) {
            for (; i < size; i++) {
                if (elementData[i] == null)
                    break;
            }
        } else {
            for (; i < size; i++) {
                if (o.equals(elementData[i]))
                    break;

                if (i == size - 1) { return false; }
            }
        }

        int newSize = size - 1;
        System.arraycopy(elementData, i + 1, elementData, i, newSize - i);
        elementData[size = newSize] = null;
        return true;
    }

    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        List<Integer> arrayList = new ArrayList<>();
        System.out.println(myArrayList.size());
        myArrayList.add(5);
        myArrayList.add(7);
        myArrayList.add(32);
        myArrayList.add(3213);
        myArrayList.add(1);
        myArrayList.add(-123);

        System.out.println(myArrayList.size());

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.elementData[i] + " ");
        }
        System.out.println("");

        myArrayList.remove(32);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.elementData[i] + " ");
        }
        System.out.println("");

        System.out.println(myArrayList.contains(5));
        System.out.println(myArrayList.contains(32));


    }

}
