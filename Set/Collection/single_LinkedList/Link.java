package com.baidu.javase.danlink;

public class Link {
    //头结点
    Node header;//不赋初值，默认是null

    int size = 0;

    public int size(){
        return size;
    }

    //向链表中添加元素的方法(向末尾添加)
    public void add(Object data){
        //创建一个新节点
        //让之前单链表的末尾节点next指向新节点对象。
        //有可能这个元素是第一个，也有可能是第二个，也可能是第三个。
        if(header == null){
            //说明还没有节点
            //new一个新的节点对象，作为头结点对象。
            //这时候的头结点既是一个头结点，又是一个末尾节点。
            header = new Node(data,null);
        }else{
            //说明不是空！
            //头结点已经存在！
            //找出当前末尾节点，让当前末尾节点的next是新节点。
            Node curretnLastNode = findLast(header);
            curretnLastNode.next = new Node(data,null);

        }
        size++;
    }

    //专门查找末尾节点的方法
    private Node findLast(Node node){
        if (node.next == null){
            //如果一个节点的next是null
            //说明这个节点就是末尾节点。
            return node;
        }
        //程序能够到这里说明：node不是末尾节点。
        return findLast(node.next);//递归算法！
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }

    //修改链表中某个数据的方法
    public void modify(Object newObj){

    }

    //查找链表中某个元素下标的方法
    public int find(Object obj){
        return 1;
    }
}