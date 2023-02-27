package try_catch;

public class Tes {
    public static void main(String[] args) {
        X xobj=new X();
        xobj.printFileContent();
    }
/*
Which two modifications shoul you make so that the code compiles successfully? (CHOOSE TWO)
A
    Replace X class line 8 with:
    try{
    xobj.printFileContent();
    }
    catch (Exception e){
    catch (IOException e){
    }
B
Replace  X class line 8 with throw IOException ("Exception raised");

C
Replace Test Class line 4 with  public static void main(String[] args) throws Exception{

D
At Test Class line 7, insert throw new IOException();

E
Replace X class line 6 with public void printFileContent() throws IOException {

Cozum
Cevap C ve E
A sikkinda try catch X classta olmaliydi. Child exception IOException ilk yazilmasi gerekirken parent once yazilmis.
B sikkinda throw dan sonra new koyulmamis.
C sikkinda dogru bir sekilde main yanina throws atmis.
D sikkinda X class ta atildigi halde bir daha ayni throw atmis.
E sikkinda dogru bir sekilde throws atilmis.
 */
}
