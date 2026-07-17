import insilico.core.model.InsilicoModel;
import insilico.core.model.InsilicoModelOutput;
import insilico.core.molecule.conversion.SmilesMolecule;
import insilico.sduckweedec50coral.ismSDuckweedEC50Coral;

import java.util.ArrayList;
import java.util.List;

public class mainScript {

    public static void main(String[] args) throws Exception {
        InsilicoModel model = new ismSDuckweedEC50Coral();

        List<String> smilesList = new ArrayList<>();
        smilesList.add("O=C2C(c1cccc(c1)C(F)(F)F)=C(OC2c3ccccc3)NC");
        smilesList.add("O=[N+]([O-])c1cc(cc(c1N(CCC)CCC)[N+](=O)[O-])S(=O)(=O)C");
        smilesList.add("O=S(=O)(N)c1cc2c(cc1C(F)(F)F)NC(NS2(=O)(=O))Cc3ccccc3");
        smilesList.add("O=[N+]([O-])c1cc(c(O)c(c1)C(C)(C)C)[N+](=O)[O-]");
        smilesList.add("O=S(=O)(C(C)(C)C)C(C)(C)C");

        for(String smiles : smilesList) {
            InsilicoModelOutput out = model.Execute(SmilesMolecule.Convert(smiles));
            for(int i = 0; i < model.GetResultsName().length; i++){
                System.out.println(smiles);
                System.out.println(model.GetResultsName()[i] + " | " + out.getResults()[i]);
            }
        }
    }
}
