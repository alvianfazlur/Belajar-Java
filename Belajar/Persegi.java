    class Persegi{  
	public int a = 10;
      void hitung(){System.out.println("Rumus :");}  
    }  
   class Nilai extends Persegi{ 
	public int a = 20; 
      void hitung(){System.out.println("S x S");}  
     
      public static void main(String args[]){  
       Persegi p = new Nilai();  
       p.hitung();
	System.out.println(p.a);
	System.out.println(p.a);  
      }  
 }  