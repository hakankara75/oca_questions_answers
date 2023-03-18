package super_this;

public class CD {

        int r;
    CD(int r){
            this.r = r;
        }
    }

/*
public class DVD extends CD {
    int c;

    DVD(int r, int c) {
        // line n1

    }

    public static void main(String[] args) {
        DVD dvd = new DVD(10, 20);
        System.out.println(dvd.r);
        System.out.println(dvd.c);
    }
}



Which code fragment should you use at line n1 to instantiate the dvd object successfully?
A. super.r = r;
	this.c = c;
B. super(r);
	this(c);
C. super(r);
	this.c = c;
D. this.c = r;
	super(c);

Cevap C
Cozum: C sikkinda super(r), CD classta  parametreli const. kullanabilir. this.c de kendi class'ini kullanir.
A sikkinda super(r)'nin parenta gitmesi lazim. Ancak CD'de default const. olmadigi icin  bu satri yazilamaz
B sikkinda this(c)'nin calisabilecegi tek parametreli DVD(int c) olmadigi icin hata verir
D sikkinda super const. ilk satirda yazilmasi gerekir
*/


