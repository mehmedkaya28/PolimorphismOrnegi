
package polimorphismornegi;


public class Kedi extends Hayvan { 

    public Kedi(String isim) {
        super(isim);
    }
    
    

    @Override
    public void hayvanSesleniyor() {
       System.out.println(super.getIsim()+ " miyavlıyor.");
    }
    
    
    
}
