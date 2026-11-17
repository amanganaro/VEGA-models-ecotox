import insilico.core.model.InsilicoModel;
import insilico.earthworm_toxicity.ismEarthworkToxicity;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the EarthwormToxicity model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class EarthwormToxicityRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismEarthworkToxicity());
    }
}
