import insilico.core.model.InsilicoModel;
import insilico.daphnia_ec50.ismDaphniaEC50;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the DaphniaEC50 model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class DaphniaEC50RegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismDaphniaEC50());
    }
}
