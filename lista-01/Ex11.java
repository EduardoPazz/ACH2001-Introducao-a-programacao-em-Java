class Ex11 {static int a,b,c;static void P(int x, int y) {a = x+y+a;System.out.println(x+" "+y+" "+a);}public static void main(String[] args) {a = 5;b = 8;c = 3;P(a,b);P(7,a+b+c);P(a*b,a%b);}}

/* I just found funny how this minimized code looks like, so I'll let this this way */