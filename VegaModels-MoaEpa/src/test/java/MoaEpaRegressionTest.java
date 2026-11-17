import insilico.core.model.InsilicoModel;
import insilico.moa_epa.ismMoaEpa;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the MoaEpa model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class MoaEpaRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismMoaEpa());
    }
}
