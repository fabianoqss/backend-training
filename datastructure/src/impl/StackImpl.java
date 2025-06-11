package impl;


import api.Stack;
import structureNode.Node;

public class StackImpl <T> implements Stack<T> {

    private Node<T> top;


    @Override
    public boolean empty() {
        return top == null;
    }

    @Override
    public T peek() {

        if(top != null) return top.getInfo();


        return null;
    }

    @Override
    public T pop() {
        if (this.top !=null) {
            T info = this.top.getInfo();
            this.top = this.top.getNext();
            return info;
        }

        return null;
    }

    @Override
    public T push(T element) {
        Node<T> auxNode = new Node<>(element);

        if(this.top == null){
            this.top = auxNode;
        }else{
            auxNode.setNext(top);
            top = auxNode;
        }

        return this.peek();
    }

    @Override
    public int search(T element) {
        return 0;
    }
}
