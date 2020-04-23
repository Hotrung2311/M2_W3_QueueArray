public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);

//        queue.enQueue(4);
//        queue.deQueue();
//
//
//        queue.enQueue(56);
//        queue.enQueue(2);
//        queue.enQueue(67);
//        queue.deQueue();
//        queue.deQueue();
//
//        //67
//        queue.enQueue(24);
//
//        //67,24
//        queue.deQueue();

        //24
        queue.enQueue(98);
        queue.enQueue(45);
        queue.enQueue(23);
        queue.enQueue(435);
//        queue.Print();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        //24
//        queue.Print();
    }
}
