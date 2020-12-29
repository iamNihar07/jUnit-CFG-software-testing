package JUnit4Printtokens;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;


class MainMethodTest {	

	ByteArrayOutputStream output  = new ByteArrayOutputStream();

	@Test
	public void main_test1() throws IOException {
		System.setOut(new PrintStream(output));
		String[] args = {"file.txt","file2.txt"};
		Printtokens.main(args);	
		assertEquals("Error!,please give the token stream\n", output.toString());
	}
	
	@Test
	public void main_test2a() throws IOException {	
		System.setOut(new PrintStream(output));
		String[] args = {"C:\\Users\\Nihar Gupte\\eclipse-workspace\\Printtokens\\emptyFile.txt"};
		Printtokens.main(args);
		assertEquals("", output.toString());
	}
	
	@Test
	public void main_test2b() throws IOException {	
		System.setOut(new PrintStream(output));
		String[] args = {"C:\\Users\\Nihar Gupte\\eclipse-workspace\\Printtokens\\test.txt"};
		Printtokens.main(args);
		assertEquals("keyword,\"and\".\nnumeric,5.\ncharacter,\"d\".\nstring,\"hello\".\ncomment,;hey.\nerror,\"!!!!\".\nlsquare.\n", output.toString());
	}
	
	@Test
	public void main_test3() throws IOException {
		String commandLineInput = "\n";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("", output.toString()); 
	}
	
	@Test
	public void main_test4a() throws IOException {
		String commandLineInput = "(";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("lparen.\n", output.toString()); 
	}
	
	@Test
	public void main_test4b() throws IOException {
		String commandLineInput = ")";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("rparen.\n", output.toString()); 
	}
	
	@Test
	public void main_test4c() throws IOException {
		String commandLineInput = "[";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("lsquare.\n", output.toString()); 
	}
	
	@Test
	public void main_test4d() throws IOException {
		String commandLineInput = "]";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("rsquare.\n", output.toString()); 
	}
	
	@Test
	public void main_test4e() throws IOException {
		String commandLineInput = "'";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("quote.\n", output.toString()); 
	}
	
	@Test
	public void main_test4f() throws IOException {
		String commandLineInput = "`";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("bquote.\n", output.toString()); 
	}
		
	@Test
	public void main_test4g() throws IOException {
		String commandLineInput = ",";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("comma.\n", output.toString()); 
	}
	
	@Test
	public void main_test4h() throws IOException {
		String commandLineInput = "/";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("slash.\n", output.toString()); 
	}
	
	@Test
	public void main_test5a() throws IOException {
		String commandLineInput = "\na";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"a\".\n", output.toString()); 
	}
	
	@Test
	public void main_test5b() throws IOException {
		String commandLineInput = "\ta";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"a\".\n", output.toString()); 
	}
	
	@Test
	public void main_test5c() throws IOException {
		String commandLineInput = "\ra";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"a\".\n", output.toString()); 
	}
	
	@Test
	public void main_test6a() throws IOException {
		String commandLineInput = ";";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("comment,;.\n", output.toString()); 
	}
	
	@Test
	public void main_test6b() throws IOException {
		String commandLineInput = ";\n";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("comment,;.\n", output.toString()); 
	}
	
	@Test
	public void main_test6c() throws IOException {
		String commandLineInput = ";\t";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("comment,;.\n", output.toString()); 
	}
	
	@Test
	public void main_test6d() throws IOException {
		String commandLineInput = ";\r";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("comment,;.\n", output.toString()); 
	}
	
	@Test
	public void main_test6e() throws IOException {
		String commandLineInput = ";;";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("comment,;;.\n", output.toString()); 
	}
	
	@Test
	public void main_test7a() throws IOException {
		String commandLineInput = "\"";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"\"\".\n", output.toString()); 
	}
	
	@Test
	public void main_test7b() throws IOException {
		String commandLineInput = "!!22";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"!!22\".\n", output.toString()); 
	}
	
	@Test
	public void main_test7c() throws IOException {
		String commandLineInput = "{";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"{\".\n", output.toString()); 
	}
	
	@Test
	public void main_test8a() throws IOException {
		String commandLineInput = "AB ";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"AB\".\n", output.toString()); 
	}
	
	@Test
	public void main_test8b() throws IOException {
		String commandLineInput = "AB\n";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"AB\".\n", output.toString()); 
	}
	
	@Test
	public void main_test8c() throws IOException {
		String commandLineInput = "AB\r";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"AB\".\n", output.toString()); 
	}
	

	@Test
	public void main_test9() throws IOException {
		String commandLineInput = "ABC\0";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"ABC\0\".\n", output.toString()); 
	}
	
	@Test
	public void main_test10() throws IOException {
		String commandLineInput = "ABC(";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"ABC\".\nlparen.\n", output.toString()); 
	}
	
	@Test
	public void main_test11() throws IOException {
		String commandLineInput = "ABC\"";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"ABC\"\".\n", output.toString()); 
	}
	
	@Test
	public void main_test12() throws IOException {
		String commandLineInput = "ABC;";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"ABC\".\ncomment,;.\n", output.toString()); 
	}
	
	@Test
	public void main_test13a() throws IOException {
		String commandLineInput = "ABC";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"ABC\".\n", output.toString()); 
	}
	
	@Test
	public void main_test13b() throws IOException {
		String commandLineInput = "ABC1";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("identifier,\"ABC1\".\n", output.toString()); 
	}
	
	@Test
	public void main_test14a() throws IOException {
		String commandLineInput = "and";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("keyword,\"and\".\n", output.toString()); 
	}
	
	@Test
	public void main_test14b() throws IOException {
		String commandLineInput = "or";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("keyword,\"or\".\n", output.toString()); 
	}
	
	@Test
	public void main_test14c() throws IOException {
		String commandLineInput = "if";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("keyword,\"if\".\n", output.toString()); 
	}
	
	@Test
	public void main_test14d() throws IOException {
		String commandLineInput = "xor";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("keyword,\"xor\".\n", output.toString()); 
	}
	
	@Test
	public void main_test14e() throws IOException {
		String commandLineInput = "lambda";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("keyword,\"lambda\".\n", output.toString()); 
	}
	
	@Test
	public void main_test14f() throws IOException {
		String commandLineInput = "=>";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("keyword,\"=>\".\n", output.toString()); 
	}
	
	@Test
	public void main_test15a() throws IOException {
		String commandLineInput = "5";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("numeric,5.\n", output.toString()); 
	}
	
	@Test
	public void main_test15b() throws IOException {
		String commandLineInput = "55";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("numeric,55.\n", output.toString()); 
	}
	
	@Test
	public void main_test15c() throws IOException {
		String commandLineInput = "5A";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"5A\".\n", output.toString()); 
	}
	
	@Test
	public void main_test15d() throws IOException {
		String commandLineInput = "5\0";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("numeric,5\0.\n", output.toString()); 
	}
	
	@Test
	public void main_test16a() throws IOException {
		String commandLineInput = "#c";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("character,\"c\".\n", output.toString()); 
	}
	
	@Test
	public void main_test16b() throws IOException {
		String commandLineInput = "#1";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"#1\".\n", output.toString()); 
	}
	
	@Test
	public void main_test17a() throws IOException {
		String commandLineInput = "\"hello\"";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("string,\"hello\".\n", output.toString()); 
	}
	
	@Test
	public void main_test17b() throws IOException {
		String commandLineInput = "\"hello\"\n";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("string,\"hello\".\n", output.toString()); 
	}
	
	@Test
	public void main_test17c() throws IOException {
		String commandLineInput = "\"hello\"\r";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("string,\"hello\".\n", output.toString()); 
	}
	
	@Test
	public void main_test17d() throws IOException {
		String commandLineInput = "\"hello\"\t";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("string,\"hello\".\n", output.toString()); 
	}
	
	@Test
	public void main_test17e() throws IOException {
		String commandLineInput = "\"\"";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("string,\"\".\n", output.toString()); 
	}
	
	@Test
	public void main_test17f() throws IOException {
		String commandLineInput = "\"hello\n";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"\"hello\n\".\n", output.toString()); 
	}
	
	@Test
	public void main_test17g() throws IOException {
		String commandLineInput = "\"\0";
		ByteArrayInputStream input = new ByteArrayInputStream(commandLineInput.getBytes());
		System.setIn(input);
		System.setOut(new PrintStream(output));
		String[] args = {};
		Printtokens.main(args);
		assertEquals("error,\"\"\0\".\n", output.toString()); 
	}	
}
