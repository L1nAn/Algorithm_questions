package com.mzw;

/**
 * @author :马治伟
 * @version :1.0
 * @Date : 2023/5/11
 */
public class MyArrayList {
    int size; // 数组元素个数
    Object[] elementData; //初始化数组变量

    public MyArrayList(int capacity) {
        this.size = 0; //数组元素个数初始化为0
        elementData = new Object[capacity]; //初始化一个长度为capacity的数组。
    }

    /**
     * 添加操作，插入末尾
     *
     * @param o
     * @return
     */
    public boolean add(Object o) {
        Object newElementData[];
        //当数组长度等于数组元素个数，说明数组已满，故需要进行扩容
        if (elementData.length == size) {
            //扩充为原来的2倍
            newElementData = new Object[size * 2];

            //循环将原来的数组的内容复制给新数组
            for (int i = 0; i < elementData.length; i++) {
                newElementData[i] = elementData[i];
            }
            //使原来数组的引用变量指向新数组
            elementData = newElementData;
        }
        //将新元素插入数组
        elementData[size] = o;
        //长度加1
        size++;
        return true;
    }

    /**
     * 插入操作，插入指定位置
     *
     * @param index
     * @param element
     */
    public void add(int index, Object element) {
        //和插入末尾同样的道理，如果数组已经满了，则必须进行扩容
        if (elementData.length == size) {
            Object[] newElementData = new Object[size * 2];

            for (int i = 0; i < elementData.length; i++) {
                newElementData[i] = elementData[i];
            }
            elementData = newElementData;
        }
        //将插入位置的元素后面的元素全部后移一位
        //这种方法不能用，想一想，如果这样的话，那么后面的数值不就都一样了吗。
//        for (int i = index + 1; i < size; i++) {
//            elementData[i + 1] = elementData[i];//永远和前面的数值保持一致
//        }
        for (int i = size; i > index; i--) {
            //将插入位置的元素后面的元素进行后移一位的操作
            elementData[i] = elementData[i - 1];//这样就可以了，从后面开始。永远不会重复。
        }
        //将新元素插入指定位置
        elementData[index] = element;
        //个数加一
        size++;
    }

    /**
     * 删除操作
     *
     * @param index
     * @return
     */
    public Object remove(int index) {
        if (index < 0 || index > elementData.length) {
            throw new RuntimeException("指针越界");
        }
        //从要删除的位置到数组元素个数开始循环
        //使第index个元素的值为第index+1
        for (int i = index; i < size; i++) {
            elementData[index] = elementData[index + 1];
        }
        //最后进行数组元素个数-1的操作
        size--;
        return elementData;
    }

    /**
     * 查找元素操作
     *
     * @param index
     * @return
     */
    //根据索引查找，直接返回对应的元素
    public Object get(int index) {
        return elementData[index];
    }

    //根据值找索引，元素第一次出现的位置
    public int indexOf(Object o) {
        //当查找到索引，直接返回，否则返回-1
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    //测试
    public static void main(String[] args) {
        MyArrayList a = new MyArrayList(3);
        a.add(111);
        a.add(222);
        a.add(777);
        a.add(999);
        a.add(1, 9887);
        System.out.println("删除前的结果：");
        for (int i = 0; i < a.elementData.length; i++) {
            if (a.elementData[i] != null) {
                System.out.print(a.elementData[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("删除后的结果:");
        a.remove(3);
        for (int i = 0; i < a.elementData.length; i++) {
            if (a.elementData[i] != null) {
                System.out.print(a.elementData[i]);
                System.out.print(" ");
            }
        }
    }
}
