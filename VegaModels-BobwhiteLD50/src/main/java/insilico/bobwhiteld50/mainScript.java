package insilico.bobwhiteld50;

import insilico.core.model.InsilicoModel;
import insilico.core.model.InsilicoModelOutput;
import insilico.core.molecule.conversion.SmilesMolecule;

import java.util.ArrayList;
import java.util.List;

public class mainScript {

    public static void main(String[] args) throws Exception {

        InsilicoModel model = new ismBobwhiteLD50();
        model.setSkipADandTSLoading(true);

        List<String> smilesList = new ArrayList<>();
        smilesList.add("FC(F)(F)Oc1ccc(cc1)C(O)(c1cncnc1)C(C)C");
        smilesList.add("N#CC(OC(=O)C(c1ccc(cc1)Cl)C(C)C)c1cccc(Oc2ccccc2)c1");
        smilesList.add("N#Cc1cc(c(OC(=O)CCC)c(c1)Br)Br");
        smilesList.add("C1(=C(C(C(=C1Cl)Cl)(C1(C(=C(C(=C1Cl)Cl)Cl)Cl)Cl)Cl)Cl)Cl");

        for(String smiles : smilesList) {
            InsilicoModelOutput out = model.Execute(SmilesMolecule.Convert(smiles));
            for(int i = 0; i < model.GetResultsName().length; i++){
                System.out.println(smiles);
                System.out.println(model.GetResultsName()[i] + " | " + out.getResults()[i]);
            }
        }
    }
}
