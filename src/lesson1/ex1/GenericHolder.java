package lesson1.ex1;

public class GenericHolder<T>{
    private T data;

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
    
}
