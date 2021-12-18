package com.eweischedel.tutorial.registry;

import com.eweischedel.tutorial.Tutorial;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
  public static final Item TOPAZ = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

  public static final BlockItem TOPAZ_BLOCK = new BlockItem(ModBlocks.TOPAZ_BLOCK,
      new Item.Settings().group(ItemGroup.DECORATIONS));

  public static void registerItems() {
    Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "topaz"), TOPAZ);
    Registry.register(Registry.ITEM, new Identifier(Tutorial.MOD_ID, "topaz_block"), TOPAZ_BLOCK);
  }
}
