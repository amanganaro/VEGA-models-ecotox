import insilico.core.model.InsilicoModel;
import insilico.bee_knn.ismBeeKnn;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the BeeKNN model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class BeeKNNRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismBeeKnn());
    }
}
