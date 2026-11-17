import insilico.core.model.InsilicoModel;
import insilico.fathead_epa.ismFatheadEPA;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the FatheadEPA model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class FatheadEPARegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismFatheadEPA());
    }
}
