package insilico.bobwhiteld50;

import insilico.core.exception.InitFailureException;
import insilico.core.molecule.InsilicoMolecule;
import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.isomorphism.Pattern;
import org.openscience.cdk.smarts.SmartsPattern;

import java.util.ArrayList;

public class BobWhiteRulesModel {

    private record BobwhiteRule(String SMARTS, String Goal, String LR, Pattern SA) {}

    private final static String[][] RULES_H = {
        {"O=CCC", "INACTIVE", "inf"},
        {"P(=O)(OC)", "ACTIVE", "inf"},
        {"C(C)COC", "INACTIVE", "inf"},
        {"NCN", "INACTIVE", "inf"},
        {"OP(=S)(OCC)OCC", "ACTIVE", "inf"},
        {"Oc2ccc(cc2Cl)", "INACTIVE", "inf"},
        {"OP(OC)OC", "ACTIVE", "24.92"},
        {"c1cncnc1", "INACTIVE", "1.18"},
        {"C(c1ccccc1)CC(O)", "INACTIVE", "inf"},
        {"N(CCC)C", "INACTIVE", "inf"},
        {"O=C(Oc1cc(c(c(c1))))NC", "ACTIVE", "inf"},
        {"O=CCS", "ACTIVE", "inf"},
        {"Cc1ccccc1Cl", "INACTIVE", "inf"},
        {"c1cc(ccc1C)C", "INACTIVE", "inf"},
        {"n1c(nc(nc1))NC", "INACTIVE", "inf"}
    };

    private final static String[][] RULES_L = {
        {"P(OCC)", "ACTIVE", "inf"},
        {"O=CC(=COC)c1ccccc1", "INACTIVE", "inf"},
        {"c2ccc(cc2)Br", "ACTIVE", "inf"},
        {"P(=O)", "ACTIVE", "inf"},
        {"C(c1ccc(cc1)Cl)C(C)C", "ACTIVE", "inf"},
        {"C(CNC(c1ccc(cc1)))C", "INACTIVE", "inf"},
        {"c1nc(OC)cc(n1)OC", "INACTIVE", "inf"},
        {"Fc1ccc(cc1)", "INACTIVE", "inf"},
        {"NN(C)C(C)", "INACTIVE", "inf"},
        {"c2ccc(cc2)c2ccccc2", "ACTIVE", "inf"},
        {"O=C(O)COc1ccc(cc1)Cl", "ACTIVE", "inf"},
        {"Oc1cccc(c1)Cl", "ACTIVE", "inf"},
        {"C(N(CCOC))", "ACTIVE", "inf"},
        {"C(C(Cl))Cl", "ACTIVE", "inf"},
        {"O=C(Oc1cc(c(c(c1))))NC", "ACTIVE", "inf"},
        {"O=[N+]([O-])c1ccc(O)cc1", "ACTIVE", "inf"},
        {"Nc1ccc(c(c1)Cl)", "ACTIVE", "inf"},
        {"CSP(=S)(OC)OC", "ACTIVE", "inf"},
        {"SCCC", "ACTIVE", "inf"},
        {"CC#C", "ACTIVE", "inf"}
    };

    private final ArrayList<BobwhiteRule> rulesH;
    private final ArrayList<BobwhiteRule> rulesL;

    public BobWhiteRulesModel() throws InitFailureException {
        rulesH = new ArrayList<>();
        rulesL = new ArrayList<>();
        for (String[] s : RULES_H)
            rulesH.add(new BobwhiteRule(s[0], s[1], s[2], SmartsPattern.create(s[0], DefaultChemObjectBuilder.getInstance()).setPrepare(false)));
        for (String[] s : RULES_L)
            rulesL.add(new BobwhiteRule(s[0], s[1], s[2], SmartsPattern.create(s[0], DefaultChemObjectBuilder.getInstance()).setPrepare(false)));
    }

    public String Predict(InsilicoMolecule mol) throws Exception {

        String H = "NA";
        for (BobwhiteRule rule : rulesH)
            if (rule.SA.matches(mol.GetStructure())) {
                H = rule.Goal;
                break;
            }

        String L = "NA";
        for (BobwhiteRule rule : rulesL)
            if (rule.SA.matches(mol.GetStructure())) {
                L = rule.Goal;
                break;
            }

        if (L.equalsIgnoreCase("INACTIVE") && H.equalsIgnoreCase("INACTIVE")) return "L";
        if (L.equalsIgnoreCase("INACTIVE") && H.equalsIgnoreCase("ACTIVE")) return "H";
        if (L.equalsIgnoreCase("ACTIVE") && H.equalsIgnoreCase("ACTIVE")) return "H";
        if (L.equalsIgnoreCase("ACTIVE") && H.equalsIgnoreCase("INACTIVE")) return "M";
        if (L.equalsIgnoreCase("NA") && H.equalsIgnoreCase("ACTIVE")) return "H";
        if (L.equalsIgnoreCase("INACTIVE") && H.equalsIgnoreCase("NA")) return "L";
        if (L.equalsIgnoreCase("NA") && H.equalsIgnoreCase("INACTIVE")) return "L";
        if (L.equalsIgnoreCase("ACTIVE") && H.equalsIgnoreCase("NA")) return "H";
        if (L.equalsIgnoreCase("NA") && H.equalsIgnoreCase("NA")) return "NA";

        return "NA";
    }
}
