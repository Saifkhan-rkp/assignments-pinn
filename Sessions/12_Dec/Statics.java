class Statics {
    public static void print(String s){
        System.out.println(s);
    }
    public static void print(){
        System.out.println();
    }
    public static void main(String[] args) {
        print("something");

        int a= 100, b=20;
        float x = 23432.543f, y= 87654.3324f;

        print();
        print("A: "+a +" B: "+b);
        print("X: "+x +" Y: "+y);
        print();

        print("Sqrt: " + Math.sqrt(a));
        print("Max: " + Math.max(a, b));
        print("Ceil: " + Math.ceil(x));
        print("cos 45: " + Math.cos(Math.toRadians(45)));
        print("tan 60: " + Math.tan(Math.toRadians(60)));
        print("acos 45: " + Math.acos(Math.toRadians(45)));
        print("Pow 100^20: " + Math.pow(a, b));
        print("Area of Circle (r=20) :"+ Math.round(Math.PI * Math.pow(b, 2)));

        double sin45  = Math.sin(Math.toRadians(45));

        print("aSin 45: "+ Math.toDegrees(Math.asin(sin45)));

    }
}