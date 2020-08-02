package javastudy;

import java.util.LinkedList;

/**
 * 单链表应用举例
 */
public class LinkListDemo {

    public static void main(String[] args) {
        LinkedList mLinkedList = new LinkedList();
        for (int i = 0; i < 100; i = i + 2) {
            mLinkedList.add(i);
        }
        System.out.println(String.format("第%s个元素的直接前驱是%s", 12 + 1, mLinkedList.get(12 - 1)));


    }
}
