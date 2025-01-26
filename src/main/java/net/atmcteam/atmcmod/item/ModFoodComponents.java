package net.atmcteam.atmcmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent PURE_AMETHYST_APPLE = new FoodComponent.Builder().nutrition(4).saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 2), 1.0F).statusEffect(new StatusEffectInstance(
                    StatusEffects.HEALTH_BOOST, 6000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 6000),
                    1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 2), 1.0F).statusEffect(new StatusEffectInstance(
                            StatusEffects.STRENGTH, 6000), 1.0F).alwaysEdible().build();

    public static final FoodComponent PURE_AMETHYST_CARROT = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25F).build();
}
