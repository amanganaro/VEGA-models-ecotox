import insilico.core.model.InsilicoModel;
import insilico.algae_noec.ismAlgaeNOEC;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the AlgaeNoec model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class AlgaeNoecRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismAlgaeNOEC());
    }
}
