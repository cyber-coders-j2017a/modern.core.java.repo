package UtilityItems;

/**
 * Created by admin-batch-a on 7/27/17.
 */
public class Cat {
    public String[] getCatFamilies() {
        String catFamilies = "Lion,Tiger,Pussy Cat,Leopard,Cheetah,Jaguar,Puma";
        String [] families = catFamilies.split(",");

        for (int i = 0;i<families.length;i++){
            String family = families[i];

            // for(String family:families);

            System.out.println(family);

        }
return families;
    }
    }

