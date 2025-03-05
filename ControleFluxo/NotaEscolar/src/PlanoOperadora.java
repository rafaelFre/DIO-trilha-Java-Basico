public class PlanoOperadora {
    public static void main(String[] args) {

        String sigla = "B";
        
switch(sigla){
    case "B":{
        System.out.println("100 minutos de ligação");
        break;
    }
    case "M":{
        System.out.println("Whats e Instagram grátis");
        break;
    }
    case "T":{
        System.out.println("5Gb YouTube");
        break;
    }
    default:
        System.out.println("Indefinido");

    
}

    }
    
}
/*  // Toda estruta em if e else  assim fica muito repetitivo 

        String plano = "M";
        if(plano == "B")
        {
            System.out.println("100 minutos de ligação");
        }
        else if(plano == "M")
        {
            System.out.println("100 minutos de ligação  + Whats e Instagram grátis");
        }
        else if(plano == "T")
        {
            System.out.println("100 minutos de ligação  + Whats e Instagram grátis + 5Gb YouTube");
        }

*/