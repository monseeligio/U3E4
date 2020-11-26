package u3e4pilanumeros;
public class PilaA {
    Nodo cima=null;
    int tamanio=0;
    Nodo cima2;
    int tamanio2=0;

        public boolean vacia(){
        return cima==null;
    }   
      public boolean vacia2(){
        return cima2==null;
    } 
        
    public void empuja(int elemento){
      Nodo nodo= new Nodo(elemento);
      if(cima==null){
        nodo.Siguiente=cima;
        cima=nodo;
        tamanio++;
      }
      else{
       if(nodo.elemento>cima.elemento){
        nodo.Siguiente=cima;
        cima=nodo;
        tamanio++;
        }
       else{
       Nodo nodo2= new Nodo(elemento);    
       nodo2.Siguiente=cima2;
       cima2=nodo2;
       tamanio2++;  
       }
      }
      }
      
    
   
 public void mostrarPila2(){
        if(vacia2()){
            System.out.println("La pila esta vacia");
        }
        else{
        Nodo recorre=cima2;
        while(recorre!=null){
            System.out.println("pila 2 "+recorre.elemento);
            recorre=recorre.Siguiente;}
        }
    }    
    
    public void Sacarpila(){
        if(vacia()){
            System.out.println("La pila esta vacia");
        }
        else{
       // String auxiliar =cima.elemento;
        cima=cima.Siguiente;
        tamanio--;
        }
        //return auxiliar;
    }
    public void mostrarPila(){
        if(vacia()){
            System.out.println("La pila esta vacia");
        }
        else{
        Nodo recorre=cima;
        while(recorre!=null){
            System.out.println("pila1 "+recorre.elemento);
            recorre=recorre.Siguiente;}
        }
    }
}
