import insilico.core.model.InsilicoModel;
import insilico.daphnia_demetra.ismDaphniaDemetra;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the DaphniaDemetra model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class DaphniaDemetraRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismDaphniaDemetra());
    }
}
