package recapCodes.rev02.ninepm;

import recapCodes.rev02.tenpm.UkGas;

/**
 * Created by dotcom on 6/23/17.
 */
public class RunnerUkGas {

    public static void main(String[] args) {
        UkGas eon = new UkGas();
        System.out.println(eon.certOfSuppliernNum);
        eon.certOfSuppliernNum = "G34-YT";
        eon.certOfSuppliernNum = "G34-TG";
        eon.certOfSuppliernNum = "HT-YT";
        eon.switchingSuppliers();
        eon.constantGasSuppliers();


        UkGas edf = new UkGas();
        System.out.println(edf.certOfSuppliernNum);
        edf.certOfSuppliernNum = "TF55559-g";
        edf.switchingSuppliers();


        UkGas anything = new UkGas();
        System.out.println(anything.certOfSuppliernNum);
        anything.certOfSuppliernNum = "TF55559-g";
        anything.switchingSuppliers();
    }
}
