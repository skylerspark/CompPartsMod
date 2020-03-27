package mod.sircode.computeparts;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(main.MODID)
public final class main {
	public static final String MODID = "computeparts";

	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public main() {
		LOGGER.debug("Hello from Example Mod!");
	}
}