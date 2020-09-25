package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	String frase= "World!";
	if(args.length>0){
		frase= args[0];
		for(int i=1; i<args.length;i++){
			frase+= args[i];
		}
	}
	System.out.println( "Hello " + frase );
    }
}
