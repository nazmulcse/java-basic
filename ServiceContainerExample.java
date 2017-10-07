interface SpellFixer{
    public String fixSpell(String text);
}
class EnglishSpellFixer implements SpellFixer{
    public String fixSpell(String text){
        // Business logic goes here
        return text ;
    }
}

class BanglaSpellFixer implements SpellFixer{
    public String fixSpell(String text){
        // Business logic goes here
        return text ;
    }
}

class Email{
    private SpellFixer spellFixer;

    public void setFixer(SpellFixer spellFixer){
        this.spellFixer = spellFixer;
    }

    public void send(String text){
        String finalText = spellFixer.fixSpell(text);

        System.out.println(finalText);
    }
}

public class ServiceContainerExample{
    public static void main(String[] args){
        Email email = new Email();
        email.setFixer(new BanglaSpellFixer());
        email.send("Testing service container");
    }
}
