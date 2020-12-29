package JUnit4Printtokens;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.io.*;

class NonMainMethodsTest {

	static Printtokens ob;
	
	@BeforeAll
	static void initialize() throws IOException 
	{
		ob = new Printtokens();
	}
	
	@Test
	void get_token_test() {
		Reader temp = new StringReader("");
		BufferedReader br = new BufferedReader(temp);
		assertEquals(null, ob.get_token(br));
		
		temp = new StringReader("\t");
		br = new BufferedReader(temp);
		assertEquals(null, ob.get_token(br));
		
		temp = new StringReader("\n");
		br = new BufferedReader(temp);
		assertEquals(null, ob.get_token(br));
		
		temp = new StringReader("\r");
		br = new BufferedReader(temp);
		assertEquals(null, ob.get_token(br));
		
		temp = new StringReader("(");
		br = new BufferedReader(temp);
		assertEquals("(", ob.get_token(br));
		
		temp = new StringReader("\na");
		br = new BufferedReader(temp);
		assertEquals("a", ob.get_token(br));
		
		temp = new StringReader(";");
		br = new BufferedReader(temp);
		assertEquals(";", ob.get_token(br));
		
		temp = new StringReader("\"");
		br = new BufferedReader(temp);
		assertEquals("\"", ob.get_token(br));
		
		temp = new StringReader("AB ");
		br = new BufferedReader(temp);
		assertEquals("AB", ob.get_token(br));
		
		temp = new StringReader("ABC");
		br = new BufferedReader(temp);
		assertEquals("ABC", ob.get_token(br));
		
		temp = new StringReader("ABC(");
		br = new BufferedReader(temp);
		assertEquals("ABC", ob.get_token(br));
		
		temp = new StringReader("ABC\"");
		br = new BufferedReader(temp);
		assertEquals("ABC\"", ob.get_token(br));
		
		temp = new StringReader("ABC;");
		br = new BufferedReader(temp);
		assertEquals("ABC", ob.get_token(br));
		
		temp = new StringReader("ABC");
		br = new BufferedReader(temp);
		assertEquals("ABC", ob.get_token(br));
		
		temp = new StringReader("\"ABC\"");
		br = new BufferedReader(temp);
		assertEquals("\"ABC\"", ob.get_token(br));
	}
	
	@Test
	void is_token_end_test(){
		assertEquals(true, Printtokens.is_token_end(0,-1));
		assertEquals(true, Printtokens.is_token_end(1,34));
		assertEquals(true, Printtokens.is_token_end(1,10));
		assertEquals(true, Printtokens.is_token_end(1,13));
		assertEquals(false, Printtokens.is_token_end(1,67));
		assertEquals(true, Printtokens.is_token_end(2,10));
		assertEquals(true, Printtokens.is_token_end(2,13));
		assertEquals(true, Printtokens.is_token_end(2,9));
		assertEquals(false, Printtokens.is_token_end(2,68));
		assertEquals(true, Printtokens.is_token_end(0,40));
		assertEquals(true, Printtokens.is_token_end(0,32));
		assertEquals(true, Printtokens.is_token_end(0,10));
		assertEquals(true, Printtokens.is_token_end(0,13));
		assertEquals(true, Printtokens.is_token_end(0,59));
		assertEquals(false, Printtokens.is_token_end(0,69));
	}
		 
	@Test
	void is_keyword_test() {
		assertEquals(true, Printtokens.is_keyword("and"));
		assertEquals(true, Printtokens.is_keyword("or"));
		assertEquals(true, Printtokens.is_keyword("if"));
		assertEquals(true, Printtokens.is_keyword("xor"));
		assertEquals(true, Printtokens.is_keyword("lambda"));
		assertEquals(true, Printtokens.is_keyword("=>"));
		assertEquals(false, Printtokens.is_keyword("nihar"));
	}
	
	@Test
	void is_num_constant_test() {
		assertEquals(false, Printtokens.is_num_constant("A"));
		assertEquals(false, Printtokens.is_num_constant("1A"));
		assertEquals(true, Printtokens.is_num_constant("10"));
		assertEquals(true, Printtokens.is_num_constant("1"));
		assertEquals(true, Printtokens.is_num_constant("1\0"));
	}
	
	@Test
	void is_str_constant_test(){
		assertEquals(false, Printtokens.is_str_constant("1"));
		assertEquals(true, Printtokens.is_str_constant("\"\""));
		assertEquals(true, Printtokens.is_str_constant("\"hello\"\0"));
		assertEquals(false, Printtokens.is_str_constant("\"A"));
		assertEquals(false, Printtokens.is_str_constant("\"A\0"));
		assertEquals(false, Printtokens.is_str_constant("\""));
	}
	
	@Test
	void is_identifier_test(){
		assertEquals(false, Printtokens.is_identifier("1"));
		assertEquals(false, Printtokens.is_identifier("a!"));
		assertEquals(true, Printtokens.is_identifier("a1"));
		assertEquals(true, Printtokens.is_identifier("a1\0"));
	}

}
