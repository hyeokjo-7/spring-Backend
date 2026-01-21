package Head23_;

import Head23_.MenuService;

public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    public void prinstMenu() {
        for (String item : menuService.getMenuList()) {
            System.out.println(item);
        }
    }
}
