package net.Lagunoblvde.MptMod.item;

import net.Lagunoblvde.MptMod.MptMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    //Переменная для регестрации предметов в моде.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));
    public static final RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));



    public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));
    public static final RegistryObject<Item> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));
    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));
    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));

    public static final RegistryObject<Item> AMBER_AXE = ITEMS.register("amber_axe",
            () -> new AxeItem(Tiers.IRON, 5, -3f, new Item.Properties().tab(ModCreativeModeTab.MPT_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
