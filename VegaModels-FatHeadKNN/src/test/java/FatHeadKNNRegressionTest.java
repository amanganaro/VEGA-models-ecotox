import insilico.core.model.InsilicoModel;
import insilico.fathead_knn.ismFatheadKnn;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the FatHeadKNN model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class FatHeadKNNRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismFatheadKnn());
    }
}
