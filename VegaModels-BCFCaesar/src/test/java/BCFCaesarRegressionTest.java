import insilico.core.model.InsilicoModel;
import insilico.bcf_caesar.ismBCFCaesar;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the BCFCaesar model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class BCFCaesarRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismBCFCaesar());
    }
}
