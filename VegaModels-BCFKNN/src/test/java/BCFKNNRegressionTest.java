import insilico.core.model.InsilicoModel;
import insilico.bcf_knn.ismBCFKnn;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the BCFKNN model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class BCFKNNRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismBCFKnn());
    }
}
