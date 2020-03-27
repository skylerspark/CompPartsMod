package mod.sircode.computeparts;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.sircode.computeparts.init.ModItemGroup;
import mod.sircode.computeparts.init.ModItems;

@Mod(main.MODID)
public final class main {
	public static final String MODID = "computeparts";

	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public main() {
		LOGGER.debug("Hello from Example Mod!");
	}
}