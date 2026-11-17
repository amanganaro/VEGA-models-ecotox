import insilico.core.model.InsilicoModel;
import insilico.algae_ec50.ismAlgaeEC50;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the AlgaeEC50 model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class AlgaeEC50RegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismAlgaeEC50());
    }
}
