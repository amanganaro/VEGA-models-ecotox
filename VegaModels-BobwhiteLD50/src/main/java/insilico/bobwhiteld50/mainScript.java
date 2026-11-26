package insilico.bobwhiteld50;

import insilico.core.devops.ModelsDeployment;
import insilico.core.model.InsilicoModel;
import insilico.core.model.InsilicoModelOutput;
import insilico.core.molecule.conversion.SmilesMolecule;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class mainScript {

    public static void main(String[] args) throws Exception {

        InsilicoModel model = new ismBobwhiteLD50();

//        ModelsDeployment.BuildDataset(model, "out_ts");
//        File sourceFile = new File("out_ts/" + model.getInfo().getTrainingSetURL() + "/" + model.getInfo().getTrainingSetURL().split("/data/")[1]);
//        File destinationFile = new File("VegaModels-BobwhiteLD50\\src\\main\\resources\\data\\ts_bobwhite_ld50.dat");
//        try {
//            Files.move(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (Exception ex) {
//            System.err.println(ex.getMessage());
//        }

        for (int i=0; i<model.GetTrainingSet().getMoleculesSize(); i++) {
            InsilicoModelOutput out = model.Execute(SmilesMolecule.Convert(model.GetTrainingSet().getSMILES(i)));
            System.out.println(model.GetTrainingSet().getSMILES(i) + "\t" + out.getResults()[0]);
        }


//        List<String> smilesList = new ArrayList<>();
//        smilesList.add("FC(F)(F)Oc1ccc(cc1)C(O)(c1cncnc1)C(C)C");
//        smilesList.add("N#CC(OC(=O)C(c1ccc(cc1)Cl)C(C)C)c1cccc(Oc2ccccc2)c1");
//        smilesList.add("N#Cc1cc(c(OC(=O)CCC)c(c1)Br)Br");
//        smilesList.add("C1(=C(C(C(=C1Cl)Cl)(C1(C(=C(C(=C1Cl)Cl)Cl)Cl)Cl)Cl)Cl)Cl");
//
//        for(String smiles : smilesList) {
//            InsilicoModelOutput out = model.Execute(SmilesMolecule.Convert(smiles));
//            for(int i = 0; i < model.GetResultsName().length; i++){
//                System.out.println(smiles);
//                System.out.println(model.GetResultsName()[i] + " | " + out.getResults()[i]);
//            }
//        }
    }
}
