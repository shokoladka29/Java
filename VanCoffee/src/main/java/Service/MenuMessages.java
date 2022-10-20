package Service;

public interface MenuMessages {
    String MAIN_MENU = "Select what do you want to do (depends on number):\n" +
            "1: Add Coffee to van;\n" +
            "2: Find Coffee;\n" +
            "3: Sort according to cost/weight;\n" +
            "4: Show carrier;\n" +
            "0: Exit";
    String CHOOSE_SHAPE = "Select shape:\n" +
            "1: Beans ;\n" +
            "2: Milled;\n" +
            "3: instant;";

    String CHOOSE_PKG = "Choose the packing form : \n" +
            "1: Jar;\n" +
            "2: Package.";

    String CHOOSE_SORT = "Choose sort of coffe: \n" +
            "1: Coffea Arabica; \n" +
            "2: Coffea Canephora;\n" +
            "3: Coffea Liberica;\n" +
            "4: Coffea Dewevrei.";

    String TYPE_AMOUNT = "Type amount of packages: ";
    String TYPE_WEIGHT_OF_PKG = "Type weight of one package of coffee: ";
    String TYPE_COST_OF_ONE = "Type cost of one package";

    String WRONG_INPUT = "Wrong input !";

    String TYPE_MAX_AMOUT_MONEY = "Type maximum money emount : ";

    String VAN_IS_FULL = "Van is full , change amount of units.";
    String MONEY_IS_OVER = "We need more money , change smth .";

    String TYPE_MIN_COST = "Type minimal cost to search";
    String TYPE_MAX_COST = "Type maximum cost to search";
    String TYPE_MINWEIGHT_TO_SEARCH = "Type minimal weight to search";
    String TYPE_MAXWEIGHT_TO_SEARCH = "Type maximum weight to search";

    String SPACE = "Free space ";
    String FREE = "Free to spend ";


}