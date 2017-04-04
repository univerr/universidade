//developed by alexsyfk..github,ill db implements mysql
/*alexsey
 * simple app to show functions with db....
 * docents Fred Jarsen
 */
import java.util.Scanner;
public class Universidade{
    
    public static void main(String args[]){
    boolean resp=true;while(resp){    
       System.out.println(" _________________________________"); 
       System.out.println("+\t           \t      \t  +\t   projeto db"); 
       System.out.println("+\t1-consultar\tcriado\t  +\tdocente Fred Jarsen"); 
       System.out.println("+\t2-cadastrar\t por  \t  +        |"); 
       System.out.println("+\t3-remover  \talexsy\t  +        |"); 
       System.out.println("+\t4-atualuzar\t      \t  +        |");
       System.out.println("+\t                   \t  +        ▼"); 
       System.out.println("+\t\t\t    \t  +");Scanner sc = new Scanner(System.in);
       System.out.println("+\t\t\t    \t  +escolha uma das opções..."); 
       System.out.println("+_________________________________+");resp=sc.nextInt()>4?true:false;
   }

    }
    
    
    
}
