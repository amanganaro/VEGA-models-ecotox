import insilico.core.model.InsilicoModel;
import insilico.algae_combaseEC50.ismAlgaeCombaseEC50;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the AlgaeCombaseEC50 model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class AlgaeCombaseEC50RegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismAlgaeCombaseEC50());
    }
}
