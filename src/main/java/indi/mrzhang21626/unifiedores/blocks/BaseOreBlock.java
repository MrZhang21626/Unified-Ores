package indi.mrzhang21626.unifiedores.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;

public class BaseOreBlock extends OreBlock {
    public final int harvestLevel;

    public BaseOreBlock(int harvestLevel, UniformInt xp) {
        super(Properties.of(Material.STONE).strength(3.0f, 3.0f).requiresCorrectToolForDrops(), xp);
        this.harvestLevel = harvestLevel;
    }

    public BaseOreBlock(int harvestLevel) {
        this(harvestLevel, UniformInt.of(0, 0));
    }
}
