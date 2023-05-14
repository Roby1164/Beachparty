package satisfyu.beachparty.util.sign.block;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.state.properties.WoodType;
import satisfyu.beachparty.util.sign.TerraformHangingSign;

public class TerraformHangingSignBlock extends CeilingHangingSignBlock implements TerraformHangingSign {
	private final ResourceLocation texture;
	private final ResourceLocation guiTexture;

	public TerraformHangingSignBlock(ResourceLocation texture, ResourceLocation guiTexture, Properties settings) {
		super(settings, WoodType.OAK);
		this.texture = texture;
		this.guiTexture = guiTexture;
	}

	@Override
	public ResourceLocation getTexture() {
		return texture;
	}

	@Override
	public ResourceLocation getGuiTexture() {
		return guiTexture;
	}
}
