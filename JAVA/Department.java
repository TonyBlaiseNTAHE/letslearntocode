class Department {
    Department(int i)
    {
      System.out.println(i);
    }
    Department(float f)
    {
       System.out.println(f);
    }
    Department(double d)
    {
         System.out.println(d);
    }
    public static void main(String[] args) {
       Department d = new Department(10.6); 
    }
}