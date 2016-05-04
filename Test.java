import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/* PHILLIP SIMCIC
 * 
 * Class Test
 * COSC 341
 * 
 * Reads a specified input file, tokenizes it, and writes
 * the output to a specified output file;
 * 
 * Input and output files can be given as command line
 * arguments. 
 * 
 * 
 */
public class Test {
	public static void main(String[] args) {
		String inFile = "Test.in";
		String outFile = "Test.out";

		if (args.length > 1) {
			inFile = args[0];
			outFile = args[1];
		}

		LexemeAnalyzer lexer = new LexemeAnalyzer(inFile);

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

			Token t;

			while ((t = lexer.nextToken()) != null) {
				writer.write(t.toString());
				writer.newLine();
			}

			writer.close(); 
			
			System.out.println("Done tokenizing file: " + inFile);
			System.out.println("Output written in file: " + outFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}