package Head23_;

public class DIExampleUsingInterface {
    public static void main(String[] args) {
        MenuService realService = new MenuServiceImpl();
        MenuController controller = new MenuController(realService);

        controller.prinstMenu();

        MenuService stubService = new MenuServiceStub();
        MenuController testController = new MenuController(stubService);
        testController.prinstMenu();
    }
}
