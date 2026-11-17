import insilico.core.model.InsilicoModel;
import insilico.algae_combaseclass.ismAlgaeCombaseClass;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the AlgaeCombaseClass model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class AlgaeCombaseClassRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismAlgaeCombaseClass());
    }
}
