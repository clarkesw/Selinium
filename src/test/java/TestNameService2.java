import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNameService2 implements INameService{

    private String Oname;

    public TestNameService2(String oname){
        this.setName(oname);
    }

    public void setName(String oname) {
        Oname = oname;
    }

    @Test
    public void TestMe(){

        TestNameService2 tn = new TestNameService2("Jason");

        Greeter2 greeter = new Greeter2();
        greeter.setNameService(tn);
        Assert.assertEquals("Hello, Jason", greeter.sayHello());
    }

    public String getName() {
        return Oname;
    }
}
