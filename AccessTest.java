class AccessTest {
  public static void main(String[] args) {
    Test ob = new Test();
    ob.a = 20;
    ob.b = 20;

    //ob.c = 100;

    ob.setc(100);

  System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getc());
  }
//return;
  }

class Test {
int a;          // default access
public int b;   // public access
private int c;  // private access

// methods to access c
void setc(int i) {
c = i;
}

int getc() {
return c;
}

}
