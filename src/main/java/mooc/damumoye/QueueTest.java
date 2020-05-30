package mooc.damumoye;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
* 队列操作：项目需求
*
* 高并发的业务操作，需要同时处理多个用户的请求（抢购系统）
*        问题：后端程序不能及时处理所有用户的请求
*        缓冲操作：讲用户的请求队列存放，让后台系统逐个处理
*        需求：保证多线程的情况下，高效率的操作以及每个请求处理后的自动删除
*        思考：用什么样的技术实现起来比较友好？
* 使用线程安全的队列：
*       保存抢购请求：入队 offer
*       处理并删除请求：出队 pull
* */
public class QueueTest {
    public static void main(String[] args) {
        //声明一个队列，存储3个数据
        Queue<String> msg = new ArrayBlockingQueue<String>(3);
        //Collection 集合的方法，新增
        msg.add("aaa");
        //队列的操作方法，增加数据：入队
        msg.offer("bbb");
        //查询队列第一个数据
        msg.element();
        //查询队列第一个数据并删除
        msg.poll();
        //Collection 集合的方法，查询队列内所有数据的总数
        msg.size();

    }
}
