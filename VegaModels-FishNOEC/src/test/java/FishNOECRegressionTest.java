import insilico.core.model.InsilicoModel;
import insilico.fish_noec.ismFishNOEC;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the FishNOEC model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class FishNOECRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismFishNOEC());
    }
}
