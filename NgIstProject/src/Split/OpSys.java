package Split;

/**
 * Created by beatriceotugo on 11/08/2017.
 */
public class OpSys {

    public String[] displayAllOpSys() {
        String systemNames = " Windows, Unix, Linux, MacOS, NovellNet, BSD";
        String[] names = systemNames.split(",");
        for(int x = 0; x<names.length; x++) {
            String name = names[x];
            System.out.println(name);

        }
            return names;

    }

    public void displaySystemsByVersions() {
        String systemVersions = " We sell all Different Versions of Operating systems as listed: all MicrosoftWindowsVersions all UnixVersions, all LinuxVersions, all MacOSVersions, all NovellNetwareVersions, all BSDVersions";
        String[] types = systemVersions.split("all");
        for(String type : types) {
            System.out.println(type);
        }
    }

    public void displaySpecificWords() {
        String systemWords = " all Windows all Unix all Linux all MacOS all NovellNet all BSD";
        String[] words = systemWords.split("all");
        for (int x = 0; x < words.length; x++) {

            if (words[x].toLowerCase().contains("x")) {
                System.out.println(words[x]);
                break;

            }
        }

    }
}
