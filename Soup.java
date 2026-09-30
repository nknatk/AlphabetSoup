//Name: Natan Kebede
//Date: 09/29/2026
//Description: This program will simulate custom letter mixes by managing a specific pool of letters, drawing
//random charachters, and centering a partner company's name within those letters
public class Soup {
    //these are instance variables 
    private String letters;   //imacibox
    private String company;  //apple

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //precondition- add a new word in the terminal such as Hello
    //postcondition - new letters is hello
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //precondition - After you add a string such as Hello you can the randomLetter
    //postcondition - returns a random letter in the word Hello such as l 
    public char randomLetter(){
        
        
        return letters.charAt((int)(Math.random() * letters.length()));
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //precondition- you can add a word like Hello and do companyCentterd and then type the name of a company
    // postcondition - the name of the company will be in between the word hello 
    public String companyCentered(){
        int center = letters.length() / 2;
        return letters.substring(0, center) + company + letters.substring(center);

   
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //precondition - you can add a word like Hello and use removeFirstVowel 
    //postcondition - the first vowel in the word hello will be removed so it will turn in to hllo
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[aeiou]", "");
        
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //precondition - If you add the word Hello or any other word you can use the removeSome
    //postcondition - if you type removeSome and for example 3 it will remove 3 random letters from the word hello Ex: output would be he
    public void removeSome(int num){
        int spot = (int)(Math.random() * (letters.length() - num + 1));
        letters = letters.substring(0, spot) + letters.substring(spot + num);

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //precondition- if you add a word for example such as ABCHELLO you can use removeWord
    //postcondition - if you say removeWord ABC the output will be HELLO
    public void removeWord(String word){
        letters = letters.replaceFirst(word, "");
        
    }
}
