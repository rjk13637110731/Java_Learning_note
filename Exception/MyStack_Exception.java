package com.baidu.javase.exception;

public class Test11{
    public static void main(String[] args) {
        //创建对象
        MyStack stack = new MyStack();

        //压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            //这里满了
            stack.push(new Object());
        } catch (MyStackOperationException e) {
            //输出异常的简单信息
            System.out.println(e.getMessage());
        }
    }
}

//栈操作异常

class MyStackOperationException extends Exception {//编译时异常
    public MyStackOperationException(){

    }

    public MyStackOperationException(String s){
        super(s);
    }
}

 class MyStack {
    //向栈中存储元素，我们这里使用一维数组模拟，存到栈中，就表示存储到数组中。
    //因为数组是我们学习Java的第一个容器
    //为什么选择Object类型数组？因为这个栈可以存储Java中的任何引用类型的数据。
    //new Animal()对象可以放进去，new Person()对象也可以放进去。因为Animal和Person的超级父类就是Object。
    //包括Sting也可以存储进去，因为String父类也是Object。
    private Object[] elements;

    //栈帧，永远指向栈顶元素
    //那么这个默认初始值应该是多少。注意：最初的栈是空的，一个元素都没有
    //private int index = 0;//如果index采用0，表示栈帧指向了顶部元素的上方。
    private int index = -1;//如果index采用-1，表示栈帧指向了顶部元素。

    //无参构造方法，默认初始化栈容量是10。
    public MyStack() {
        //一维数组的动态初始化
        //默认初始化容量是10。
        this.elements = new Object[10];
    }

    //set和get方法，封装习惯，也许用不上
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //压栈的方法，obj是被压的元素
    public void push(Object obj) throws MyStackOperationException {
        //创建异常对象
        MyStackOperationException e = new MyStackOperationException("压栈失败，栈已满！");
        //手动将异常抛出去,这里捕捉没有意义，自己new一个异常，自己捕捉，没有意义。栈已满这个信息需要传递出去。
        throw e;//合并上述两行代码：throw new MyStackOperationException("压栈失败，栈已满！");
        }
        //程序能走到这里，说明栈没满

        //向栈中加一个元素，栈帧向上移动一个位置。
        this.index++;
        this.elements[index] = obj;//这两行代码可以合并为：this.elements[++index] = obj;

        //所有的System.out.println()方法执行时，如果输出引用的话，自动调用引用的toString()方法。
        System.out.println("压栈" + obj + "元素成功，栈帧指向" + this.index);
    }

    //弹栈的方法：从数组中取元素，每取一个元素，栈帧向下移动一位。
    public Object pop(){
        if (index < 0){
            System.out.println("栈已空，弹栈失败！");
            return null;
        }
        //程序执行到此处，说明栈没空
        System.out.print("弹栈" + elements[index]);
        index--;
        System.out.println( "元素成功，栈帧指向" + this.index);
        return elements[index + 1];
    }
}
