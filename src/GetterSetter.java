public class GetterSetter {
   int age;
    String name;

    public GetterSetter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
    	return this.age;
    }

public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
		GetterSetter gs1 = new GetterSetter("Betsy",51);
		GetterSetter gs2 = new GetterSetter("Sarah",49);
		String nameOut;
		nameOut = gs1.getName();
		System.out.println(nameOut);
		gs1.setName("John");
		nameOut = gs1.getName();
		System.out.println(nameOut);
	}
}
