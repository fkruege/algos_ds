//package recursion;
//
///**
// * Created by fkruege on 2/17/17.
// */
//// http://codingbat.com/prob/p186177
//public class StrCount {
//
//    public int strCount(String s, String sub){
//
//
//        if(s.length() < sub.length()){
//            return 0;
//        }
//
//        if(s.substring(0, sub.length() - 1).equals(sub)){
//            return 1 + strCount(s.substring(sub.length()), sub);
//        }
//
//    }
//}
