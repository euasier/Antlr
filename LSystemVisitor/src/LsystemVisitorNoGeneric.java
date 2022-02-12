
public class LsystemVisitorNoGeneric extends LsystemBaseVisitor<Void> {
	String cadena = null;
	String cadenaDest = null;
	int numIters = 1;
	int iter = 0;
	
	String replaceString = null;
	String withString = null;
	
	@Override public Void visitProg(LsystemParser.ProgContext ctx) { 
		
		while(iter<numIters) {
			visitChildren(ctx); 

			cadena = convertToLetters(cadena);
			iter++;
			System.out.println("iteracion " + iter + " el resultado es: " + cadena);
		}

		return null;
	}

	@Override public Void visitInit(LsystemParser.InitContext ctx) { 
		if(iter==0) cadena = ctx.ID().getText();	

		return visitChildren(ctx); 
	}

	@Override public Void visitIter(LsystemParser.IterContext ctx) { 
		numIters = Integer.valueOf(ctx.NUM().getText()).intValue();

		return visitChildren(ctx); 
	}

	@Override public Void visitRep(LsystemParser.RepContext ctx) { 
		replaceString = ctx.ID().getText();
		
		return visitChildren(ctx); 
	}
	
	@Override public Void visitWith(LsystemParser.WithContext ctx) { 
		withString = ctx.ID().getText();
		String withStringNumbers = convertToNumbers(withString);
//System.out.println("Replace: " + withString);
//System.out.println("With: " + withStringNumbers);
		cadena = cadena.replace(replaceString, withStringNumbers);
//System.out.println("Cadena: " + cadena);
		return visitChildren(ctx); 
	}

	private String convertToLetters(String src) {
		String output = "";
		boolean isLetter;
		
		String[] numbers = src.split("-");
		for(String s: numbers) {
			isLetter = false;
			if(!"".equals(s)) {
				try {
					int n = Integer.valueOf(s).intValue();
				} catch (NumberFormatException e) {
					isLetter = true;
				}
				if(!isLetter) {
					int n = Integer.valueOf(s).intValue();
					char c = (char) n;
					output += "" + c;
				} else {
					output += s;
				}
			}
		}
		
		return output;
	}
	
	private String convertToNumbers(String src) {
		String output = "-";

		for(int i=0;i<src.length();i++) {
			char c = src.charAt(i);
			int n = c;
			
			output += "" + n;
output += "-";
		}
		
		return output;
	}


}
