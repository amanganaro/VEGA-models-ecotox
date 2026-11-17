import insilico.core.model.InsilicoModel;
import insilico.fish_lc50.ismFishLC50;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the FishLC50 model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class FishLC50RegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismFishLC50());
    }
}
