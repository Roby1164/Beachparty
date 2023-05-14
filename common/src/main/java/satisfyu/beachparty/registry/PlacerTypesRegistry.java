package satisfyu.beachparty.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import satisfyu.beachparty.Beachparty;
import satisfyu.beachparty.util.worldgen.PalmFoliagePlacer;
import satisfyu.beachparty.util.worldgen.CrookedTrunkPlacer;

public class PlacerTypesRegistry {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES = DeferredRegister.create(Beachparty.MOD_ID, Registries.FOLIAGE_PLACER_TYPE);
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER_TYPES = DeferredRegister.create(Beachparty.MOD_ID, Registries.TRUNK_PLACER_TYPE);


    public static final RegistrySupplier<FoliagePlacerType<PalmFoliagePlacer>> PALM_FOLIAGE_PLACER = FOLIAGE_PLACER_TYPES.register("palm_foliage_placer" ,() -> new FoliagePlacerType<>(PalmFoliagePlacer.CODEC));
    public static final RegistrySupplier<TrunkPlacerType<CrookedTrunkPlacer>> CROOKED_TRUNK_PLACER = TRUNK_PLACER_TYPES.register("crooked_trunk_placer" ,() -> new TrunkPlacerType<>(CrookedTrunkPlacer.CODEC));

    public static void init() {
        FOLIAGE_PLACER_TYPES.register();
        TRUNK_PLACER_TYPES.register();
    }
}
