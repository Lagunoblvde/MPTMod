package net.Lagunoblvde.MptMod.item;

import net.Lagunoblvde.MptMod.MptMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmor implements ArmorMaterial {
    AMBER("AMBER", 26, new int[]{5, 7 ,5 ,4 }, 25,
            SoundEvents.ARMOR_EQUIP_GOLD, 1f, 0f, ()-> Ingredient.of(ModItems.AMBER.get()));



    private final String name;
    private final int durabilityMultiplier;
    private final int [] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float thoghness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 14};

    ModArmor(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float thoghness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.thoghness = thoghness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MptMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.thoghness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
