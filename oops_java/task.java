// class & class-name
class demo{
    int x=10;String y="Kaniska"; //data
    void show(){  // method
        System.out.println(x+" "+y);
    }
}
//now create another class to create a object
class task{ 
   public static void main(String[] args){
    demo r=new demo(); // demo-> class name, r-> object name, new->DMA, demo->constructor
    r.show();
   }
}