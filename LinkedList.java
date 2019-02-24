//Una vez que definimos la estructura que tendrá el nodo el siguiente paso será crear una clase que represente las acciones 
//disponibles sobre esa lista, en este caso crearemos una clase llamada LinkedList.

import java.util.Optional;

public class LinkedList{
    private node head;

    public void append(Integer value){
        if (head == null){
            head = new Node(value);
            return;
        }
        Optional <Node> lastName = getLastName();
        Node node = lastNode.get();
        node.setNext(new node(value));
    }

    public void print(){
        for (node i = head; i != null; i = i.getNext()){
            System.out.print(i.getValue() + "\t");
        }
        System.out.println();
    }

    public Optional<Node> getLastNode() {
 
        if (head != null) {
 
            Node current = head;
 
            while (current.getNext() != null) {
 
                current = current.getNext();
 
            }
 
            return Optional.of(current);
 
        } else {
 
            return Optional.empty();
 
        }
 
    }


    

}