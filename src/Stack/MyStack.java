package Stack;

public class MyStack {
    private int[] data;
    private  int top;
    // number of elements in stack
    private int size;

    public MyStack(int sizeOfArray) {
        data=new int[sizeOfArray];
        top=0;
        size=0;

    }
    // insert new elements
    public void push(int element){
        if(!isFull()){
            data[top] = element;
            top++;
            size++;
        }
        else{
            System.out.println("Stack under OverFlow");
        }

    }
    // helper function
    public boolean isFull(){
        boolean response=false;
        if(top==data.length){
            response=true;
        }
        return response;
    }

    //delete last enter element

    public int pop(){
        int response=0;
        if(!isEmpty()){
            top--;
            size--;
            response=data[top];

        }
        else{

            System.out.println("Stack underflow");
        }
        return response;

    }

    //checking stack for is empty

    public boolean isEmpty(){

        boolean response=false;
        if(top==0){
            response=true;

        }
        return response;
    }

    public int peek(){
        int response=0;

        if(!isEmpty()){
            response=data[top-1];

        }
        else{
            System.out.println("stack underflow");
        }
        return response;
    }
    // a method to get number of elements in the stack
    public int size(){
        return size;
    }


}
