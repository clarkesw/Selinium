public class Greeter2 {

    private INameService nameService;

    public String sayHello(){
        String txt = "Hello, ";
        txt += this.nameService.getName();
        return txt;
    }
    public INameService getNameService() {
        return nameService;
    }

    public void setNameService(INameService nameService) {
        this.nameService = nameService;
    }
}
