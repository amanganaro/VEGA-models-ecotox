import insilico.core.model.InsilicoModel;
import insilico.guppy_knn.ismGuppyKnn;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the GuppyKnn model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class GuppyKnnRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismGuppyKnn());
    }
}
