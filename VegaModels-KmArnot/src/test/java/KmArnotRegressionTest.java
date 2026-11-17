import insilico.core.model.InsilicoModel;
import insilico.km_arnot.ismKmArnot;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the KmArnot model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class KmArnotRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismKmArnot());
    }
}
