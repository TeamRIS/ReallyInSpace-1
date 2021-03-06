
package org.souldbminer.reallyinspace.itemgroup;

import org.souldbminer.reallyinspace.block.PortalBlock;
import org.souldbminer.reallyinspace.ReallyinspaceModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@ReallyinspaceModElements.ModElement.Tag
public class RISItemGroup extends ReallyinspaceModElements.ModElement {
	public RISItemGroup(ReallyinspaceModElements instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabris") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PortalBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
