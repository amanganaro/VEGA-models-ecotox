import insilico.core.model.InsilicoModel;
import insilico.fish_combase.ismFishCombase;
import regression.ModelRegressionTest;

import java.util.List;

/**
 * Regression test of the FishCombase model, see {@link ModelRegressionTest}.
 * Run with {@code mvn test -Pregression}; regenerate the references with {@code -Dgolden.update=true}.
 */
public class FishCombaseRegressionTest extends ModelRegressionTest {

    @Override
    protected List<InsilicoModel> getModels() throws Exception {
        return List.of(new ismFishCombase());
    }
}
