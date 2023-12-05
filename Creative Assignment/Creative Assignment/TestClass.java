public class TestClass {
    public static void main(String[] args) {
        //Testing the case where both lists are empty
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        MyLinkedList<Integer> resultList = list1.merge(list2);
        System.out.println(resultList.toString());

        //Testing the case where the paramList is empty
        MyLinkedList<Integer> list3 = new MyLinkedList<>();
        list3.append(1);
        list3.append(2);
        list3.append(3);
        list3.append(4);
        list3.append(5);
        MyLinkedList<Integer> list4 = new MyLinkedList<>();

        MyLinkedList<Integer> resultList2 = list3.merge(list4);
        System.out.println(resultList2);

        //Testing the case where the calling list is empty
        MyLinkedList<Integer> list5 = new MyLinkedList<>();
        MyLinkedList<Integer> list6 = new MyLinkedList<>();
        list6.append(6);
        list6.append(7);
        list6.append(8);
        list6.append(9);
        list6.append(10);

        MyLinkedList<Integer> resultList3 = list5.merge(list6);
        System.out.println(resultList3);

        //Testing the default case
        MyLinkedList<Integer> list7 = new MyLinkedList<>();
        list7.append(1);
        list7.append(2);
        list7.append(3);
        list7.append(4);
        list7.append(5);
        MyLinkedList<Integer> list8 = new MyLinkedList<>();
        list8.append(6);
        list8.append(7);
        list8.append(8);
        list8.append(9);
        list8.append(10);

        MyLinkedList<Integer> resultList4 = list7.merge(list8);
        System.out.println(resultList4);
    }
}