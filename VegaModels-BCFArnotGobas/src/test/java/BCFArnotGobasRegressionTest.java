import insilico.core.model.InsilicoModel;
import insilico.bcf_arnotgobas.ismBCFArnotGobas;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the BCFArnotGobas model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class BCFArnotGobasRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismBCFArnotGobas());
    }
}
