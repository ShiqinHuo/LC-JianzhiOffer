/**
使用java的同学请注意，如果你使用Stack的方式来做这道题，会造成速度较慢；
这个原因的话是因为Stack继承了Vector接口，而Vector底层是AbstractList，
是一个数组，那么就要考虑空间扩容的问题了。 可以使用LinkedList来做Stack的容器，
因为LinkedList实现了Deque接口，所以Stack能做的事LinkedList都能做，其本身结构是个链表，
扩容消耗少。 但是我的意思不是像100%代码那样直接使用一个List当做队列，那确实是快=，
但是不符题意。 这样的优化之后，效率提高了40%，超过97%。
*/
class CQueue {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }
    
    public void appendTail(int value) {
        stack1.add(value);
    }
    
    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) return -1;
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            } 
            return stack2.pop();
        }
        else return stack2.pop();
    }
}
