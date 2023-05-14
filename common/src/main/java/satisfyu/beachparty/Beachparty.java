package satisfyu.beachparty;

import dev.architectury.hooks.item.tool.AxeItemHooks;
import dev.architectury.registry.CreativeTabRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import satisfyu.beachparty.event.CommonEvents;
import satisfyu.beachparty.registry.*;

public class Beachparty {
    public static final String MOD_ID = "beachparty";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final CreativeTabRegistry.TabSupplier BEACHPARTY_TAB = CreativeTabRegistry.create(new BeachpartyIdentifier("beachparty_tab"), () ->
            new ItemStack(ObjectRegistry.COCONUT_COCKTAIL.get()));

    public static void init() {
        ObjectRegistry.init();
        EntityRegistry.init();
        BlockEntityRegistry.init();
        BoatRegistry.init();
        RecipeRegistry.init();
        SoundEventRegistry.init();
        ScreenHandlerTypesRegistry.init();
        PlacerTypesRegistry.init();
        CommonEvents.init();

    }

    public static void commonSetup(){
        CompostablesRegistry.init();
        ObjectRegistry.commonInit();
        ItemGroupRegistry.addItems();

        AxeItemHooks.addStrippable(ObjectRegistry.PALM_LOG.get(), ObjectRegistry.STRIPPED_PALM_LOG.get());
        AxeItemHooks.addStrippable(ObjectRegistry.PALM_WOOD.get(), ObjectRegistry.STRIPPED_PALM_WOOD.get());
    }


}