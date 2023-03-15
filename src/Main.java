//Loop:a igenom arrayer, om personen i den första arrayen svarat rätt=OK (detaljeras i den andra arrayen
//Då är den ok och printa ut det= Annars hoppa över den och printa EJ ut.
public class Main {
    public static void main(String[] args) {

        String[] namn = {"Harry Potter", "Hermione Granger", "Ron Weasley", "Luna Lovegood", "Draco Malfoy", "Neville Longbottom", "Ginny Weasley", "Fred Weasley", "George Weasley", "Cho Chang"};
        String[] svar = {"OK", "OK", "OK", "OK", "", "OK", "", "OK", "", "OK"};

        for (int i = 0; i < svar.length; i++) {
            if (svar[i] == "OK") {
                System.out.println(namn[i]);
            }
        }
    }
}
