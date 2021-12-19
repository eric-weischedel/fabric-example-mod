package com.eweischedel.tutorial.registry;

import com.eweischedel.tutorial.Tutorial;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
  public static final Block TOPAZ_BLOCK = new Block(
      FabricBlockSettings
          .of(Material.GLASS)
          .breakByHand(true)
          .breakInstantly()
          .strength(5.0f, 30.0f)
          .sounds(BlockSoundGroup.GLASS)
          .luminance(3));

  public static void registerBlocks() {
    Registry.register(Registry.BLOCK, new Identifier(Tutorial.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
  }
}

