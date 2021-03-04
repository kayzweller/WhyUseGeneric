public class ComparisonApp {
  public static void main(String[] args) {

    ClassWithoutGeneric object = new ClassWithoutGeneric(34, "Budi");
    System.out.println(object.getNumber());
    System.out.println(object.getString());

//    object = new ClassWithoutGeneric("Budi", 34); //. ERROR
    System.out.println();

    ClassWithObject object1 = new ClassWithObject(34, "Budi");
    Integer objVal1 = (Integer) object1.getData1();
    String objVal2 = (String) object1.getData2();
    System.out.println(objVal1);
    System.out.println(objVal2);

//    object1 = new ClassWithObject("Budi", 34); //. THIS CREATE ERROR AT RUNTIME
//     objVal1 = (Integer) object1.getData1();
//     objVal2 = (String) object1.getData2();
//     System.out.println(objVal1);
//     System.out.println(objVal2);
    System.out.println();

    ClassWithGeneric<Integer, String> object2 = new ClassWithGeneric<>(34, "Budi");
    System.out.println(object2.getData1());
    System.out.println(object2.getData2());

//    object2 = new ClassWithGeneric<String, Integer>("Budi", 34); //. ERROR
    System.out.println();

  }

  public static class ClassWithoutGeneric {

    private int number;
    private String string;

    public ClassWithoutGeneric(int number, String string) {
      this.number = number;
      this.string = string;
    }

    public int getNumber() {
      return number;
    }

    public void setNumber(int number) {
      this.number = number;
    }

    public String getString() {
      return string;
    }

    public void setString(String string) {
      this.string = string;
    }
  }

  public static class ClassWithObject {

    private Object Data1;
    private Object Data2;

    public ClassWithObject(Object data1, Object data2) {
      Data1 = data1;
      Data2 = data2;
    }

    public Object getData1() {
      return Data1;
    }

    public void setData1(Object data1) {
      Data1 = data1;
    }

    public Object getData2() {
      return Data2;
    }

    public void setData2(Object data2) {
      Data2 = data2;
    }
  }

  public static class ClassWithGeneric<T, U> {

    private T data1;
    private U data2;

    public ClassWithGeneric(T data1, U data2) {
      this.data1 = data1;
      this.data2 = data2;
    }

    public T getData1() {
      return data1;
    }

    public void setData1(T data1) {
      this.data1 = data1;
    }

    public U getData2() {
      return data2;
    }

    public void setData2(U data2) {
      this.data2 = data2;
    }
  }

}
