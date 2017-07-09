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
        this.displayComputerPrice();
        this.displayBuildingDetails();
        System.out.println("I want to buy any reasonably priced " +BuildingName+ " in the market");
    }

    private void displayComputerPrice() {
        System.out.println("The price of the building is " +PriceOfBuilding);

    }

    private void displayBuildingDetails() {
        System.out.println("All relevant details are displayed");

    }

}
