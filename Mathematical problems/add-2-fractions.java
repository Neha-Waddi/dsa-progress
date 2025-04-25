class GfG {
    void addFraction(int num1, int den1, int num2, int den2) {
        // Your code here
        int den=lcm(den1,den2);
        int num=(den/den1)*(num1)+ (den/den2)*(num2);
        int gcd = gcd(num, den);
        num /= gcd;
        den /= gcd;
        System.out.println(num +"/" + den);
        
    }
    static int lcm(int a,int b){
        int g=gcd(a,b);
        return (a*b)/g;
    }
    static int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}