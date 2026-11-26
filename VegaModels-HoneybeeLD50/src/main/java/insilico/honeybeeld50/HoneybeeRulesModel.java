package insilico.honeybeeld50;

import insilico.core.exception.InitFailureException;
import insilico.core.molecule.InsilicoMolecule;
import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.isomorphism.Pattern;
import org.openscience.cdk.smarts.SmartsPattern;

import java.util.ArrayList;

public class HoneybeeRulesModel {

    private record HoneybeeRule(String SMARTS, String Goal, String LR, Pattern SA) {}

    private final static String[][] RULES = {
        {"COP=O", "TOXIC", "1.00"},
        {"CC(CC(=O)OCc1ccccc1)C", "TOXIC", "1.00"},
        {"[O-]([N+])(=O)N", "TOXIC", "1.00"},
        {"CC(=O)Nc1ccccc1", "NON TOXIC", "1.00"},
        {"OC=CC=O", "NON TOXIC", "1.00"},
        {"COCCOc1ccccc1Cl", "NON TOXIC", "1.00"},
        {"Cc1cnn(c1)C", "NON TOXIC", "1.00"},
        {"Cc1ccnn1", "TOXIC", "1.00"},
        {"Nc1cccc(c1)O", "NON TOXIC", "1.00"},
        {"CSC=O", "NON TOXIC", "1.00"},
        {"FC(c1cccnc1)(F)F", "NON TOXIC", "1.00"},
        {"NC=C(C)C", "NON TOXIC", "1.00"},
        {"O=CNc1cccc(c1)Cl", "NON TOXIC", "1.00"},
        {"ClCCl", "NON TOXIC", "1.00"},
        {"O=C(c1ccccc1)NC(C)(C)C", "NON TOXIC", "1.00"},
        {"Nc1cccc(c1)C(F)(F)F", "NON TOXIC", "1.00"},
        {"CC(=O)NCc1ccccc1", "NON TOXIC", "1.00"},
        {"OC(=O)Cc1ccccc1", "NON TOXIC", "1.00"},
        {"CCc1cccc(c1)C", "TOXIC", "1.00"},
        {"O=Cc1ccccn1", "NON TOXIC", "1.00"},
        {"CC(=O)NN", "NON TOXIC", "1.00"},
        {"CSC=N", "TOXIC", "1.00"},
        {"Nc1ccccc1Cl", "NON TOXIC", "1.00"},
        {"CCCc1ccccc1", "TOXIC", "0.88"},
        {"Cc1ccccc1O", "NON TOXIC", "1.00"},
        {"COCN", "NON TOXIC", "1.00"},
        {"O=CNc1ccccc1", "NON TOXIC", "1.00"},
        {"COc1ccncn1", "NON TOXIC", "0.88"},
        {"CCCCCO", "NON TOXIC", "0.83"},
        {"COP=S", "TOXIC", "0.83"},
        {"c1ccncn1", "NON TOXIC", "0.86"},
        {"CCNC=O", "NON TOXIC", "0.83"},
        {"CCOC(=O)CO", "NON TOXIC", "0.80"},
        {"Cc1ccc(cc1)O", "TOXIC", "0.80"}
    };

    private final ArrayList<HoneybeeRule> rules;

    public HoneybeeRulesModel() throws InitFailureException {
        rules = new ArrayList<>();
        for (String[] s : RULES)
            rules.add(new HoneybeeRule(s[0], s[1], s[2], SmartsPattern.create(s[0], DefaultChemObjectBuilder.getInstance()).setPrepare(false)));
    }

    public String Predict(InsilicoMolecule mol) throws Exception {

        String pred = "NA";
        for (HoneybeeRule rule : rules)
            if (rule.SA.matches(mol.GetStructure())) {
                return rule.Goal;
            }
        return "NA";
    }
}
