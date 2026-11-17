import insilico.core.model.InsilicoModel;
import insilico.fish_nic.ismFishNic;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the FishNIC model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class FishNICRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismFishNic());
    }
}
