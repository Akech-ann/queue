fun main() {

    var a =     Queue(5)
    a.enQueue(1)
    a.enQueue(2)
    a.enQueue(3)
    a.deQueue()

    a.enQueue(45)
    a.enQueue(32)
    a.enQueue(64)
    a.enQueue(32)










}


class Queue(var capacity:Int) {
    var data = IntArray(capacity)
    var front = 0
    var rear = 0


    fun enQueue(value:Int) {
        if (isFull()){
            println("queue")
            return
        }
        data[rear] = value
        rear++


    }

    fun deQueue(): Int? {
        if (isEmpty()){
            println("queue id empty")
            return  null
        }
        var removed = data[front]
        return  removed
        for (i in front until rear -1){
            data[i] = data[i+1]
        }
        rear--

    }

    fun peek(): Int?{
        if (isEmpty()){
            return null
        }
       return data[front]



    }


    fun isFull(): Boolean {
        return rear == capacity

    }


    fun isEmpty(): Boolean {
        return  front ==rear

    }


    fun dispaly() {

        if (isEmpty()){
            return
        }
        for (i in front until rear)
            println(data[i])

    }
}