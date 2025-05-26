package impl;

import api.List;
import structureNode.Node;


public class LinkedList<T> implements List<T> {

    private Node<T> head;
    private int size;

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if(head == null){
            head = newNode;
        }else{
            Node<T> auxNode = head;
            while(auxNode.getNext() != null){
                auxNode = auxNode.getNext();
            }
                auxNode.setNext(newNode);
        }
            size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public T get(int index) {

        if (index >= 0 && index <= this.size - 1) {

            int indexCounter = 0;
            Node<T> auxNode = this.head;

            while (auxNode != null) {

                if (indexCounter == index)
                    return auxNode.getInfo();

                auxNode = auxNode.getNext();
                indexCounter++;

            }
        }

        throw new IndexOutOfBoundsException("index is out of bounds of list size: " + this.size);
    }

    @Override
    public boolean remove(T element) {
        if(head == null) return false;

        if(head.getInfo().equals(element)){
            head = head.getNext();
            size--;
        }else{
            Node<T> auxNode = head;

            while(auxNode.getNext() != null){
                Node<T> nextNode = auxNode.getNext();
                if(nextNode.getInfo().equals(element)){
                    auxNode.setNext(nextNode.getNext());
                    size--;
                    break;
                }else{
                    auxNode = auxNode.getNext();
                }
            }

        }

        return true;
    }


    @Override
    public int indexOf(T element) {

        int indexOf = -1;

        if (this.head == null)
            return indexOf;

        Node<T> auxNode = this.head;

        while (auxNode != null) {

            indexOf++;

            if (auxNode.getInfo().equals(element))
                return indexOf;

            auxNode = auxNode.getNext();

        }

        return -1;
    }

    @Override
    public boolean contains(T element) {

        if(this.head == null)
            return false;

        Node<T> auxNode = this.head;

        while(auxNode.getNext() !=null){
            if(auxNode.getInfo().equals(element))
                return true;


            auxNode = auxNode.getNext();
        }


        return false;
    }

    @Override
    public void clear() {
        this.head= null;
        this.size = 0;
    }
}
