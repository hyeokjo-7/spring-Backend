package Head22_;

public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    public void printMenu() {
        for (String item : menuService.getMenuList()) {
            System.out.println(item);
        }
    }
}
