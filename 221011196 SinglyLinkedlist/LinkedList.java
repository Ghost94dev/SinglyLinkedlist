package linkedlist;

public class LinkedList {
    public Node head;
    public static int size;

    //add 
    public void add(String value){
        Node nodeToAdd = new Node();
        nodeToAdd.data = value;

        if (isEmpty()){
            head = nodeToAdd;
            size++;
        }else {
            Node n = new Node();
            n = head;

            while (n.next != null){
                n = n.next;
            }
            n.next = nodeToAdd;
            nodeToAdd.next = null;
            size++;
        }
        
       

    }
    
    
    //addFirst
    public void addFirst(String value){ 
       Node nodeToAdd = new Node();
       nodeToAdd.data = value;
       nodeToAdd.next = head;
        head = nodeToAdd;
        size++;
        
    }
   
    
    // addLast
    public LinkedList addLast(LinkedList list, String value){
       Node nodeToAdd = new Node();
        nodeToAdd.data = value;
        Node last = list.head;
        if (isEmpty()){
            head = nodeToAdd;
            size++;
        }else {
            while(last.next!=null){
               last = last.next;
               
               
              }  
                  last.next = nodeToAdd;
                  nodeToAdd = null;
        }
      return list;  
    }
    
    //get()
    public int get(int index){
     
        Node n;
        n= head;
        
        if(index >size || index < 0 ){
        System.out.println("Index not found");
        }else{
            
        for(int i=0; i < index; i++){
           
             n = n.next; 
        
        }
       System.out.println(n.data);
        }
        
        return index;
    }
 
    
    //getFirst
     public void  getFirst(){
        int index= size;
        Node n;
        n= head;
            
        for(int i=0; i < index; i++){
           
             n = head; 
        }
       System.out.println("The first name is" + " " + n.data);
        }
        
        
    
 /*
     //getLast
     public void getLast(){
        int index = size;
        Node n;
        n = head;
        
           
        for(int i=0; i < index; i++){
           
             n = head;
             n=n.next;
        }
       System.out.println("The first name is" + " " + n.data);
        }
      */  
       
    
     //Clear
      public void Clear(){
      head=null;
      size=0;
      System.out.println("your List is Empty");
      }  
   
      
      // removeFirst
  public void removeFirst(){
      Node n;
      n= head;
      
        head = n.next;
        
        size--;
        }
    
  
     // removeLast
    public void removeLast(){
       
       
        
   }
    
    //Size
    public int getSize(){
    Node n;
    n= head;
    
     for(int i=0; i <size; i++){
           
             n = n.next; 
        }
     
     System.out.println("the Size is" + " "+ size);
     
    return size;
   }
   
   
    
    public void removeAT(int pos){
    
        Node n;
        n= head;
        
       if(pos>size){
       System.out.println("please the size is greater than the size of the list");
       }else
       {
       for(int i=0; i<pos-1; i++){
          n=n.next;
    
        }
        n.next=n.next.next;
        size--;
       }
        
    }

    public void displayLinkedList(){
        Node n = new  Node();
        n = head;
        while (n.next != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data + " \n ");
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public  void addTo(int pos, String value ) {


        Node nodeToAdd = new Node();
        nodeToAdd.data = value;
        if (pos == size){
            this.add(value);
        }else{

       int i = 0;
       Node n = head;
       while (n.next != null){
           if ( i == pos-1 ){
              //  n.next = nodeToAdd;
                //nodeToAdd.next = n.next;
                nodeToAdd.next = n.next;
                n.next = nodeToAdd;
                size++;
           }
           n = n.next;
           i++;
       }
    }
}
}


