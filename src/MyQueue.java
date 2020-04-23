public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int front = 0;
    private int rear = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        if (this.currentSize == this.capacity){
            return true;
        }
        return false;
    }
    public boolean isQueueEmpty(){
        if (this.currentSize == 0){
            return true;
        }
        return false;
    }
    public void enQueue(int item){
        if (isQueueFull()){
            System.out.println("Hàng đợi hết chỗ, không thể thêm phần tử: " + item);
        }else {
            rear++;
            if (rear == capacity){
                rear = 0;
            }
            queueArr[rear] = item;
            currentSize++;
            System.out.println("Phần tử " + item + " đã được xếp vào hàng đợi !");
        }
    }
    public void deQueue(){
        if (isQueueEmpty()) {
            System.out.println("Hàng đợi rỗng");
        } else {
            front++;
            if (front == capacity) {
                System.out.println("Xóa phần tử: " + queueArr[front - 1]);
                front = 0;
            } else {
                System.out.println("Xóa phần tử: " + queueArr[front - 1]);
            }
            currentSize--;
        }
    }
//    public void Print(){
//        for (int i = 0; i < this.currentSize; i++){
//            System.out.print(queueArr[i] + ", ");
//        }
//        //System.out.println(head);
//    }


}
