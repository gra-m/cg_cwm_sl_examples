package oca.curiosities.enthu;
// unfamiliar with char/int but obj poss loss of accuracy without cast
public class CompileError1 {

public static void main(String[] args) {
	char c;
	int i;
	c = 'a';
	i = c;
	i++;
	c = (char)i; // here
	c++;

}
}
