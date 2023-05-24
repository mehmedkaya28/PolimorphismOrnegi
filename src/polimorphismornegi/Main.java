
package polimorphismornegi;


public class Main {
    
    public static void HayvanSesi(Hayvan hayvan){
    
    hayvan.hayvanSesleniyor();
    
    }

    
    public static void main(String[] args) {  
        
        Hayvan hayvan1= new Hayvan("BuyukHayvan");
        hayvan1.hayvanSesleniyor();
        
        Hayvan kedi1= new Kedi("Pamuk");
        kedi1.hayvanSesleniyor();
        
        Hayvan kedi2= new Kedi("Panuk");
        HayvanSesi(kedi2);
        
        
        
    }
    
}
