import insilico.core.model.InsilicoModel;
import insilico.daphnia_noec.ismDaphniaNOEC;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the DaphniaNOEC model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class DaphniaNOECRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismDaphniaNOEC());
    }
}
