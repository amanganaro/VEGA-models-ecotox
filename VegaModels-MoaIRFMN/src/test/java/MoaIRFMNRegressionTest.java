import insilico.core.model.InsilicoModel;
import insilico.moa_irfmn.ismMoaIrfmn;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the MoaIRFMN model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class MoaIRFMNRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismMoaIrfmn());
    }

    /** The model ships an empty training set, so only the core dataset applies. */
    @Override
    protected boolean hasTrainingSet() {
        return false;
    }
}
