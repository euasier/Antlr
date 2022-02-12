import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;

public class Main {

	public static void main(String[] args) {
		// create a CharStream that reads from standard input
		CharStream input;
		try {
			input = CharStreams.fromStream((InputStream)System.in);
			// create a lexer that feeds off of input CharStream
			LsystemLexer lexer = new LsystemLexer((org.antlr.v4.runtime.CharStream)input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream((TokenSource)lexer);
			// create a parser that feeds off the tokens buffer
			LsystemParser parser = new LsystemParser((TokenStream) tokens);
			ParseTree tree = (ParseTree)parser.prog();; // begin parsing at init rule
			
			// Create a generic parse tree walker that can trigger callbacks
			ParseTreeWalker walker = new ParseTreeWalker();
			// Walk the tree created during the parse, trig
			walker.walk(new LsystemBaseListener(), tree);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
