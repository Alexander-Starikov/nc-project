/**
 * обобщённый класс, который позволяет создать динамический массив, а так же описывает
 * некоторые методы по изменению массива по его индексам
 * @param <T> - вводимый тип данных
 */
public class MyArrayList<T> {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    /**
     * метод добавляет новый элемент в список. При достижении размера внутреннего
     * массива происходит его увеличение в два раза.
     * @param item - вводимый объект в массив
     */
    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    /**
     * метод возвращает элемент списка по индексу.
     *
     * @param index - вводимый индекс массива
     * @return - возвращает объект определенного индекса
     */
    public T get(int index) {
        return (T) array[index];
    }

    /**
     * Удаляет элемент списка по индексу. Все элементы справа от удаляемого
     * перемещаются на шаг налево. Если после удаления элемента количество
     * элементов стало в CUT_RATE раз меньше чем размер внутреннего массива,
     * то внутренний массив уменьшается в два раза
     * @param index - вводимый индекс массива
     */
    public void remove(int index) {
        for (int i = index; i<pointer; i++)
            array[i] = array[i+1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length/2);
    }

    /**
     * Возвращает количество элементов в массиве
     * @return - число элементов в массиве
     */
    public int size() {
        return pointer;
    }

    /**
     * Вспомогательный метод для масштабирования
     * @param newLength - новая длина массива
     */
    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}