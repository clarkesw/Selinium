public class Greeter {
    private INameService nameService;

    public Greeter(INameService nameService){
        this.nameService = nameService;
    }

    public String sayHello(){
        String txt = "Hello, ";
        txt += this.nameService.getName();
        return txt;
    }
}
