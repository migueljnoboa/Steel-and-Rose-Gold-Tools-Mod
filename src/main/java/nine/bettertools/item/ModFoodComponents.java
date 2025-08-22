package nine.bettertools.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.registry.Registry;

public class ModFoodComponents {

    public static final ConsumableComponent ROSE_GOLD_COOKIE_CONSUMABLE_COMPONENT = ConsumableComponents.food()
            // The duration is in ticks, 20 ticks = 1 second
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SPEED, 10 * 20, 0), 1f))
            .build();

    public static final FoodComponent ROSE_GOLD_COOKIE_COMPONENT = new FoodComponent.Builder()
            .nutrition(4)
            .saturationModifier(8.6f)
            .build();
}
