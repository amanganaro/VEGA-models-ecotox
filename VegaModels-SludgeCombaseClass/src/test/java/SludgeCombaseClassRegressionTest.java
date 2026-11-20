import insilico.core.model.InsilicoModel;
import insilico.sludge_combaseclass.ismSludgeCombaseClass;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the SludgeCombaseClass model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class SludgeCombaseClassRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismSludgeCombaseClass());
    }
}
