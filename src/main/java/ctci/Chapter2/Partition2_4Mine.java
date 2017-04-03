//package ctci.Chapter2;
//
///**
// * Created by fkruege on 4/1/17.
// */
//public class Partition2_4Mine {
//
//    public Node partition(Node node, int x) {
//
//        Node lessThanHead = null;
//        Node lessThanTail = null;
//        Node middle = null;
//        Node greaterThanHead = null;
//        Node greaterThanTail = null;
//
//        Node current = node;
//
//        int count = 0;
//
//
//        while (current != null) {
//            count++;
//
//            Node next = current.next;
//
//            if (current.value == x && middle == null) {
//                middle = current;
//                middle.next = null;
//            } else if (current.value < x) {
//                if (lessThanHead == null) {
//                    lessThanHead = current;
//                    lessThanTail = current;
//                }
//                lessThanTail.next = current;
//                lessThanTail = current;
//            } else {
//                if (greaterThanHead == null) {
//                    greaterThanHead = current;
//                    greaterThanTail = current;
//                }
//                greaterThanTail.next = current;
//                greaterThanTail = current;
//            }
//
//            current = next;
//        }
//
//
//
//
//    }
//
//
//}
