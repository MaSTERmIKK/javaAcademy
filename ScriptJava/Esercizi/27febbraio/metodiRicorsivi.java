public class metodiRicorsivi {
    
    public static void main(String[] args){

        int x = (int) (Math.random() * 50);

        System.out.println("Valore di partenza: " + x);
        NumeroRandom(x);
    



    }


public static int NumeroRandom(int x){
    //Calcoli del metodo
    int y = (int) (Math.random() * 50);
    //Condizione di exit
    if(x != y){
        System.out.println("Nuovo numero:" + y);
        return y;
    }
    // Ricorsione
    System.out.println("Provo un altro numero");

    return NumeroRandom(x);



}




}
