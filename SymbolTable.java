/*
 * Class SymbolTable
 * 
 * Sets up symbol table and searches for the token that is called 
 * and can install a new ID if necessary
 */
public class SymbolTable {
	private String [] lexeme;
	private String [] value;
	
	public SymbolTable(String[] lexeme, String[] value) {
		super();
		this.lexeme = lexeme;
		this.value = value;
	}
	
	@SuppressWarnings({ "null", "unused" })
	public String[] getToken(String[] lexeme){
		String temp = null;
		int j = 15;
		
		for(int i =0; i < j; i++){
		
			if(temp.equals(lexeme[i])){
				return lexeme;
			}
			else{
				break;
			}
		
		}
		return null;
		
	}
	
}
