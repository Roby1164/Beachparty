package satisfyu.beachparty.mixin.sign;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screens.inventory.HangingSignEditScreen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import satisfyu.beachparty.util.sign.TerraformHangingSign;

@Mixin(HangingSignEditScreen.class)
@Environment(EnvType.CLIENT)
public class MixinHangingSignEditScreen {
	@Shadow
	@Mutable
	private ResourceLocation texture;

	@Inject(method = "<init>", at = @At("TAIL"))
	private void initSignTextureId(SignBlockEntity signBlockEntity, boolean filtered, CallbackInfo ci) {
		if (signBlockEntity.getBlockState().getBlock() instanceof TerraformHangingSign) {
			ResourceLocation guiTexture = ((TerraformHangingSign) signBlockEntity.getBlockState().getBlock()).getGuiTexture();
			this.texture = new ResourceLocation(guiTexture.getNamespace(), guiTexture.getPath() + ".png");
		}
	}
}
