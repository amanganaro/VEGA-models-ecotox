import insilico.core.model.InsilicoModel;
import insilico.zebrafish_coral.ismZebrafishCoral;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the ZebrafishCoral model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class ZebrafishCoralRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismZebrafishCoral());
    }
}
