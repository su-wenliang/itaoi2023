package cc.openhome;

class Clothes {
    String color;
    String size;
}

public class Field {
    public static void main(String[] args) {
        var sun = new Clothes();
        var spring = new Clothes();
        
        sun.color = "red";
        sun.size = "M";
        spring.color = "green";
        spring.size = "M";
        
        System.out.printf("sun (%s, %c)%n", sun.color, sun.size);
        System.out.printf("sun (%s, %c)%n", spring.color, spring.size);
        
    }
}
