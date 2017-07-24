package OOPConcept3;

/**
 * Created by beatriceotugo on 07/07/2017.
 */
public class Building {

    private int numOfBuildings;
    private String BuildingName;
    private Double PriceOfBuilding;

    public Building(int numOfBuildings, String buildingName, Double priceOfBuilding) {
        this.numOfBuildings = numOfBuildings;
        this.BuildingName = buildingName;
        this.PriceOfBuilding = priceOfBuilding;

    }

    public void buyBuilding() {
        System.out.println("I want to buy any reasonably priced " +BuildingName+ " in the market");
        this.displayComputerPrice();
        this.displayBuildingDetails();
    }

    private void displayComputerPrice() {
        System.out.println("The price of the building is " +PriceOfBuilding);

    }

    private void displayBuildingDetails() {
        System.out.println("All relevant details of the " +BuildingName+ " are displayed");

    }

}
