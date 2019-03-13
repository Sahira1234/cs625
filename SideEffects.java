public class SideEffects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        i=0;
        if(false&(++i<100))
            System.out.println("this would not be displayed");
        System.out.println("if statement executs:"+i);
        if(false&&(++i<100))
            System.out.println("this would not be displayed");
        System.out.println("if statement executs:"+i);
            
            
        // TODO code application logic here
    }
    
}
