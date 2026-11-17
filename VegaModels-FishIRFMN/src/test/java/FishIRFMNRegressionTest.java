import insilico.core.model.InsilicoModel;
import insilico.fish_irfmn.ismFishIRFMN;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the FishIRFMN model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class FishIRFMNRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismFishIRFMN());
    }
}
