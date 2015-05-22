
public class NumeroFeliz
{
    public boolean isHappy(int i)
    {
        String s=i+"";
        int pri = 0;
        int sec = 0;
        
        char primeir=s.charAt(0);
        pri = Integer.parseInt(primeir+"");
        
        if (s.length() > 1){
            char segundo=s.charAt(1);
            sec = Integer.parseInt(segundo+"");
        }
        int atual = 0;
        int soma = 0;
        
        for (int j = 0; j < s.length(); j++)
        {
            atual = s.charAt(j);
            soma += atual * atual;
        }
        
        
            
        
        return soma == 1;
    }
    
    

}
