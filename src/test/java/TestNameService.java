import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNameService implements INameService{
    private String Oname;

    public TestNameService(String name){
        this.Oname = name;
    }

    @Test
    public void TestMe(){
        TestNameService tn = new TestNameService("Jason");
        Greeter greeter = new Greeter(tn);
        Assert.assertEquals("Hello, Jason", greeter.sayHello());
    }

    public String getName() {
        return Oname;
    }

    public void setName(String name) {
        this.Oname = name;
    }
}
