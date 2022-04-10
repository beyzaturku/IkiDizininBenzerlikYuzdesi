package benzerlikyuzdesi;

public class BenzerlikYuzdesi {

    public static void main(String[] args) {
        
        int[] dizi1 = {5,11,12,7,8,10};
        int[] dizi2 = {1,2,3,4,5,7,8,9,10};
        
        int ortak=0;
        for( int i=0; i<dizi1.length; i++)
        {
            for(int j=0; j<dizi2.length;j++)
            {
               if(dizi1[i] == dizi2[j])
               {
                    
                    ortak++;
                    break;
               }
                
            }
        }
       
        if(ortak==1)
        {
            System.out.println("Benzerlik oranı %20'dir.");
        }
        if(ortak==2)
        {
            System.out.println("Benzerlik oranı %40'tır.");
        }
        if(ortak==3)
        {
            System.out.println("Benzerlik oranı %60'tır.");
        }
        if(ortak==4)
        {
            System.out.println("Benzerlik oranı %80'dir.");
        }
        if(ortak==5)
        {
            System.out.println("Benzerlik oranı %100'dür.");
        }
        
       
    }
    
}
