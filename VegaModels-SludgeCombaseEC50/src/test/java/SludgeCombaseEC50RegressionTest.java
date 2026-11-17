import insilico.core.model.InsilicoModel;
import insilico.sludge_combaseEC50.ismSludgeCombaseEC50;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the SludgeCombaseEC50 model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class SludgeCombaseEC50RegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismSludgeCombaseEC50());
    }
}
